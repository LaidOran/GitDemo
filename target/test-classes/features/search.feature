Feature: Search and place order for vegetables


@SeleniumTest
Scenario: Search for items and validate results
Given User is on Greencart landing page
#When User searched for "Cucumber" vegetable - Cette step definition est utilisé lorsqu'on a un string, on ne peut pas le combiné avec un Scenario Outline, pour le comnainé avec un scénario Outline, il faut enlever les "" et le systeme va le reconnaitre
When User searched for Cucumber vegetable
Then "Cucumber" result are displayed

@smog
Scenario Outline: Search for items and validate results
Given User is on Greencart landing page
When User searched for <Name> vegetable
And added items to cart
And User proceeded to checkout page for purchase
Then verify selected <Name> items are displayed in check out page

Examples: 
|Name|
|Brinjal|
|Beetroot|