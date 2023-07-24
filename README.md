**TradeMe Automation Project README**

This project was developed as part of a technical exam.
This repository contains an automation solution for the TradeMe website using Selenium and Java. The project verifies the number of car makes available in the Make dropdown box on the car search tab of the motor search page. Additionally, it provides the number of cars returned when you search for specific car makes such as Citroen, Austin, and Chevrolet.


**Requirements**
To run this project, make sure you have the following installed on your machine:

Java 18
Gradle

**Dependencies**
The project uses the following dependencies, which are managed using Gradle:

Selenium Java (Version 3.141.59) - for web automation
Cucumber Java (Version 7.12.1) - for BDD testing
SLF4J Simple (Version 1.7.25) - for logging

**Project Structure**
The project is structured as follows:

lua
Copy code
|-- src
|   |-- test
|   |   |-- java
|   |   |   |-- pages
|   |   |   |   |-- BasePage.java
|   |   |   |   |-- TradeMeMotors.java
|   |   |-- steps
|   |   |   |-- TradeMeMotorsSteps.java
|   |   |   |-- runner
|   |   |   |   |-- TradeMeTestRunner.java
|   |-- resources
|   |   |-- features
|   |   |   |-- TradeMe.feature
|-- build.gradle
|-- README.md
src/test/java/pages: Contains the Java classes related to page objects, including BasePage and TradeMeMotors, which interact with the TradeMe website.
src/test/steps: Contains the step definitions for Cucumber scenarios in the TradeMeMotorsSteps class.
src/test/runner: Contains the test runner class runner.java which sets up the Cucumber test execution.
src/resources/features: Contains the Cucumber feature file TradeMe.feature with the scenarios.


**How to Use**
To use this project, follow these steps:

Clone the repository to your local machine.
Open the project in your preferred Java IDE (e.g., VsCode, Eclipse).
Make sure you have the necessary dependencies mentioned in the build.gradle file.

**Running the Tests**

You can run the automated tests using Gradle from the command line or your IDE's test runner.

Command Line:

Open a terminal/command prompt in the project root directory.
Run the following command to execute the tests:
bash
Copy code
./gradlew test
IDE Test Runner:

Open the project in your Java IDE.
Navigate to the runner.java class located at src/test/steps/runner.
Right-click on the runner.java file and select "Run" or "Run as JUnit Test" to execute the tests.

