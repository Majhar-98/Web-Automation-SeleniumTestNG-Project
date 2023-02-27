# Website-Automation-SeleniumTestNG-Project

## TestNG Framework:
TestNG is an open-source test automation framework for Java. It is developed on the same lines as JUnit and NUnit. 
A few advanced and useful features provided by TestNG make it a more robust framework compared to its peers. 
The NG in TestNG stands for ‘Next Generation.’ Created by Cedric Beust, it is used more frequently by developers and testers in test case creation, owing to its ease of using multiple annotations, grouping, dependence, prioritization, and parametrization features.

## Benefits of TestNG with Selenium:
One of the drawbacks of Selenium is that it does not have a proper format for the test results. By using TestNG framework in Selenium, Tester can:
1. Generate the report in a proper format.
2. Include the number of test cases run; tests passed, failed, and skipped in the report.
3. Group test cases by converting them to testing.xml
4. Use invocation count and execute multiple tests without using loops
5. Perform cross browser testing
6. Easily understand annotations

## Technologies Used:
- Java
- Selenium 
- TestNG
- Allure
- Faker Library

## Flow of Automation Scenarios:
1. Login to orange hrm demo site
https://opensource-demo.orangehrmlive.com/

2. Create 2 new employees and save it to a JSON list
3. Now go to PIM dashboard and search by 1st user name. Assert that the user is found.
4. Now click on the user from the search table and update id by random userid
5. Now again search the user by new user id from the PIM dashboard menu and assert that the user is found
6. Now logout from admin and login with the 2nd user from your JSON list
7. Now click on My Info menu
8. Select Gender and Blood Type and save it
9. Click on contact details and input address and email
10. Logout the user

## Requirement:
Java needs to be installed in device

## Allure Report:

![image](https://user-images.githubusercontent.com/123467715/221544089-2e3d76fa-c793-41d3-8c9c-6b0478bd3bf2.png)

