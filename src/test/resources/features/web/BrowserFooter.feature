@gui

Feature: Hotter Footer tests

  @HAB-1321
  Scenario: Tests if footer links navigate to the right page :
   # Given I navigate to the hotter "Home" page
    Then I will be navigated to the Respective footer links page after clicking footer links
      | footerLink               |
      | Terms & Conditions       |
      | Privacy Policy           |
      | Cookie Policy            |
      | Glossary                 |
      | Modern Slavery Statement |