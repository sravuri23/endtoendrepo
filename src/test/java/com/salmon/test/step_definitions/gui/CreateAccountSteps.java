package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.Props;
import com.salmon.test.framework.helpers.UrlBuilder;
import com.salmon.test.framework.helpers.utils.RandomGenerator;
import com.salmon.test.models.cucumber.DeliveryAddressModel;
import com.salmon.test.models.cucumber.UserDetailsModel;
import com.salmon.test.page_objects.gui.CreateAccountPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

import java.net.URI;
import java.util.List;

import static com.salmon.test.enums.PermittedCharacters.ALPHABETS;
import static com.salmon.test.framework.helpers.utils.RandomGenerator.random;
import static org.assertj.core.api.Assertions.assertThat;


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


//    @Given("^I navigate to the hotter \"([^\"]*)\" page$")
//    public void i_navigate_to_the_Salmon_page(String pageName) throws Throwable {
//        if (pageName.equalsIgnoreCase("HOME")) {
//            UrlBuilder.startAtHomePage();
//        }





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

        createAccountpage.signOutButtonClick();
    }


   @And("^I enter valid login credentials and should be able to login$")
    public void iEnterValidLoginCredentialsinhottersite() throws Throwable {
        createAccountpage.enterLoginCredentials();
        createAccountpage.loginButtonClick();
    }

//    @And("^I should be able to login to hotters site$")
//    public void iShouldBeAbleToLogintohottersite() throws Throwable {
//
//        createAccountpage.loginButtonClick();
//
//    }

    @Then("^I click on signout to logout of my account$")
    public void iClickOnSignoutToLogoutOfMyAccount() throws Throwable {
        createAccountpage.signOutButtonClick();

    }


    @Then("^I should see an error message$")
    public void iShouldSeeTheErrorMessage() throws Throwable {

        assertThat(createAccountpage.errorMessageInvalidLogin().contains(Props.getMessage("inv.errormessage")));


    }


    @When("^I enter invalid \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iEnterInvalidAnd(String arg0, String arg1) throws Throwable {

    }

    @When("^I enter invalid acccount details$")
    public void iEnterInvalidAcccountDetails(List<UserDetailsModel> loginUserDetails) throws Throwable {

        for (UserDetailsModel flag : loginUserDetails) {

            createAccountpage.enterInvalidLoginDetails(flag);


        }


    }

    @When("^I click on Add new address button$")
    public void iClickOnAddNewAddressButton() throws Throwable {
        createAccountpage.clickMyAddressLink();
        createAccountpage.clickOnAddNewAddressButton();
    }


    @Then("^verify error message if I enter invalid details leaving a mandatory field empty to delivery address field$")
    public void verifyErrorMessageIfIEnterInvalidDetailsLeavingAMandatoryFieldEmptyToDeliveryAddressField(List<DeliveryAddressModel> deliveryAddressModel) throws Throwable {

        for (DeliveryAddressModel itr : deliveryAddressModel) {
            createAccountpage.enterNewAddressMandatoryDetails(itr);
            switch (itr.getErrorMessage()) {
                case "errorAddressNameFieldIsMandatory":
                    assertThat(createAccountpage.fieldValidationMessage("addressName")).isEqualToIgnoringCase(Props.getMessage("addressNameemptyMessage"));
                    break;
                case "errorFirstNameFieldIsMandatory":
                    assertThat(createAccountpage.fieldValidationMessage("firstName")).isEqualToIgnoringCase(Props.getMessage("firstNameemptyMessage"));
                    break;
                case "errorLastNameFieldIsMandatory":
                    assertThat(createAccountpage.fieldValidationMessage("lastName")).isEqualToIgnoringCase(Props.getMessage("lastNameemptyMessage"));
                    break;
                case "errorAddressline1IsdMandatory":
                    assertThat(createAccountpage.fieldValidationMessage("addressLine1")).isEqualToIgnoringCase(Props.getMessage("addressline1emptyMessage"));
                    break;
                case "errorCityFieldIsMandatory":
                    assertThat(createAccountpage.fieldValidationMessage("city")).isEqualToIgnoringCase(Props.getMessage("cityNameemptyMessage"));
                    break;
                case "errorZIPpostalcodeIsMandatory":
                    assertThat(createAccountpage.fieldValidationMessage("postalCodeField")).isEqualToIgnoringCase(Props.getMessage("postalCodeFieldEmptyMessage"));
                    break;
                case "errorphonenumberIsMandatory":
                    assertThat(createAccountpage.fieldValidationMessage("phoneNumberField")).isEqualToIgnoringCase(Props.getMessage("phoneNumberFieldEmptyMessage"));
                    break;
            }
        }
    }

    @And("^enter postcode in the address field$")
    public void enterPostcodeInTheAddressField() {

    createAccountpage.enterAddressSuggestField();




    }

    @And("^I click on add address submit button$")
    public void iClickOnAddAddressSubmitButton()  {
        createAccountpage.clickOnAddressSubmitButton();

    }

    @And("^I enter address details in form$")
    public void iEnterAddressDetailsInForm()
    {
        createAccountpage.enterAutoAddressDetails();
    }

    @And("^I enter phoneNumber in the form$")
    public void iEnterPhoneNumberInTheForm(){
        createAccountpage.enterAutoAddressPhoneNumber();

    }

    @When("^I select address from auto suggest list$")
    public void iSelectAddressFromAutoSuggestList()  {
        createAccountpage.addressSelected();

    }

    @When("^I click on addressbook link in my account page$")
    public void iClickOnAddressbookLinkInMyAccountPage() {
       createAccountpage.clickAddressBook();
    }

    @And("^I click on removeAddress from the address page$")
    public void iClickOnRemoveAddressFromTheAddressPage()  {
        createAccountpage.clickOnRemoveAddressLink();

    }
}





