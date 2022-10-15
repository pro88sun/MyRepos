
Feature: Checkout as a Guest

Scenario Outline: Validate Guest user can checkout successfully
   
   Given user is on Homepage
    When user clicks on <Category> under <SubCategory> 
    Then user should be navigated to PLP page
    And user is navigated to PDP screen while clicking on product image from PDP
    And user is able to view the product details
    And user selects the Product color size and add the item to cart
   	And user proceeds to Checkout Shipping as a Guest
    And user enters the Shipping Details and proceed to Checkout Billing
    And user enters the <Card_Details> and proceed to Order Review Page
    Then user clicks on Place order successfully
    
    
     Examples: 
      | Category  | SubCategory | Card_Details			|
      | Men 			|     Shirts 	|	4111111111111111	|