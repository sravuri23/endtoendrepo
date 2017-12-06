package com.salmon.test.step_definitions.gui;
import com.salmon.test.framework.helpers.WebDriverHelper;
import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.framework.helpers.utils.RandomGenerator;
import com.salmon.test.page_objects.gui.CreateAccountPage;

import cucumber.api.java.en.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;
import cucumber.api.PendingException;

import static com.salmon.test.enums.PermittedCharacters.ALPHABETS;
import static com.salmon.test.framework.helpers.utils.RandomGenerator.random;


public class CreateAccountSteps {

    private String passwordData = "Testing12345£";
    private String titleData = "Dr";
    private String firstNameData = random(6, ALPHABETS);
    private String lastNameData = random(6, ALPHABETS);
    private String emailAddressData = RandomGenerator.randomEmailAddress(6);
    private CreateAccountPage createAccountpage;

    public CreateAccountSteps(CreateAccountPage createAccountpage) {
        this.createAccountpage = createAccountpage;
    }


    @Given("^I navigate to the hotter \"([^\"]*)\" page$")
    public void i_navigate_to_the_Salmon_page(String pageName) throws Throwable {
        if (pageName.equalsIgnoreCase("HOME")) {
            UrlBuilder.startAtHomePage();
        }


    }

    @When("^I click on My Account link from the header$")
    public void iClickOnMyAccountLinkFromTheHeader() throws Throwable {
        createAccountpage.clickMyAccountLink();


    }

    @And("^I click on register link from the signin page$")
    public void iClickOnRegisterLinkFromTheSignPage() throws Throwable {
        createAccountpage.clickOnRegisterbutton();
    }

    @And("^I fill in the registration form$")
    public void iFillInTheRegistrationForm() throws Throwable {
        createAccountpage.enterUserRegistrationDetails();
        createAccountpage.selectDateOfBirth();
        createAccountpage.selectMonthOfBirth();
        createAccountpage.selectYearOfBirth();
        createAccountpage.addressFinder();
        createAccountpage.enterAddressManually();
        //createAccountpage.enterAddressManually();
        createAccountpage.submitButton();


    }


    @Then("^I should see the confirmation page$")
    public void iShouldSeeTheConfirmationPage() throws Throwable {

        Assertions.assertThat(createAccountpage.myAccountPageText());
        createAccountpage.signOutButtonClick();
    }


    @And("^I enter valid login credentials$")
    public void iEnterValidLoginCredentials() throws Throwable {
        createAccountpage.enterLoginCredentials();

    }

    @And("^I should be able to login$")
    public void iShouldBeAbleToLogin() throws Throwable {
        Assertions.assertThat(createAccountpage.myAccountPageText());
        createAccountpage.signOutButtonClick();

    }

    @Then("^I click on signout to logout of my account$")
    public void iClickOnSignoutToLogoutOfMyAccount() throws Throwable {
        createAccountpage.signOutButtonClick();

    }

}