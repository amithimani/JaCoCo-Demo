# Jacoco Demo Project

This project demonstrates how to use the Jacoco code coverage tool with a Spring Boot application. 

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Building and Running the Application

1. Clone the repository: `git clone https://github.com/{username}/{repo-name}.git`
2. Navigate to the project directory: `cd {repo-name}`
3. Build the application: `mvn clean install`
4. Run the application: `java -jar target/{jar-file-name}.jar`
5. Building App with Sonar `mvn clean verify sonar:sonar \
   -Dsonar.projectKey={PROJECT_KEY} \
   -Dsonar.projectName={'PROJECT_NAME'} \
   -Dsonar.host.url=http://localhost:9000 \
   -Dsonar.token={API_TOKEN}`

### Code Coverage Reporting

Jacoco is configured to generate code coverage reports during the build process. To view the reports, navigate to `target/site/jacoco/index.html`.

### Read the blog post for more details 

To read the full blog post about using Jacoco with a Spring Boot application, visit: https://example.com/blog/jacoco-spring-boot

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request with your changes.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.
