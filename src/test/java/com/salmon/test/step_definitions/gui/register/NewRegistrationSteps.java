package com.salmon.test.step_definitions.gui.register;


import com.salmon.test.framework.helpers.utils.RandomGenerator;
import com.salmon.test.page_objects.gui.NewRegistrationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.Getter;

import static com.salmon.test.enums.PermittedCharacters.ALPHABETS;
import static com.salmon.test.enums.PermittedCharacters.ALPHANUMERIC;
import static com.salmon.test.framework.helpers.utils.RandomGenerator.random;
import static org.assertj.core.api.Assertions.assertThat;

@Getter
public class NewRegistrationSteps {

    private NewRegistrationPage newRegistrationPage;

    private String loginIdData = random(6, ALPHANUMERIC);
    private String passwordData = random(6, ALPHANUMERIC);
    private String titleData = "Dr.";
    private String firstNameData = random(6, ALPHABETS);
    private String lastNameData = random(6, ALPHABETS);
    private String postCodeData = "UB10 9DW";
    private String address1Data = random(6, ALPHABETS);
    private String townOrCityData = random(6, ALPHABETS);
    private String emailAddressData = RandomGenerator.randomEmailAddress(6);
    private String birthDateData = "1";
    private String birthMonthData = "1";
    private String birthYearData = "1982";


    public NewRegistrationSteps(NewRegistrationPage newRegistrationPage) {
        this.newRegistrationPage = newRegistrationPage;
    }


    @When("^i fill in the registration form on New Registration page$")
    public void i_fill_in_the_registration_form_on_New_Registration_page() throws Throwable {
        assertThat(newRegistrationPage.checkNewRegistrationForm()).isTrue();


    }



}