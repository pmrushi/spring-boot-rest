# spring-boot-rest
Spring boot sample application.

## How to run with spring profiles.

### Build Project
./gradlew build

### Default for dev
./gradlew bootRun

### QA
./gradlew bootRun --args=--spring.profiles.active=qa

### Production
./gradlew bootRun --args=--spring.profiles.active=production

### Run checks
./gradlew check

### Upgrade Gradle
./gradlew wrapper --gradle-version 5.6.2

### Download JAVA 12
https://www.oracle.com/technetwork/java/javase/downloads/jdk12-downloads-5295953.html