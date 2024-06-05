Feature: verifying the facebook page
Scenario Outline: verifying the fb page with valid credentials
Given user is on logib page
When user enters the "<username>","<password>" and click login button
Then user gets the success message

Examples:
|username|password|
|prasanth|iphone@1411S|