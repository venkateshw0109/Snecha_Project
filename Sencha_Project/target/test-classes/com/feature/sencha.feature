Feature: Sencha login Functionally

Scenario: Verify that user is able to login without any issue

Given User Launch the Application 
When User Click the Pages button and scroll down and click the login button
And User Enter the valid user id "Austin"
And User Enter the valid password "Austin@123"
And User click the login button
Then login Successfully

Scenario: Verify that email tab is opening without issue

When User Click the Email Icon
And User Open one mail from Rhea Clemons in the inbox
Then User Verify that it contains the message "Eiusmod duis irure nostrud elit essenostrud"