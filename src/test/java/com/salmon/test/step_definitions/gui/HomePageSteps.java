package com.salmon.test.step_definitions.gui;

import com.salmon.test.framework.helpers.Props;
import com.salmon.test.page_objects.gui.HomePage;
import com.salmon.test.page_objects.gui.WhatWeDoPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.assertEquals;

public class HomePageSteps {

    private HomePage homePage;
    private WhatWeDoPage whatWeDoPage;

    public HomePageSteps(HomePage homePage, WhatWeDoPage whatWeDoPage) {
        this.homePage = homePage;
        this.whatWeDoPage=whatWeDoPage;
    }

    @When("^i click what we do on home page$")
    public void i_click_what_we_do_on_home_page() throws Throwable {
        homePage.clickWhatWeDo();
    }

    @Then("^i can see feature projects$")
    public void i_can_see_feature_projects() throws Throwable {
        whatWeDoPage.featuredProjectsIsDisplayed();
    }
    @When("^I enter my email id \"(.*?)\" in newsletter field$")
    public void i_enter_my_email_id_in_newsletter_field(String emailId) throws Throwable {
    homePage.enterNewsLetterEmailID(emailId);
    }

    @When("^I click on SIGN UP$")
    public void i_click_on_SIGN_UP() throws Throwable {
        homePage.clickSignUpButton();
    }

    @Then("^i should see \"(.*?)\"$")
    public void i_should_see(String thankYouMessage) throws Throwable {
        homePage.getNewsLetterThankYouMessage();
        assertEquals(Props.getMessage("newsletter.thankyou"),homePage.getNewsLetterThankYouMessage());
    }


}