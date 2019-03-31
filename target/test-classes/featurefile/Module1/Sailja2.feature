
@tag
Feature: Title of your feature
  I want to use this template for my feature file

 @tag24
  Scenario: validate that the provider is able to click NCCN Regimen Guideline with the drug/diagnosis combination
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider enters drug/diagnosis combination
    Then validate that the provider is able to click NCCN Regimen Guideline
    
@tag25
  Scenario: validate that NLX system supress the regimen guideline which does not have NCCN order template and will not display on ui for the user to select
    Given provider login into NLX application
    When provider clicks on create Authorization link
    Then validate that NLX system supress the regimen guideline which does not have NCCN order template
    
    
 @tag26
  Scenario: validate that the provider is able to select a specific row within NCCN guildline based upon the treatment scenario when multiple rows exists
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider clicks to select specific row within NCCN guildline based upon the treatment scenario
    Then validate that the multiple row exists for selection
    And validate that the provider is able to select a specific row within NCCN guildline
    
    
    @tag27
  Scenario: validate that NLX system display different order templates associated with selected NCCN guildlines data when there are multiple order template available.
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select specific row within NCCN guildline based upon the treatment scenario
    Then validate that NLX system display different order templates associated with selected NCCN guildlines
    And validate that NLX system display multiple order template available
    
     @tag28
  Scenario: validate that NLX system display only one order templates associated with selected NCCN guildlines data when there is one order template available.
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select NCCN guildline based upon the treatment scenario
    Then validate that NLX system display only one order templates associated with selected NCCN guildlines
    And validate that NLX system display one order template available
    
    
     @tag29
  Scenario: validate that provider is able to select guideline order template which will display reference,chemotherapy regimen and supportive care details
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select NCCN guildline 
    Then validate that provider is able to select guideline order template which will display reference,chemotherapy regimen and supportive care details
    
     @tag30
  Scenario: validate that NLX system saves the chemotherapy details in the regimen PA and will display on the regimen PA screen
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select NCCN guildline  order template for chemotherapy regimen and supportive care details
    Then validate that NLX system saves the chemotherapy details in the regimen PA and will display on the regimen PA screen
    
     @tag31
  Scenario: validate that NLX system  does not saves the  reference section and supportive care details  in the regimen PA and will not  display on the regimen PA screen
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select NCCN guildline order template for chemotherapy regimen and  does not select supportive care details
    Then validate that NLX system  does not saves the  reference section and supportive care details  in the regimen PA and will not  display on the regimen PA screen
    
    
     @tag32
  Scenario: validate that provider user has options to accept the template as is or modify the template in the NCCN regimen Guildlines popup
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select NCCN guildline order template
    Then validate that provider user has options to accept the template as is or modify the template in the NCCN regimen Guildlines popup
    
    @tag33
  Scenario: validate that NLX system save the PA as incomplete auth status when provider doesnot perform any action in the NCCN regimen Guildlines popup and close the regimen popup
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select NCCN guildline order template
    And provider doesnot perform any action in the NCCN regimen Guildlines popup and close the regimen popup
    Then validate that NLX system save the PA as incomplete auth status
    
     @tag34
  Scenario: validate that NLX system triggers the regimen PA validation process when an incomplete status auth is submitted for the auths created and save after turning on the regimen process
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select NCCN guildline order template
    And provider doesnot perform any action in the NCCN regimen Guildlines popup and close the regimen popup
    Then validate that NLX system save the PA as incomplete auth status
    And validate that NLX system triggers the regimen PA validation process
    
     @tag35
  Scenario: validate that NLX system triggers the regimen PA validation process when an incomplete status auth is submitted for the auths created and save before turning on the regimen process
    Given provider login into NLX application
    And provider clicks on create Authorization link
    When provider select NCCN guildline order template
    And  provider submitted for the auths created and save before turning on the regimen process
    Then validate that NLX system save the PA as incomplete auth status
    And validate that NLX system triggers the regimen PA validation process
    
    
 