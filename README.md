# CucumberTestAuto

Get the code
Git:

git clone https://github.com/namnguyen0402/CucumberTestAuto.git

Use Maven
Open a command window and run:
cd CucumberTestAuto
run mvn clean install 

This runs Cucumber features using Cucumber's JUnit runner. The @RunWith(Cucumber.class) annotation on the RunCucumberTest class tells JUnit to kick off Cucumber.

Open eclipse IDE
import as existing maven project
open file name: Karros_TestRunner.java -> run with JUnit

Some Notes:
- Please change the driverPath of chrome driver as yours, in file: Configuration.properties
- Check your Chrome version and download the revelant chromedriver.exe for compatibility, if not you will got failed result
Please refer chromedriver version here: https://chromedriver.chromium.org/downloads
