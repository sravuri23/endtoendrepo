@gui @demo
Feature: Acceptance test for create an account
  As a customer
  I want to register when I am in the hotters website
  so that I have an account where my details can be stored


  Background:
    Given the user is on the "Home" page
    When I click on My Account link from the header

  Scenario: Account creation from hotter site
    And  I click on register link from the signin page
    And  I fill in the registration form
    Then I should see the confirmation page


  Scenario: Verify registered user is able to login
  #  And I enter valid login credentials
    And I should be able to login
    Then I click on signout to logout of my account


  Scenario: Verify unregistered user is able to login

  # When I enter invalid acccount details
      | Email                 | Password      |
      | asdsadasdas@gmail.com | asfsdfsdfds   |
      | ^&*(&^(&(&@gmail.com  | Testing123    |
      |                       | dsfdsfdsfdsfs |

    Then I should see an error message

  Scenario: Deliver address mandatory field check
    And I enter valid login credentials
    And I should be able to login
    When I click on Add new address button
    Then verify error message if I enter invalid details leaving a mandatory field empty to delivery address field
      | AddressName | FirstName | LastName  | Addressline1 | city  | postalcode | PhoneNumber | ErrorMessage                     |
      |             | dasadsad  | sadasdas  | asdasdas     | sdas  | wd171da    | 02089030345 | errorAddressNameFieldIsMandatory |
      | vxcvxcvxc   |           | fdsfdsfds | vxvxcvxc     | cvxcv | wd171da    | 03345454545 | errorFirstNameFieldIsMandatory   |
      | vxcvxcvxc   | fdgfdgfgf |           | vxvxcvxc     | cvxcv | wd171da    | 03345454545 | errorLastNameFieldIsMandatory    |
      | vxcvxcvxc   | fdgdgfgff | fdsfdsfds |              | cvxcv | wd171da    | 03345454545 | errorAddressline1IsMandatory     |
      | vxcvxcvxc   | fdgdgfgff | fdsfdsfds | fdgdgfd      |       | wd171da    | 03345454545 | errorCityFieldIsMandatory        |
      | vxcvxcvxc   | fdgdgfgff | fdsfdsfds | fdgdgfd      | cxvcv |            | 03345454545 | errorZIPpostalcodesIsMandatory   |
      | vxcvxcvxc   | fdgdgfgff | fdsfdsfds | fdgdgfd      | cxvcv | wd171da    |             | errorphonenumbersIsMandatory     |






