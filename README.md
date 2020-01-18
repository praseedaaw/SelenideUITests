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

## Features:
- Tests could be run in headless chrome

## How to set environment for running tests
Before executing tests environment must be set up:
- Java 8 ([Install docs](https://adoptopenjdk.net/?variant=openjdk8&jvmVariant=hotspot))
- Set Java_Home in your computer([Install docs](http://www.sajeconsultants.com/how-to-set-java_home-on-mac-os-x/))
- Maven ([Install docs](https://maven.apache.org/guides/))
- Set MAVEN_HOME in your computer ([Install docs](https://maven.apache.org/install.html))

#### Tests parameters
- -Dcucumber.options='--tags @TagExample, @TagExample2 - Currently no tag is set for any tests

### Assumptions

##Download the test framework
Use this command to download code base
- project has to be downloaded/cloned from git repository: https://

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
or with parameters:
```
mvn clean test -Dcucumber.options='--tags @smoke'
```

## Assumptions made during tests
   


## Reports
The screenshots of failed tests could be found in ```build/reports/tests``` directory
