# Sources

- https://github.com/takacsmark/stackoverflow-dump-csv-converter
  - changes: add Markdown format
- https://archive.org/details/stackexchange
  - softwareengineering.stackexchange.com.7z (363 MByte)

# Command

```shell
python ./converter.py \
    --apply-filters \
    --limit-columns \
    --force \
    Posts \
    /media/qa/data2/data/Project/github.com/polarnik/yourtrack-perftest/datasources/small/
```

pip3 install tqdm
pip3 install markdownify
```shell
cd ./converter/
python3 converter.py \
    --apply-filters \
    --limit-columns \
    --force \
    Posts \
    /Users/Viacheslav.Smirnov/IdeaProjects/github.com/polarnik/youtrack-perftest/datasources/ru.stackoverflow/

```