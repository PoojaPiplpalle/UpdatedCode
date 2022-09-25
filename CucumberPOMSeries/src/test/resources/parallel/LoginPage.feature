Feature: Login page feature

Scenario: Login Page title
Given user is on login page
When user gets the title of the page
Then page title should be "Login - My Store"
#Title is taken from html dom of site.

Scenario: Forget Password link
Given user is on login page
Then forget your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "poojaranip14@gmail.com"
And user enter password "Premamadhav1@855"
And user clicks on Login button
Then user gets the title of the page
And page title should be "My account - My Store"