@testBackground 
Feature:  check the login page scenario

Background:
#Given open browser  
#this will run before each of the scenarios ,,the step definition can be present anywhere..

@testScenario @smoke @regresion
Scenario: login to gmail.simple scenario with one set of argument
Given user enter the url "http://www.yahoo.com"
When user enter the username "callnirajgupta" and password "abc"
Then user should able to login into "Gmail"

@testScenarioMultiple @smoke
Scenario Outline: login to multiple website with multiple data
Given user enter the  url "<URL>" #depending on the no. of rows this scenario will run..
When user enter the username "<UserName>" and password "<Password>"
Then user should able to login into "<Title>"
When user enter the  url "<URL>"

@dev
Examples:
|URL                 |UserName      |Password|Title |
|http://www.gmail.com|callnirajgupta|abc     | Gmail|  
|http://www.yahoo.com|callnirajgupta|abcdef  | Yahoo| 


@sit
Examples:
|URL                 |UserName      |Password|Title |
|http://www.gmail.com|callnirajgupta|abc     | Gmail|  
|http://www.yahoo.com|callnirajgupta|abcdef  | Yahoo| 

@TestScenarioAndBut
Scenario: scenario with And & But
Given I am a Facebook user
When I enter my username
And I enter my password #After When, And behaves like a When(action)
Then login should be successful.
But home page should not be missing. #could have been used 'Then' annotation but english won't look good...And could have been better

@ScenarioTableSingleColumnniraj
Scenario: datatable with single value
#Given I am on a new user registration page
When I enter valid data on the page niraj 
#Then all parameter values will go at one go..the values are meant for When annotation which is directly above the parameter list

| Fields                 |second|
| First Name             |dfdgd|
| Last Name              |fgdfgf|
| Email Address          |dfdfg |
| Re-enter Email Address |fdgdg|
| Password               |fsdfds|
| Birthdate              |dfdf|



@ScenarioTablemutiplecolumn
Scenario: datatable with mutilple value
Given I am on a new user registration page
When I enter valid data on the page registration page

| Fields                 |values|
| First Name             |Niraj|
| Last Name              |Gupta|
| Email Address          |callnirajgupta@gmail.com|
| Re-enter Email Address |callnirajgupta@gmail.com|
| Password               |abcde|
| Birthdate              |10/06/1980|
Then the user registration should be successful.

@ScenarioTablemutiplecolumnWithoutColumn
Scenario: datatable with multiple value column
Given I am on a new user registration page
When I enter valid data on the page registration page without knowing keys fields 

| ColumnA                     |ColumnB|
| gupta                       |Niraj|
| prakash                     |Gupta|
| callnirajgupta@gmail.com    |callnirajgupta@gmail.com|
| callnirajgupta@gmail.com    |callnirajgupta@gmail.com|
| Password1                    |abcde|
| 25/06/1980                   |10/06/1980|
Then the user registration should be successful.


@Scenariobeforeanytag
Scenario: some step before this scenario
Given execute some some step before this given

@testwithInteger
Scenario: scenario
Given execute some some step before this given for number 11

