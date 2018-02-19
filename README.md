### Reproducal repo for issue with maven surefire plugin 2.20

This is a reproducal for https://github.com/allegro/embedded-elasticsearch/issues/33

In order to see the issues run

```
./mvnw clean install
```

And you will get:

>[WARNING] Corrupted STDOUT by directly writing to native stream in forked JVM 1. See FAQ web page and the dump file /Users/filiphr/projects/embedded-elasticsearch-maven-issue/target/surefire-reports/2018-02-19T23-39-23_589-jvmRun1.dumpstream

from maven
