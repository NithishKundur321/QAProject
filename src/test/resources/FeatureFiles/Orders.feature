Feature: End to End scenarios for placing order
@Orders @One
Scenario: Verify wheather the User is able to place orders
   Given I Login to the Application
   When I Add a product to check
   And I place an order
   Then I Should see the order is successfully placed
 