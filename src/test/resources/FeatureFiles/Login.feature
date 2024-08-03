Feature: Login functionality scenarios
      @Login @One
      Scenario: Verify wheather the user is able to login with valid credentials
            Given I launch the application
            And I navigate to account Login Page
            When I login to the application using Username "ravi.kiran1@gmail.com" and Password "rkiran"
            Then I should see that the user is able to login successfully
      
      @Login @Two
      Scenario: Verify that the User is not able to login with invalid credentials
      Given I launch the application
	    And I navigate to account Login Page
	    When I login to the application using Username "ravi.kiran99@gmail.com" and Password "rkiran99"
      Then I should see an error message informing the User about invalid credentials
      
      @Login @Three
      Scenario: Verify that the User is not able to login without providing credentials
      Given I launch the application
	    And I navigate to account Login Page
	    When I login to the application using Username "" and Password ""
      Then I should see an error message informing the User about invalid credentials
        
      @Login @Four    
      Scenario: Verify whether the user is able to resert the forgotten password
      Given I launch the application
	    And I navigate to account Login Page
	    When I reset the forgotten password for email "ravi.kiran@gmail.com"
	    Then I should see a message informing the User that information related to resting password have been sent to email address
	    