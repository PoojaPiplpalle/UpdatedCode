Feature: Account page feature

Background: 
Given user has already logged in to the application
|username|password|
|poojaranip14@gmail.com|Premamadhav1@855|
#Title is taken from html dom of site.

Scenario: Account page title
Given user is on Accounts page
Then user gets the title of the page
Then page title should be "My account - My Store"

Scenario: Account section count
Given user is on Accounts page
Then user gets accounts section
|ORDER HISTORY AND DETAILS|
|MY CREDIT SLIPS|
|MY ADDRESSES|
|MY PERSONAL INFORMATION|
|MY WISHLISTS|
|Home|
And accounts section count should be 6
