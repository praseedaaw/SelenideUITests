# UI TestAutomation
# react-redux-realworld-example-app
## Tech stack:
- Java 8 ([Install docs](https://adoptopenjdk.net/?variant=openjdk8&jvmVariant=hotspot))
- Maven ([Install docs](https://maven.apache.org/guides/))
- Chrome browser
- Selenide (will be installed automatically)
- Cucumber (will be installed automatically)
- JUnit (will be installed automatically)
- Please see pom.xml file for more details on application modules

## Features of framework:
- Tests could be run in headless chrome(Browser will not be showed in the screen as it is headless)
- Screenshot of failed step will be captured in ```build/reports/tests``` directory
- Reusable utilities in ```\src\main\java\at\utils``` directory
- Cucumber for BDD
- Test Cases in Gherkin format in ```\src\test\resources\features``` directory

## Features for future:
- Enable browser compatibility(Enhancing DriverManager.java class)
- Enhance reporting feature

## Test Cases
- Feature files are located in ```\src\test\resources\features``` directory
- Application under test: https://react-redux.realworld.io/
- Two end to end flows are covered:
        - 1. User invalid sign in
        - 2. Create new post feature for a user known to application and an anonymous user

## How to set environment for running tests
Before executing tests environment must be set up:
- Java 8 ([Install docs](https://adoptopenjdk.net/?variant=openjdk8&jvmVariant=hotspot))
- Set Java_Home in your computer([Install docs](http://www.sajeconsultants.com/how-to-set-java_home-on-mac-os-x/))
- Maven ([Install docs](https://maven.apache.org/guides/))
- Set MAVEN_HOME in your computer ([Install docs](https://maven.apache.org/install.html))
- Any IDE suitable for Java, cucumber and maven can be used

#### Tests parameters
- -Dcucumber.options='--tags @TagExample, @TagExample2 - Currently no tag is set for any tests

### Assumptions

##Download the test framework
Use this command to download code base
- project has to be downloaded/cloned from git repository: https://https://github.com/praseedaaw/SelenideUITests

Open terminal (Unix) or CMD prompt (MS Windows) and run following command:
```bash
cd PROJECT_DIR
```

## Run tests

Make sure that your application under test is running up and ready for testing.
Then run in directory with tests via command line/terminal:

```
mvn clean test
```

## Reports
The screenshots of failed tests could be found in ```build/reports/tests``` directory
