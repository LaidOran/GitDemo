Feature: Application Login

#Background:
#Given validate the browser
#When Broser is triggered
#Then Check if browser in started


Scenario:  Home page default login
Given User in on NetBanking landing page
When User login first into application with "Jin" and passeword "1234"
Then Home page is populated
And Card displayed are "true"


Scenario:  Home page default login
Given User in on NetBanking landing page
When User sign up with following details
| jenny | abcd |john@abcd.com | Australia | 123123 |
Then Home page is populated
And Card displayed are "true"

Scenario Outline:  Home page default login
Given User in on NetBanking landing page
When User login into application with <username> and passeword <password>
Then Home page is populated
And Card displayed are "true"

Examples: 
|username|password|
|user1|pass1|
|user2|pass2|
|user3|pass3|
|user4|pass4|
