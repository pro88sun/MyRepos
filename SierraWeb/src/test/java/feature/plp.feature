
Feature: Validate PDP
  

  Scenario Outline: to validate PDP is opening fine
    Given user is on Homepage
    When user clicks on <Category> under <SubCategory> 
    
    Then user should be navigated to PLP page
    And check product details

    Examples: 
      | Category  | SubCategory | 
      | Men |     Shirts |
     

   Scenario Outline:: Validate PDP screen
   
   Given user is on Homepage
    When user clicks on <Category> under <SubCategory> 
    Then user should be navigated to PLP page
    And user is navigated to PDP screen while clicking on product image from PDP
    And user is able to view the product details
    
     Examples: 
      | Category  | SubCategory | 
      | Men |     Shirts |