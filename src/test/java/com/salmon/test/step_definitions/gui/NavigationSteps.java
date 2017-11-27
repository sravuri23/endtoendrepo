package com.salmon.test.step_definitions.gui;


import com.salmon.test.framework.helpers.UrlBuilder;
import cucumber.api.java.en.Given;

public class NavigationSteps {


    @Given("^i navigate to the Salmon \"(.*?)\" page$")
    public void i_navigate_to_the_Salmon_page(String pageName) throws Throwable {
        if (pageName.equalsIgnoreCase("HOME")) {
            UrlBuilder.startAtHomePage();
        }
    }

    @Given("^i navigate to the Salmon mobile \"(.*?)\" page$")
    public void i_navigate_to_the_Salmon_mobile_page(String pageName) throws Throwable {
        if (pageName.equalsIgnoreCase("HOME")) {
            UrlBuilder.startAtMobileHomePage();
        }
    }

}
