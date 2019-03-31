@LoginandRegisterRelatedScenarios
Feature: Check login and register related scenarios

#@LoginAndLogout_InlineParameters @smoke @getexamplecount
#Scenario: login with InlineParameters
#Given User "admin@p.com" with password "Password-11" login into the application with correct credentials InlineParameters
#Given User successfully log out of the application after clicking on log out button


#@LoginAndLogout_ConfigFileParameters @smoke
#Scenario: login with ConfigFileParameters
#Given User "User1" login into the application with correct credentials ConfigFileParameterss
#Given User successfully log out of the application after clicking on log out button


#declare the parameter at class level so that it be used by other methods in that class..like did for item in addtocart
@LoginAndLogout_ExamplesParameters 
Scenario Outline: login with ExamplesParameters
Given User "<User>" with password "<Password>" login into the application with correct credentials ExamplesParameters
Given User successfully log out of the application after clicking on log out button
Examples:
|User      |Password|
|callnirajgupta@gmail.com|password1|  
#|callnirajgupta@gmail.com|password1| 



#use key value paramterization instead of examples for lot of data for a single set of value,since there u can put the parameter listwise than breadthwise...
#String userName= table.get("UserName");  declare userName at class level like u did for item passing for add to cart.......
#@LoginAndLogout_DataTableType_KeyValue
#Scenario: login with DataTableType_KeyValue
#Given User login into the application with as per data given DataTableType_KeyValue
#| Fields                 |values|
#| UserName              |admin@p.com|
#| Password              |Password-11|
#Given User successfully log out of the application after clicking on log out button




#@LoginAndLogout_DataTableType_Matrix @smoke
#Scenario: login with DataTableType_Matrix
#Given User login into the application with as per data given DataTableType_Matrix
#| UserName                     |Password|
#| admin@p.com                  |Password-11|
#Given User successfully log out of the application after clicking on log out button




#@LoginAndLogout_DataTableType_SingleColumn
#Scenario: login with DataTableType_SingleColumn
#Given User login into the application with as per data given DataTableType_SingleColumn
#| Fields                 |
#| admin3@p.com             |
#| Password-11              |
#Given User successfully log out of the application after clicking on log out button







