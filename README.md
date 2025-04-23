# Selenium Link Interaction Automation

This project is an automated script written in Java, using Selenium WebDriver and JUnit, to test various link-related functionalities on the LeafGround demo site. It performs tasks such as clicking links, checking if links are broken, and counting the number of links in different sections of the page.


🛠️ Technologies Used:  Java, Junit 5, Selenium

🔧 Project Structure

SeleniumRun/

├── src/

│   └── test/java/

│       └── com/

│           └── seleniumRun/

│               └── SeleniumRun.java   # Main test class

├── pom.xml          


📄 What the Script Does:

1.Opens the LeafGround link page

2.Navigates to the dashboard and comes back

3.Extracts and prints the URL of a specific link

4.Clicks a “Broken?” link and verifies the result by checking the page title

5.Counts all anchor (<a>) tags on the page

6.Counts how many links exist in the main layout section of the page


🚀 How to Run

Prerequisites:

Java JDK (11+)

Maven

Chrome browser

*RUN the Test


AUTHOR: Marlon Vithanage
