# spring-boot-rest
Spring boot sample application.

## How to run with spring profiles.

### Default for dev
./gradlew bootRun

### QA
./gradlew bootRun -Dspring.profiles.active=qa

### Production
./gradlew bootRun -Dspring.profiles.active=production