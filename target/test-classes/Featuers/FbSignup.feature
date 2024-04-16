Feature: Facebook signup validation

@smoke
Scenario Outline: signup facebook using Phone number and Email

Given user is in facebook signup page
When user enter firstname '<FirstName>' and last name '<LastName>'
And user enter Phone number '<Phn Number>'
And user enter Password '<Passwword>'
And user click signup button
Then user able to signup

Examples:
|FirstName|LastName|Phn Number|Passwword|
|ABCD     |DEFG    |1234      | 566r$   |
#|GGGG     |PPPP    |ab@cd.com |3333     |



Scenario Outline: signup facebook using invalid Phone number and invalid Email 

Given user is in facebook signup page
When user enter firstname '<FirstName>' and last name '<LastName>'
And user enter Phone number '<Phn Number>'
And user enter Password '<Passwword>'
And user click signup button
Then user not able to signup

Examples:
|FirstName|LastName|Phn Number|Passwword|
|ABCD     |DEFG    |xxxx      | 566r$   |
|ABCD     |DEFG    |ab.com    | 566r$   |


Scenario Outline: signup facebook using invalid password

Given user is in facebook signup page
When user enter firstname '<FirstName>' and last name '<LastName>'
And user enter Phone number '<Phn Number>'
And user enter Password '<Passwword>'
And user click signup button
Then user not able to signup

Examples:
|FirstName|LastName|Phn Number|Passwword|
|ABCD     |DEFG    |1234      | ABFG   |



