# fibonacci

Simple Java CLI program that prints the first **100** Fibonacci numbers by default.
The Fibonacci sequence is an infinite series of numbers starting with 0 and 1, where each subsequent number is the sum of the two preceding ones: (0,1,1,2,3,5,8,13,21,34,...). 
It is named after Leonardo of Pisa and is characterized by a "golden ratio" (approx 1.618) as numbers increase, appearing frequently in nature, such as in pinecones, sunflowers, and shells. 

### Requirements

- **JDK 17+**: required to compile/run this project (the `pom.xml` targets Java 17).
- **Maven**: only required if you want to run unit tests. Maven 3.9+ requires **JDK 8+** to execute.

### Build + run (no Maven required)

Compile:

```bash
javac src/main/java/Fibonacci.java
```

Run (default 100):

```bash
java -cp src/main/java Fibonacci
```

Run (custom count):

```bash
java -cp src/main/java Fibonacci 25
```

### Unit tests (Maven + JUnit)

To run tests, you must have **Maven** installed: `https://maven.apache.org/`

Run tests: 

```bash
mvn test
```



But can I submit a PR??