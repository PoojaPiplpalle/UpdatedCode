Feature: Amazon Home page
 In order to test Amazon Home Page of application
 As a registered user
 I want to specify the features of home page
 
 Scenario: Home Page Top Panel Section
 Given User is on Amazon home page
 Then user gets a amazon search field
 And username is also displayed next to search field
 And Amazon logo is also displayed
 And cart link is also displayed
 
 Scenario: Amazon Todays Deal Section
 Given User is on Amazon home page
When user scrolls down to Todays Deals section
Then user gets the list of multiple products 
And user gets the product image and price details
And user can see more products by clicking on carousel

Scenario: Amazon Footer Links section
Given User is on Amazon home page
When user scrolls down to footer of the page
Then user gets all Country links
|Australia|
|Brazil|
|China|
And user gets all amazon services links 
|Amazon Business|
|Amazon Web Services|
And user gets all privacy policy links
|Privacy notice|
|Use & Sale|

 #each scenario should be totally independent of each other

 
 
 