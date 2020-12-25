@LoginandRegisterRelatedScenarios
Feature: Check login and register related scenarios


@LoginAndLogout_ExamplesParameters @niraj
Scenario Outline: login with ExamplesParameters
Given User "<User>" with password "<Password>" login into the application with correct credentials ExamplesParameters
Given User successfully log out of the application after clicking on log out button
Examples:
|User      |Password|
|callnirajgupta@gmail.com|password1|  
#|callnirajgupta@gmail.com|password1| 









