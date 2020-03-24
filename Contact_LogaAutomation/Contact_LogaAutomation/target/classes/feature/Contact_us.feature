Feature: Loga_contactus_runner
@TC_001
Scenario: To check pop up message is displayed when details are not filled
Given Open Url in the browser
When click on contact us option
Then click on send button
@TC_002
Scenario: To check send button is clicked when message text box is not filled
Given Open url in browser
When Click on contact us option
Then Click on Send button
@TC_003
Scenario: To check send button is clicked when subject heading is not chosen
Given open url in the browser
When click on Contact us option
Then click on Send button
@TC_004
Scenario: To check send button is clicked when order reference is not entered
Given Open URL in chrome browser
When Click on Contactus Option
When enter all details except order reference
Then Click On Send Button
@TC_005
Scenario: To check pop up message is displayed when email is not entered
Given Open url in the chrome browser
When Click on Contact_us Option
When fill all details except email 
Then Click On Send_Button