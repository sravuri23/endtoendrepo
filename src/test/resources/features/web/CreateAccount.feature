
@gui
Feature: Acceptance test for create an account
  As a customer
  I want to register when I am in the hotters website
  so that I have an account where my details can be stored


Background:
  Given I navigate to the hotter "Home" page


  Scenario: Account creation from hotter site
    When I click on My Account link from the header
    And  I click on register link from the signin page
    And  I fill in the registration form
    Then I should see the confirmation page


  Scenario: Verify registered user is able to login
    When I click on My Account link from the header
    And I enter valid login credentials
    And I should be able to login








#  Scenario: Verify the user can navigate to product details page
#
#  Given I navigate to the hotter "Home" page
#  When  I click on Men category
#  And   I select a product from the list
#  Then  I should be able to view the product details page





# Scenario Outline: I want to sign up for the newsletter
#    Given i navigate to the Salmon "Home" page
#    When I enter my email id "<emailId>" in newsletter field
#    And I click on SIGN UP
#    Then i should see "<ThankYouMessage>"
#    Examples:
#      |emailId|ThankYouMessage|
#      |varma@gmail.com|newsletter.thankyou|
#      |jasper@gmail.com|newsletter.thankyou                  |