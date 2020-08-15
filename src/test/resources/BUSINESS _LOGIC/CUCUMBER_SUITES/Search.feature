Feature: Search Functioality

Background: The user is able to login successfully and able to search the bank
When the user login "Chrome" browser and the "C:\\Selenium -Banking\\primusBank\\src\\test\\resources\\DRIVERS\\chromedriver.exe"
When the user enters "http://primusbank.qedgetech.com/"

Scenario: Login succeesfully
When the user enters "Admin" as username
When the user enters "Admin" as password
When the user click login button
Then the user gets "Admin" welocme page with Welcome to Admin as message
@SmokeTest
Scenario: Search bank branchs
When the user click on branches
When the user select country dropdown as "INDIA"
When the user select State dropdown as "Tamil Nadu"
When the user select city dropddown as "CHENNAI"
When the user click search button
Then the application shows the result for "CHENNAI" city


