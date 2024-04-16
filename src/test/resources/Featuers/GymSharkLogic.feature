Feature: gymshark login validation
@smoke
Scenario Outline: login using valid email and password

Given user is in gymshark website
When user click the account button
And user enter valid email '<email address>'
And user enter valid password '<password>'
And user click the login button
#Then user will be able to log in
Then user will be able to log in soft assertion


Examples:
|email address      |password        |
|07redking@gmail.com|41824QApractice!|



