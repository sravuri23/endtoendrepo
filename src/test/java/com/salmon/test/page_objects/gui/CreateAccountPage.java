package com.salmon.test.page_objects.gui;
import com.salmon.test.framework.helpers.utils.RandomGenerator;
import org.openqa.selenium.*;
import com.salmon.test.framework.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static com.salmon.test.enums.PermittedCharacters.ALPHABETS;
import static com.salmon.test.framework.helpers.utils.RandomGenerator.random;
import static org.testng.AssertJUnit.assertEquals;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CreateAccountPage extends PageObject {



    private String titleData = "Dr";
    private String firstNameData = random(6, ALPHABETS);
    private String lastNameData = random(6, ALPHABETS);
    private String emailAddressData = RandomGenerator.randomEmailAddress(6);
    private String phoneNumberData = "00447932689587";
    private String passwordData = "Testing12345£";
    private String verifyPasswordData = "Testing12345£";
    private String dateOfBirthDateData = "23";
    private String monthData = "December";
    private String yearData =     "1985";
    private String addressFinderData = "wd171da";
    private String loginEmailData= "marcintest14@gmail.com";
    private String loginPasswodData="Pa55word14";


    private By myAccountLink = By.cssSelector("#ems_country_11253 > div:nth-child(6) > div:nth-child(1) > a");
    private By registerButton = By.cssSelector("div#WC_AccountDisplay_div_24.button_align a#WC_AccountDisplay_links_3.button_primary");
    private By titleList = By.name("personTitle");
    private By firstNameField = By.cssSelector("input[type='text'][name='firstName']");
    private By lastNameField = By.cssSelector("input[type='text'][name='lastName']");
    private By phoneNumberField = By.cssSelector("input[type='tel'][name='phone1']");
    private By emailAddressField = By.cssSelector("input[type='email'][name='logonId']");
    private By passwordField = By.cssSelector("input[type='password'][name='logonPassword']");
    private By verifyPasswordField = By.cssSelector("input[type='password'][name='logonPasswordVerify']");
    private By dateOfBirthDateField = By.name("dayOfBirth");
    private By  monthField = By.name("monthOfBirth");
    private By yearField = By.name("yearOfBirth");
    private By addressSuggestions = By.cssSelector(".pnlResults .pcaContent div");
    private By submitButton = By.cssSelector("#WC_UserRegistrationAddForm_links_1 .button_text");
    private By addressField = By.cssSelector(".inputArea input");
    //private By enterAddressManuallyLink = By.partialLinkText("enter address manually");
    private By enterAddressManuallyLink = By.cssSelector("#HAddressFinderAlternate");

    private By addressLine1Field= By.cssSelector("input[type='text'][name='address1']");
    private By addressLine2Field= By.cssSelector("input[type='text'][name='address2']");
    private By cityField = By.cssSelector("input[type='text'][name='city']");
    private By postalCodeField = By.cssSelector("input[id='WC_UserRegistrationAddForm_AddressEntryForm_FormInput_zipCode_1']");
    private By countryField = By.cssSelector("#_country_1");
    private By firstAddress = By.cssSelector(".pnlResults .pcaContent div:nth-of-type(1)");
    private By loginEmailTextField= By.cssSelector("#WC_AccountDisplay_FormInput_logonId_In_Logon_1");
    private By passwordTextField=By.cssSelector("input[type='password'][name='logonPassword']");
    private By loginButton=By.xpath(".//*[@id='WC_AccountDisplay_links_2']/div[2]");
    private By signOutButton = By.cssSelector(".section_list.bottom_border.sign-out>ul>li>a");
    private By myAccountHeaderText = By.cssSelector("#MyAccountBreadcrumbLink");



    public void clickMyAccountLink() {
        waitForExpectedElement(myAccountLink).click();
    }

      /*  List<WebElement> l = webDriver.findElements(By.tagName("a"));

        l.get(8).click();*/
//          int x = l.size();
//          System.out.println(x);//
//          for(int i =0; i<=l.size()-1;i++)
//          {
//              System.out.println(i);
//            String b = l.get(i).getText();
//              System.out.println("All the elements inside the div tag are: " +b);



   /* public WebElement passwordText() {
        return waitForExpectedElement(passwordText);
    }*/


    public void clickOnRegisterbutton() {

        waitForExpectedElement(registerButton);
        waitForExpectedElement(registerButton).click();

    }

      /*  #WC_AccountDisplay_links_3 > div.button_text

        List<WebElement> ls = webDriver.findElements(By.tagName("a"));
        getWait();
        ls.get(290).click();
        waitForExpectedElement(titleList);
*/


//        List<WebElement> l  = webDriver.findElements(By.tagName("a"));
//        int x = l.size();
//        System.out.println(x);
//        for (int i = 0; i <= l.size() - 1; i++) {
//            System.out.println(i);
//            String b = l.get(i).getText();
//            System.out.println("All the elements inside the div tag are: " + b);
//
//        }


    /*public void fillAccountForm() throws InterruptedException {
       waitForExpectedElement(titleField);
       element(titleField).sendKeys("Mr");
       new Select(waitForExpectedElement(titleField)).selectByVisibleText(titleData);


          }*/



    public Select selectTitle()
    {
        return new Select(waitForExpectedElement(titleList));
    }

    public Select seletDateofBirthDate()
    {
        return new Select(waitForExpectedElement(dateOfBirthDateField));
    }

    public WebElement firstNameText()

    {
     return getWebDriver().findElement(firstNameField);
    }

    public  WebElement lastNameText()

    {
        return getWebDriver().findElement(lastNameField);
    }

    public WebElement phoneNumberText()
    {
        return getWebDriver().findElement(phoneNumberField);
    }


    public WebElement passwordText()
    {
        return  getWebDriver().findElement(passwordField);
    }

    public WebElement verifyPasswordText()
    {
        return  getWebDriver().findElement(verifyPasswordField);
    }

    public WebElement emailAddressText()
    {
        return  getWebDriver().findElement(emailAddressField);
    }

    public WebElement addressSelection(){
        return waitForExpectedElement(addressField);
    }

    public void submitButton()
    {
        jsClick(waitForExpectedElement(submitButton));


        }

    public WebElement myAccountPageText()
    {
        return  getWebDriver().findElement(myAccountHeaderText);
    }

   /* public void enterAddressManuallyLink() {

        scrollAndClick(waitForExpectedElement(enterAddressManuallyLink));

    }*/


        //List<WebElement> l = webDriver.findElements(By.tagName("a"));

       // int x = l.size();
        //l.get(298).click();
//        System.out.println(x);
//        for (int i = 0; i <= l.size() - 1; i++) {
//            System.out.println(i);
//            String b = l.get(i).getText();
//            System.out.println("All the elements inside the div tag are: " + b);
//
//        }


    public WebElement addressLine1(){
        return getWebDriver().findElement(addressLine1Field);
    }


    public WebElement addressLine2(){
        return getWebDriver().findElement(addressLine2Field);
    }


    public WebElement postalCode(){
        return  getWebDriver().findElement(postalCodeField);
    }



    public WebElement city()
    {
        return getWebDriver().findElement(cityField);
    }


    public WebElement country(){
        return getWebDriver().findElement(countryField);
    }


    public WebElement enterAddressManual(){
        return getWebDriver().findElement(enterAddressManuallyLink);
    }

    public WebElement address(){

        return  getWebDriver().findElement(firstAddress);
    }
   /* public WebElement addressFinderText()
    {
        return waitForExpectedElement(addressSuggestions);
    }*/



  /*  public WebElement dateOfBirthText()
    {
        return getWebDriver().findElement(dateOfBirthDateField);
    } */

    public void enterUserRegistrationDetails() {

        selectTitle().selectByVisibleText(titleData);
        waitForExpectedElement(firstNameField).sendKeys(firstNameData);
        waitForExpectedElement(lastNameField).sendKeys(lastNameData);
        waitForExpectedElement(phoneNumberField).sendKeys(phoneNumberData);
        waitForExpectedElement(emailAddressField).sendKeys(emailAddressData);
        waitForExpectedElement(passwordTextField).sendKeys(passwordData);
        waitForExpectedElement(verifyPasswordField).sendKeys(verifyPasswordData);

//        lastNameText().sendKeys(lastNameData);
//        phoneNumberText().sendKeys(phoneNumberData);
//        emailAddressText().sendKeys(emailAddressData);
//        passwordText().sendKeys(passwordData);
//        verifyPasswordText().sendKeys(verifyPasswordData);
//        seletDateofBirthDate().selectByVisibleText(dateOfBirthDateData);
//        addressFinderText().sendKeys(addressFinderData);


    }


    public void enterAddressManually()

    {
//        WebElement element = elementToBeVisible(enterAddressManuallyLink);
//        element.click();
    addressLine1().sendKeys("dfdsfsdsd");
    addressLine2().sendKeys("sdfsdfsdfs");
    city().sendKeys("London");
    postalCode().sendKeys("wd171da");
    country().sendKeys("United Kingdom");

        waitForExpectedElement(enterAddressManuallyLink);
    }






    public void selectDateOfBirth(){


        Select S = new Select (getWebDriver().findElement(dateOfBirthDateField));
        S.selectByIndex(4);

    }


   public void selectMonthOfBirth(){
       Select a = new Select (getWebDriver().findElement(monthField));

       a.selectByIndex(2);
       waitForExpectedElement(yearField);

   }


   public void selectYearOfBirth(){

       Select b = new Select(getWebDriver().findElement(yearField));
       b.selectByIndex(3);


   }



   public void addressFinder() {

       WebElement element = elementToBeVisible(enterAddressManuallyLink);
       jsClick(element);


       //WebElement addressTextBox = elementToBeVisible(addressField);
       /*addressTextBox.sendKeys("wd171da");
       elementToBeVisible(addressSuggestions);
       //jsClick(elementToBeVisible(firstAddress));
       Actions a = new Actions(getWebDriver());
       a.sendKeys(Keys.ARROW_DOWN).build().perform();
       a.click().build().perform();*/
       //a.build().perform();

/*
       Actions a = new Actions(webDriver);
      a.moveToElement(getWebDriver().findElement(addressSuggestions));
      waitForExpectedElement(addressField);
      element.sendKeys("wd171da");
      element = getWebDriver().findElement(addressSuggestions);
       waitForExpectedElement(addressSuggestions);
       scrollAndClick(waitForExpectedElement(firstAddress));
       address().click();
*/


//       WebElement element = getWebDriver().findElement(addressField);
//       element.sendKeys("wd171da");
//       waitForExpectedElement(addressSuggestions);
//       Actions a = new Actions(webDriver);
//       a.moveToElement(getWebDriver().findElement(addressSuggestions));
//       a.click(element).build().perform();
//       a.sendKeys(Keys.ARROW_DOWN).build().perform();
//       a.sendKeys(Keys.ENTER);
//       a.build().perform();
//       a.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN)).sendKeys(Keys.ENTER).perform();


       waitForExpectedElement(submitButton);
   }



   public WebElement loginEmailAddress(){
       return waitForExpectedElement(loginEmailTextField);
   }

   public WebElement loginPassword(){
       return waitForExpectedElement(passwordTextField);

   }

   public WebElement loginButtonClick(){
       return waitForExpectedElement(loginButton);
   }


   public void  signOutButtonClick(){
       elementToBeClickable(signOutButton).click();
   }



   public void enterLoginCredentials() {
       waitForExpectedElement(loginEmailTextField).sendKeys(loginEmailData);
       waitForExpectedElement(passwordTextField).sendKeys(loginPasswodData);
       waitForExpectedElement(loginButton).click();
   }

/*
       loginEmailAddress()
       loginPassword().sendKeys(loginPasswodData);
       loginButtonClick().click();
       waitForExpectedElement(signOutButton);
       signOutButtonClick();
*/

   }






















