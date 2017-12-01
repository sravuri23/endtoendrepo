package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class AddToBasketPage extends PageObject {


    private String SearchData = "Marlowe GTX® Boots";

    private By searchTextField = By.cssSelector("#SimpleSearchForm_SearchTerm");
    private By searchIcon = By.cssSelector("#search_submit");
    private By productImageIcon = By.cssSelector(".product-image.b-lazy.loaded");
    private By addToShoppingBag = By.cssSelector("#productPageAdd2Cart");
    private By sizeNumber4 = By.cssSelector("ul > li:nth-of-type(3) > a > img.color_swatch");
    private By inStockText = By.cssSelector("#InventoryStatus_OnlineStatus_268401");
    private By quickViewTotal = By.cssSelector("#minishopcart_total");
    private By checkOutButton = By.cssSelector("#miniShopCartBody > div.info > div.goToCheckout > a > div");
    private By proceedToCheckOutButton = By.cssSelector("#shopcartCheckout.button_primary .button_text");
    private By selectDelivery = By.cssSelector("#shipping_method_content > div:nth-child(1) > p.shipping_method_item_title > label");
    private By deliverHere = By.cssSelector("#selectAdddressLink > div.button_text");
    private By payByCard = By.cssSelector("#byCard");
    private By selectCardType = By.cssSelector("#payMethodId_1");
    private By cardNumberTextField = By.cssSelector("#account1_1");
    private By selectExpiresMonth = By.cssSelector("#expire_month_1");
    private By selectExpiresYear = By.cssSelector("#expire_year_1");
    private By nameOnCardTextField = By.cssSelector("#card_name_1");
    private By cvcNumberTextField = By.cssSelector("#cc_cvc_1");
    private By placeOrderButton = By.cssSelector("#confirmButton");
    private By orderNumberTextConfirmation = By.cssSelector("p.orderNumber > span.strong");


    public void enterSearchFieldText() {
        waitForExpectedElement(searchTextField);
        elementToBeClickable(searchTextField).sendKeys(SearchData);
    }


    public void clickSearchIcon() {
        waitForExpectedElement(searchIcon).click();
    }


    public Boolean checkProductIconisDisplayed() {

        waitForExpectedElement(productImageIcon);
        return elementIsDisplayedOrNot(element(productImageIcon));
    }


    public Boolean checkAddToShoppingBagisDisplayed() {
        waitForExpectedElement(addToShoppingBag);
        return elementIsDisplayedOrNot(element(addToShoppingBag));
    }


    public void clickOnDisplayedProduct() {
        elementToBeClickable(productImageIcon).click();

    }


    public void clickOnSizeFour() {
        waitForExpectedElement(sizeNumber4);
        elementToBeClickable(sizeNumber4).click();
    }

    public Boolean checkInStockTextIsDisplayed() {
        waitForExpectedElement(inStockText);
        return elementIsDisplayedOrNot(element(inStockText));

    }


    public void clickOnAddToShoppingBagButton() {
        waitForExpectedElement(addToShoppingBag).click();

    }

    public Boolean quickViewBasketTotalisDispalyed() {

        waitForExpectedElement(quickViewTotal);
        return elementIsDisplayedOrNot(element(quickViewTotal));
    }



    public void clickOnCheckout() {

        elementToBeClickable(checkOutButton).click();


    }

    public void selectDeliveryOption(){
        waitForExpectedElement(selectDelivery).click();
    }



    public void clickDeliverHereButton(){
        waitForExpectedElement(deliverHere);
       elementToBeClickable(deliverHere).click();
    }

    public void clickOnProceedToCheckout() {



        WebElement element = webDriver.findElement(proceedToCheckOutButton);

       ((JavascriptExecutor)webDriver).executeScript("scroll(0,1200)");
        waitForExpectedElement(proceedToCheckOutButton);
        element.click();





    }


    public void payByCardRadioButton(){
        waitForExpectedElement(payByCard);
        elementToBeClickable(payByCard).click();
    }



    public void enterCardDetails(){
        waitForExpectedElement(selectCardType).sendKeys("Visa Debit Card");
        waitForExpectedElement(cardNumberTextField).sendKeys("4444333322221111");
        waitForExpectedElement(selectExpiresMonth).sendKeys("12");
        waitForExpectedElement(selectExpiresYear).sendKeys("21");
        waitForExpectedElement(nameOnCardTextField).sendKeys("sadasdsadas");
        waitForExpectedElement(cvcNumberTextField).sendKeys("000");
        waitForExpectedElement(placeOrderButton).click();


    }


     public Boolean orderConfirmationOrderNumberTextDisplayed(){
        waitForExpectedElement(orderNumberTextConfirmation);
        return elementIsDisplayedOrNot(element(orderNumberTextConfirmation));
    }

}





