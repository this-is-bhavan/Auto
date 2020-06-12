Feature: Testing hotel booking and cancellation functionalities in adactin application

@SigninPage
Scenario: Checking the valid username and password for login function
Given user launch the adactin application
When User enter "PavithraN" as the valid username
And  User enter "Pavi@2426" the valid Password
And User enter the login Button
Then It lands to the homepage sucessfully

Scenario: Checking for the hotel vaccany
When User selects the location
And User selects the hotel
And User selects the roomtype
And User selects the no of rooms
And User selects the checkin date 
And User selects the checkout date
And User selects the adult room
And User selects the child room
And User entre the submit button
Then It lands to the booking page

Scenario: Booking the hotel
When User enter the first name
And User enter the last name
And User enter the address
And User enter the card no
And User enter the card type
And User enter the card expiry month
And User enter the card expiry year
And User enter the CCV no
And User enter the booknow button
Then It land to the conformation page 

Scenario: Conforming the hotel
When User selects the available hotel
And User proceeds with the confromation
Then Confromation sucessfull

Scenario: Proceeding to Logout
And User selects the logout
Then Logging out sucessfull