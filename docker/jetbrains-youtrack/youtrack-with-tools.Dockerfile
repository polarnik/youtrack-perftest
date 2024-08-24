FROM jetbrains/youtrack:2024.2.38971
RUN /bin/sh -c apt-get update && apt-get install -y curl && rm -rf /var/lib/apt/lists/*