# Example Spring (R) application to demonstrate the behavior of ExecutorServiceAdapter

## How to run

```bash
./gradlew run
```

## Outcome
```text
Jan. 27, 2023 1:41:44 PM org.springframework.beans.factory.support.DisposableBeanAdapter invokeCustomDestroyMethod
WARNUNG: Custom destroy method 'shutdown' on bean with name 'executorService' threw an exception: java.lang.IllegalStateException: Manual shutdown not supported - ExecutorServiceAdapter is dependent on an external lifecycle
```
