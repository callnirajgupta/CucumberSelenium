
@tag
Feature: Validate that NLX system shows NCCN Regimen screen.
  
  @tag1
  Scenario: validate that NCCN Regimen screen display
    Given User login into NLX application
    When user clicks on create Authorization link
    When user enters all required fields for member,provider,diagnosis(cancer specific),drug(cancer specific)
    And  user clicks on Submit button
    Then validate that NCCN Regimen screen display
    
 

  @tag2
Scenario: validate that NLX system consider PA as Normal when user enter cancer drug for medical benefit member
    Given User login into NLX application
    When user clicks on create Authorization link
    When user enters non cancer specific diagnosis 
    And  user enter cancer drug for medical benefit member and submit the PA
    Then validate that NLX system consider PA as Normal
    
   @tag3 
Scenario: validate that NLX system consider PA as Normal when user enter non-cancer drug for medical benefit member
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters cancer specific diagnosis 
    And  user enter non-cancer drug for medical benefit member and submit the PA
    Then validate that NLX system consider PA as Normal
    
    @tag4
    Scenario: validate that NLX system consider PA to CAS when user enter cancer specific diagnosis and pharmacy drug for pharmacy benefit member
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters cancer specific diagnosis 
    And  user enters pharmacy drug for pharmacy benefit member and submit the PA
    Then validate that NLX system consider PA to CAS
    
    @tag5
    Scenario: validate that NLX system consider PA to CAS when user enter non-cancer specific diagnosis and pharmacy drug for pharmacy benefit member
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters non-cancer specific diagnosis 
    And  user enters pharmacy drug for pharmacy benefit member and submit the PA
    Then validate that NLX system consider PA to CAS
    
    @tag6
    Scenario: validate that NLX system consider PA to CAS when user enter cancer specific diagnosis and  drug outside of cancer type for pharmacy benefit member
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters non-cancer specific diagnosis 
    And  user enters drug which is outside of cancer type for pharmacy benefit member and submit the PA
    Then validate that NLX system consider PA to CAS
    
    @tag7
    Scenario: validate that NLX system should displays respective HCPC code for enter drugs in PA
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enter drugs in PA and submit the PA
    Then validate that NLX system should displays respective HCPC code
    
     @tag8
    Scenario: validate that NLX system should displays drugs benefit dropdown based on HCPC code
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enter drugs in PA and submit the PA
    Then validate that NLX system should displays respective HCPC code
    And validate that NLX system should displays drugs benefit dropdown based on HCPC code
    
    @tag9
    Scenario: validate that NLX system sends the PA to CAS when user enter cancer specific diagnosis and submit the PA.
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters cancer specific diagnosis
    And  user enters pharmacy drug and submit the PA
    Then validate that NLX system sends the PA to CAS 
   
   
   @tag10
    Scenario: validate that NLX system display member benefit type until regimen screen when member details are searched
    Given User login into NLX application
    When user clicks on create Authorization link
    And user search for member details
    Then validate that NLX system should diplay memeber benefit type until regimen screen
    
    
     @tag11
    Scenario: validate that NLX system checks the cross mapping table to determine if the drug entered in PA applicable for regimen PA when provider enter cancer specific diagnosis
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters cancer specific and medical drug
    And user submit the PA 
    Then validate that NLX system checks the cross mapping table to determine if the drug entered in PA applicable for regimen PA 
    
   @tag12
    Scenario: validate that system uses NLX MM s default crosswalk when there is no client specific drug crosswalk
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters no client specific drug
    And user submit the PA 
    Then validate that system uses NLX MM as default crosswalk when there is no client specific drug crosswalk 

  @tag13
    Scenario: validate that NLX system consider a PA as normal drug.when user enter non-cancer diagnosis and drug.
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters non-cancer diagnosis and drug for a medical benefit member.
    And user submit the PA 
    Then validate that NLX system consider a PA as normal drug.when user enter non-cancer diagnosis and drug.
  
    
     @tag14
    Scenario: validate that NLX system consider a PA as normal drug.when there is no NCCN template available for the cancer drug/diagnosis
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters cancer diagnosis and drug for which NCCN template not available
    And user submit the PA 
    Then validate that NLX system consider a PA as normal drug
    
    
      @tag15
    Scenario: validate that NLX system consider a PA as regimen PA.when there atleast one NCCN template available for the cancer drug/diagnosis
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters cancer diagnosis and drug for which atleast one NCCN template available
    And user submit the PA 
    Then validate that NLX system consider a PA as regimen PA
    
     @tag16
    Scenario: validate that NLX system bypasses protocol functionality for a regimen PA when PA is submitted.
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters cancer diagnosis and drug for which atleast one NCCN template available
    And user submit the PA 
    Then validate that NLX system consider a PA as regimen PA and bypasses protocol functionality
    
    
    @tag17
    Scenario: validate that NLX system display NCCN Regimen Guildelines link in a pop-up for a regimen PA when PA is submitted
    Given User login into NLX application
    When user clicks on create Authorization link
    And user enters cancer diagnosis and drug for which atleast one NCCN template available
    And user submit the PA 
    Then validate that NLX system consider a PA as regimen PA 
    And validate that NLX system display NCCN Regimen Guildelines link in a pop-up.
    
    