Description:
This is a super basic stub of Test Automation framework that aim is to show
classical Page Object and Page Factory patterns in classes

This Framework uses:
(you can find dependencies in pom.xml)
-  Selenium WebDriver
-  jUnit

For now:
-  This framework supports only on Windows OS

Make sure you have:
1. Git installed.
2. Java 1.8 installed and system system variables set.
3. Maven installed
4. latest Chrome browser intalled.

To run the test:
1. Please download latest chromedriver.exe
   and put it into drivers package inside this project
   chromedriver can be found here: https://sites.google.com/a/chromium.org/chromedriver/downloads

2. Select FirstTest.java class in //src/test/java/basic/tests package
   and run it with jUnit with the following vM options:
   -ea -Dwebdriver.driver=chrome -Dwebdriver.chrome.driver=drivers/chromedriver.exe


To start test automation framework
1.  Download project:
1.1 Open command line (Git Bash)
1.2 Enter: git clone https://github.com/tramon/qa-auto-training-basic-page-object.git
2.  Download latest version of chromedriver and put it in the project in \\drivers directory.
4.  Pass following system variables to start a test:
    (it can be done in Idea by passing them as an arguments to your runner)
    -Dwebdriver.driver=chrome
    -Dwebdriver.chrome.driver=drivers/chromedriver.exe
