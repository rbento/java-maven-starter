# java-maven-starter
![Build](https://github.com/rbento/java-maven-starter/actions/workflows/ci.yml/badge.svg)

A starter template for Java SE projects.

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

### Test Report
---

```bash
mvn surefire-report:report
```

### Dependencies
---

[Java 21][1]  
- The Java® programming language is a general-purpose, concurrent, class-based, object-oriented language.

[Maven][2]  
- A software project management and comprehension tool.

[Lombok][3]  
- A java library that automatically plugs into your editor and build tools, spicing up your Java.

[Logback][4]  
- Intended as a successor to the popular log4j project.

[JUnit 5][5]  
- The JUnit Platform serves as a foundation for launching testing frameworks on the JVM.

[AssertJ][6]  
- A Java library that provides a fluent interface for writing assertions.

[Polyglot for Maven][7]    
- A set of extensions for Maven 3.3.1+ that allows the POM model to be written in dialects other than XML. 
- Using polyglot-yaml. See the [pom.yaml](https://github.com/rbento/java-maven-starter/blob/main/pom.yaml) file for details.

[1]: https://openjdk.org/projects/jdk/19/
[2]: https://maven.apache.org/download.cgi
[3]: https://projectlombok.org
[4]: https://logback.qos.ch
[5]: https://junit.org/junit5/
[6]: https://joel-costigliola.github.io/assertj/assertj-core.html
[7]: https://github.com/takari/polyglot-maven
