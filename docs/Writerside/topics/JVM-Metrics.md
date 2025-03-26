# JVM

The main link:
https://prometheus.github.io/client_java/instrumentation/jvm/

## JVM Buffer Pool Metrics (java.lang.management.BufferPoolMXBean)

- jvm_buffer_pool_capacity_bytes
- jvm_buffer_pool_used_buffers
- jvm_buffer_pool_used_bytes

## JVM Class Loading Metrics (java.lang.ClassLoading)

- jvm_classes_currently_loaded
- jvm_classes_loaded_total
- jvm_classes_unloaded_total

It used java.lang:type=ClassLoading:
- LoadedClassCount
- TotalLoadedClassCount
- UnloadedClassCount

## JVM Compilation Metrics

- jvm_compilation_time_seconds_total

## JVM Garbage Collector Metrics

- jvm_gc_collection_seconds_count
- jvm_gc_collection_seconds_sum

Additional info about pools

| Garbage Collector name | Memory pool name                          |
|------------------------|-------------------------------------------|
| G1 Concurrent GC       | G1 Old Gen                                |
| G1 Old Generation      | G1 Old Gen, G1 Eden Space, Survivor Space |
| G1 Young Generation    | G1 Old Gen, G1 Eden Space, Survivor Space |
 

| Memory pool name | Memory Manager names | Type |
|------------------|----------------------|------|
| 


- name=G1 Concurrent GC
  - G1 Old Gen
- name=G1 Old Generation
  - G1 Eden Space 
  - G1 Survivor Space 
  - G1 Old Gen
- name=G1 Young Generation
  - G1 Eden Space
  - G1 Survivor Space
  - G1 Old Gen

## JVM Memory Metrics

Additional info about pools

MemoryManagers:
- CodeCacheManager
  - CodeHeap 'non-nmethods'
  - CodeHeap 'profiled nmethods'
  - CodeHeap 'non-profiled nmethods'
- Metaspace Manager
  - Metaspace
  - Compressed Class Space
- G1 Old Generation
  - G1 Eden Space
  - G1 Old Gen
  - G1 Survivor Space
- G1 Young Generation
  - G1 Eden Space
  - G1 Old Gen
  - G1 Survivor Space
- G1 Concurrent GC
  - G1 Old Gen 

Heap/Non-Heap:
- NON_HEAP
  - CodeHeap 'non-nmethods'
  - 
- HEAP