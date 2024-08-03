Feature: Registraition functionality scenarios
  
  @Register @One
  Scenario: Verify whether the user is able to register into the application by providing all the fields
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
    	| FirstName | Ravi 									|
    	| LastName  | Kiran 								|
    	| Email			| Ravi.kiran24@gmail.com |
    	| Telephone	| 9212345678						|
    	| Password	| rkiran								|
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see that the User Account has successfully created
   
   @Register @Two
   Scenario: Verify wheather the user is not allowed to register on skipping the mandatory feilds
        Given I launch the application
        And I navigate to Account Registration page
        When I click on Continue button
        Then I should see that the User Account is not created
        And I should see the error messages informing the User to fill the mandatory fields
   
   @Register @Three     
   Scenario: Verify whether the user is able to register into the application by option for Newsletter subscription
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below valid details
    	| FirstName | Ravi 									|
    	| LastName  | Kiran 								|
    	| Email			| Ravi.kiran38@gmail.com |
    	| Telephone	| 9212345678						|
    	| Password	| rkiran								|
    And I select the Privacy Policy
    And I subscribe to Newsletter
    And I click on Continue button
    Then I should see that the User Account has successfully created
    
    @Register @Four
    Scenario: Verify wheather the user is restricted from creating a duplicate account
    Given I launch the application
    And I navigate to Account Registration page
    When I provide all the below duplicate details
    	| FirstName | Ravi 									|
    	| LastName  | Kiran 								|
    	| Email			| Ravi.kiran24@gmail.com |
    	| Telephone	| 9212345678						|
    	| Password	| rkiran								|
    And I select the Privacy Policy
    And I click on Continue button
    Then I should see user is restricted from creating duplicate account
    
    
    
    
    
    
    
    
        
        