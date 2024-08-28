""" Converts Stackoverflow Dump XML files to CSV
Written by:     Mark Takacs
Created:        August, 2018

*** This script requires Python 3.6+! ***

Configured to process the following data types:
    - Posts
    - PostLinks
    - Tags
    - Users


Getting started:
    1. Download the Stackoverflow data files from the Internet Archive Stackexchange directory listing (https://archive.org/download/stackexchange). The Stackoverflow dump files are released every 3 months, so you may download a new version of the archives regularly.
    On the Internet Archive Stackexchange directory listing web page scroll down to the files that start with "stackoverflow.com-" and click the links to download. The archive offers the following files as of January 2020:
        - stackoverflow.com-Badges.7z
        - stackoverflow.com-Comments.7z
        - stackoverflow.com-PostHistory.7z
        - stackoverflow.com-PostLinks.7z
        - stackoverflow.com-Posts.7z
        - stackoverflow.com-Tags.7z
        - stackoverflow.com-Users.7z
        - stackoverflow.com-Votes.7z
    You need about 50G free space to download all files.
    2. Unzip the files with a utility that can handle 7zip, like P7ZIP on Linux and MacOS or 7-Zip on Windows. The extracted files are in XML format. You can convert these files to CSV with this script.
    3. In your terminal go to the directory that contains the unarchived files and run the converter as described below in the "How to use the converter" section.
    4. Import the CSV files to a relational database or query the data them with a tool like Python Pandas.


How to use the converter:
    - The converter consists of 3 key files:
        1. converter            The executable converter script written in Python - this file.
        2. meta.json            Contains the number of lines in each XML archive - this information is used in the progress bar, you can turn off the progress bar as described below.
        3. config.json          Contains the conversion configuration of each data type - specify here which columns you want to include in your CSV, add data transformation rules to fix data issues.
"""
import os.path
import xml.etree.ElementTree as et
from tqdm import tqdm
import codecs
import operator
from markdownify import markdownify as md

from utils import *
from constants import ops

# no arguments received
if len(sys.argv) == 1:
    print_usage("Error: Converter requires at least two arguments.")

# extract command line arguments
force_overwrite, limit_columns, apply_filters, filename, workdir, release = init_from_arguments(sys.argv[1:])
print("Info: Command line arguments extracted.")

# read meta information
meta = read_meta_from_file()
print("Info: Meta information read from file.")

# read config information
config = read_config_from_file(filename)
print("Info: Config information read from file.")

# count lines in input file
line_count: int

if not release or not release in meta or not filename in meta[release]["line_count"]:
    line_count = count_lines_in_file(workdir, filename)
    if release :
        if not release in meta:
            meta[release] = {
                "line_count": {
                    filename: line_count
                }
            }
        else:
            meta[release]["line_count"][filename] = line_count
        update_meta_file(meta)
else:
    line_count = meta[release]["line_count"][filename]

print("Info: Line count acquired.")

#========================================
# conversion logic starts here
#========================================
input_file = workdir.rstrip("/") + "/" + filename + ".xml"
output_file = workdir.rstrip("/") + "/" + filename + ".csv"

# check if the output file exists and remove it if force_overwrite is turned on
if os.path.isfile(output_file):
    if force_overwrite:
        print("Info: Output file already exists. Removing output file, because the converter is running with the '-f' option.")
        os.remove(output_file)
        print("Info: {} removed from disk.".format(output_file))
    else:
        sys.exit("Error: Output file already exists. Please remove the file or run the converter with the '-f' (or '--force') option.")
    
# create iterator for the input file
xml_iter = et.iterparse(input_file, events=('start', 'end'))

# open the output file for writing
try:
    output = codecs.open(output_file, "w", "utf-8")
except:
    sys.exit("Error: Failed to open outpout file for conversion.")
print("Info: Output file opened for writing.")

output_buffer = []  #in-memory buffer to store converted items
buffer_size = 1000  #write to file after buffer_size items are collected in the output_buffer
delimiter=","       #delimiter in output file
tag = "row"         #XML tag to be processed
#n = 0

# initialize column list, limit to includes, if existst in config, otherwise use all columns list in config headers
columns = config["headers"]
markdown = config["markdown"]

if limit_columns:
    if "include" in config:
        columns = config["include"]
    else:
        print("Info: Running with limit columns option, but no 'include' key in config. Reverting to all columns.")

output.write(delimiter.join(columns) + '\n')
print("Info: File initialized with headers.")

print("Info: Converting.")
with tqdm(total=line_count, unit="lines") as pbar:
    for event, elem in xml_iter:
        if event == "end":
            if elem.tag == tag:
                #collect items from element
                items = []
                
                skip_record = False #enables filter functionality

                #extract all columns form XML line
                for header in columns:
                    data = elem.get(header, "")
                    if apply_filters and "filters" in config and header in config["filters"]:
                        op_function = ops[config["filters"][header][0]]
                        if not op_function(data, config["filters"][header][1]):
                            skip_record = True
                    if header in markdown:
                        data = md(data)
                    if "fixes" in config and header in config["fixes"]:
                       data = re.sub(config["fixes"][header][0], config["fixes"][header][1], data)
                    items.append(data)

                if not skip_record:
                    #append record to output buffer
                    output_buffer.append(r'"' + (r'"' + delimiter + r'"').join(items) + r'"')

                #manage limit
                #n += 1
                #if n == limit:
                #    break

                #write to file if buffer full
                if len(output_buffer) >= buffer_size:
                    output.write('\n'.join(output_buffer) + '\n')
                    output_buffer = []

            elem.clear()
            pbar.update(1)

output.write('\n'.join(output_buffer) + '\n')
# close output file
output.close()

print("Info: All done.")
sys.exit(0)

