package com.salmon.test.page_objects.gui;

import com.salmon.test.framework.PageObject;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage extends PageObject {

    private By featuredProjects=By.cssSelector(".wrapper h3");







    public boolean featuredProjectsIsDisplayed()
    {
        return isElementPresent(featuredProjects);
    }
}
