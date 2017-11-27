package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Sample page object class which defines all the elements for a specific page.
 * Every  Class which contains page objects should extend "PageObject" class
 * This gives access to the webdriver object and utility methods
 * USE CSS,ID,NAME,CLASSNAME selectors instead of xpath
 */
public class HomePage extends PageObject {


    //private By whatWeDo = By.cssSelector(".sibling a[href='/en/what-we-do/']");
    private By whatWeDo=By.cssSelector("a[href='/en/what-we-do/']");
    private By newsLetterEmail = By.cssSelector("input[name='email']");
    private By signUpButton = By.cssSelector("#newsletter-signup button[type='submit']");
    private By newsLetterThankYou=By.cssSelector(".thin.wrapper p");

    private By headerSignInLink = By.cssSelector("#headerSignInLink a");
    private By headerLogoutLink = By.id("headerLogout");

    public void clickSignInLink() {
        waitForExpectedElement(headerSignInLink).click();
    }

    public void clickSignOutLink() {
        waitForExpectedElement(headerLogoutLink).click();

    }

    public void clickWhatWeDo()
    {
        waitForExpectedElement(whatWeDo).click();
    }
    public void enterNewsLetterEmailID(String emailId)
    {
        waitForExpectedElement(newsLetterEmail).sendKeys(emailId);
    }
    public void clickSignUpButton(){waitForExpectedElement(signUpButton).click();}
    public String getNewsLetterThankYouMessage()
    {
        return waitForExpectedElement(newsLetterThankYou).getText();
    }



}
