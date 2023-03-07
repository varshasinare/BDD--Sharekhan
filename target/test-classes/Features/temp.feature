@Login1
Feature:  ShareKhan HomePage

@Test1
Scenario: Verify title of ShareKhan Homepage
Given User is on ShareKhan Homepage
When Title of Home page contains "Sharekhan" and display contents MARKET,NEW TO MARKET,SUPER INVESTOR,ACTIVE TRADER,MUTUAL FUNDS,RESEARCH,EDUCATION FIRST,PRODUCTS AND SERVICES,LOGIN/TRADE button
Then Close browser after verification

@Test2
Scenario: Verify ShareKhan HomePage
Given User is on ShareKhan Homepage
When User click on Main Menu
Then Main menu popup is displayed on right side