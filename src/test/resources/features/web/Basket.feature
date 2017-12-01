@gui
Feature: Add to basket button on PDP
  As a customer
  I want to add a product to my basket
  so that I can purchase it

Background:

  Given I navigate to the hotter "Home" page
  When I click on My Account link from the header
  And I enter valid login credentials


  Scenario:Verify Available Online In stock is present in the pdp page

    When I enter "Marlowe GTX® Boots" and click on search
     And  I should see the product in the pdp page
     And  I click on displayed product
     Then I should see the Available Online In-stock displayed
     And  I click on add to shopping bag button
     Then the product should be added to the basket successfully
     When I click on checkout button from the quick view basket
     And the product should be added to the basket successfully
     And the shopping bag page is displayed
     And I should be able to fill in the payment details
     Then the order placed successfully







