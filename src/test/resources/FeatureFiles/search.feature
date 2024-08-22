Feature: search functionality sceanrios
   @search @one
   Scenario: verify wheather user is able to search for products
        Given I launch the application
        When I search for a product "Samsung Syncmaster 94IBW"
        Then I should see the product in search results
   @search @two   
   Scenario: Verify whaether is informed when the product being searched is not available
              Given I launch the application
              When I Search for a product "Apple iphone"
              Then I should see the message informing "your shopping cart is empty"