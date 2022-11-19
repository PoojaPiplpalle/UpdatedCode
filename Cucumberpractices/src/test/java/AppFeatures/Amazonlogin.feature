Feature: login page
 In order to test login page
 As a registered user
 I want to specify the login conditions
 
 #Scenario: Amazon Login Page
 #Given User is on Amazon landing page
 #Given Sign in button is present on screen
 #When user clicks on Sign in button 
 #Then user can see login screen
 #When user enters "naveen@gmail.com" in username field
 #When user enters "test123" in password field
 #When user clicks on Sign in button
 #Then user is on home page
 #Then title of home page is "Amazon"
 #
 #//the above feature file is not in a readable format so below is more readable
 Scenario: Amazon Login Page
 Given User is on Amazon landing page
 And Sign in button is present on screen
 When user clicks on Sign in button 
 Then user can see login screen
 When user enters "naveen@gmail.com" in username field
 And user enters "test@123" in password field
 And user clicks on Sign in button
 Then user is on home page
 Then title of home page is "Amazon"
 But Sign button is not present
 
 
 