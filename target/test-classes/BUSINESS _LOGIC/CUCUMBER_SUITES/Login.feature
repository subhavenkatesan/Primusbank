Feature: Login Feature

Background: user is successfully logged in
When user open the "chrome" browser and the "C:\\Selenium -Banking\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When user enters url "http://primusbank.qedgetech.com/"
@smoketest
Scenario: Login Functionality for valid username and password
When user enters "Admin" as username
When user enters "Admin" as passowrd
When user clicks on login button
Then user is on the "Admin" main page and get message as Welcome to Admin
