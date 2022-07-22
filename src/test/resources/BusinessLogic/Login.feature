Feature: Login Functionality

Background: Application opens main page

Given user open browser with "webdriver.chrome.driver" and "D:\\Testing\\Applications\\chromedriver_win32\\chromedriver.exe"
Given user enter url "https://www.flipkart.com/"

@SmokeTest
Scenario Outline: Login functionality with valid credentials
When user click on initial login page 
When user navigate to login button 
When user click on My profile
When user enter <username> as username
When user enter <password> as password
When user click on Login button
Then application shows login successfully

Examples:
				|username|password|
				|akadam719@gmail.com|7588297532|
