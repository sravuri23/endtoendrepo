package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.models.cucumber.MercuryLoginUserModel;
import com.salmon.test.models.cucumber.MercuryToursSignUpModel;
import com.salmon.test.page_objects.gui.MercuryToursRegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MercuryToursSteps {
    private static final Logger LOG = LoggerFactory.getLogger(MercuryToursRegistrationPage.class);

 private MercuryToursRegistrationPage mercuryToursRegistrationPage;

    public MercuryToursSteps(MercuryToursRegistrationPage mercuryToursRegistrationPage){
        this.mercuryToursRegistrationPage = mercuryToursRegistrationPage;
    }

    @Given("^the user is on the \"(.*?)\" page$")
    public void the_user_is_on_the_page(String pageName) throws Throwable {
        if (pageName.equalsIgnoreCase("HOME")) {

            UrlBuilder.startAtHomePage();

        }
    }

    @When("^I enter valid data on page$")
    public void iEnterValidDataOnPage() throws Throwable {
        mercuryToursRegistrationPage.enterRegistrationFormDetails();

    }


    @And("^I click on submit button$")
    public void iClickOnSubmitButton() throws Throwable {
        mercuryToursRegistrationPage.clickOnSubmitButton();

    }


    @And("^I click on register link on home page$")
    public void iClickOnRegisterLinkOnHomePage() throws Throwable {
        mercuryToursRegistrationPage.clickOnRegisterButton();
        assertThat(mercuryToursRegistrationPage.isFirstNameFieldDisplayed());
    }


    @Then("^Thankyou for registration message is displayed$")
    public void thankyouForRegistrationMessageIsDisplayed() throws Throwable {
        assertThat(mercuryToursRegistrationPage.isFooterLinkDisplayed());


    }


    @Then("^the following fields are displayed in the registration form$")
    public void theFollowingFieldsAreDisplayedInTheRegistrationForm(List<MercuryToursSignUpModel> expectedvalues) throws Throwable {

        for(MercuryToursSignUpModel itr : expectedvalues) {

            switch (itr.getFieldName()){

                case "FirstName":
                    assertThat(mercuryToursRegistrationPage.isFirstNameFieldDisplayed());
                    System.out.println("FirstNameField displayed");
                    LOG.debug("This is first test logged");

                    break;
                case "LastName":
                    assertThat(mercuryToursRegistrationPage.isLastNameFieldDisplayed());
                    System.out.println("LastNameField displayed");
                    break;
                case "Phone":
                    assertThat(mercuryToursRegistrationPage.isPhoneNumberFieldDisplayed());
                    System.out.println("PhoneNumber textfield displayed");
                    break;
                case "Email":
                    assertThat(mercuryToursRegistrationPage.isEmailTextFieldDisplayed());
                    System.out.println("Email textfield displayed");
                    break;
                case "Address":
                    assertThat(mercuryToursRegistrationPage.isAddressTextFieldDisplayed());
                    System.out.println("Address textfield displayed");
                    break;
                case "City":
                    assertThat(mercuryToursRegistrationPage.isCityTextFieldDisplayed());
                    System.out.println("City textfield displayed");
                    break;
                case "State":
                    assertThat(mercuryToursRegistrationPage.isStateTextFieldDisplayed());
                    System.out.println("State textfield displayed");
                    break;
                case "Postalcode":
                    assertThat(mercuryToursRegistrationPage.isPostalCodeTextFieldDisplayed());
                    System.out.println("Postalcode textfield displayed");
                    break;
                case "Country":
                    assertThat(mercuryToursRegistrationPage.isCountrySelectFieldDisplayed());
                    System.out.println("Country textfield displayed");
                    break;
                case "UserName":
                    assertThat(mercuryToursRegistrationPage.isUserNameFieldDisplayed());
                    System.out.println("UserName textfield displayed");
                    break;
                case "Password":
                    assertThat(mercuryToursRegistrationPage.isPasswordTextFieldDisplayed());
                    System.out.println("Password textfield displayed");
                    break;
                case "ConfirmPassword":
                    assertThat(mercuryToursRegistrationPage.isConfirmPasswordTextDisplayed());
                    System.out.println("ConfirmPassword textfield displayed");
                    break;



            }


        }


    }

    @When("^I enter valid login credentials$")
    public void iEnterValidLoginCredentials(List<MercuryLoginUserModel> enterCredentials) throws Throwable {

        for(MercuryLoginUserModel obj1 : enterCredentials) {

            mercuryToursRegistrationPage.enterLoginCredentials(obj1);
            mercuryToursRegistrationPage.clickOnSubmitSignOnPage();


        }




    }

    @And("^I click on login button on MercuryTours Page$")
    public void iClickOnLoginButtonOnMercuryToursPage() throws Throwable {
        mercuryToursRegistrationPage.clickOnSubmitSignOnPage();

    }

    @Then("^I should be able to login successfully$")
    public void iShouldBeAbleToLoginSuccessfully() throws Throwable {
        assertThat(mercuryToursRegistrationPage.isFlightFinderImageDisplayed());
        System.out.println("Image displayed");
    }

    @And("^I click on signon button$")
    public void iClickOnSignonButton() throws Throwable {
        mercuryToursRegistrationPage.clickOnSignOnButton();
    }

    @And("^the title is displayed as expected$")
    public void theTitleIsDisplayedAsExpected() throws Throwable {
       mercuryToursRegistrationPage.getCurrentPageTitle();

    }
}
