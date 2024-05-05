# java-maven-starter
![Build](https://github.com/rbento/java-maven-starter/actions/workflows/maven.yml/badge.svg)

A starter template for Java SE projects managed with Maven.

### Features
---

- Simple project structure.
- File based logs.
- Sample unit tests.

### Dependencies
---

- [Java 21][1]
  > The Java® programming language is a general-purpose, concurrent, class-based, object-oriented language.
- [Maven][2]
  > Apache Maven is a software project management and comprehension tool.
- [Lombok][3]
  > Project Lombok is a java library that automatically plugs into your editor and build tools, spicing up your Java.
- [Logback][4]
  > Logback is intended as a successor to the popular log4j project.
- [JUnit 5][5]
  > The JUnit Platform serves as a foundation for launching testing frameworks on the JVM.
- [AssertJ][6]
  > AssertJ core is a Java library that provides a fluent interface for writing assertions.

### Build
---

```bash
mvn clean package
```

### Run
---

```bash
mvn exec:java -Dexec.mainClass="rbento.Program"
```
[1]: https://openjdk.org/projects/jdk/19/
[2]: https://maven.apache.org/download.cgi
[3]: https://projectlombok.org
[4]: https://logback.qos.ch
[5]: https://junit.org/junit5/
[6]: https://joel-costigliola.github.io/assertj/assertj-core.html

### Test Report
---

```bash
mvn surefire-report:report
```
