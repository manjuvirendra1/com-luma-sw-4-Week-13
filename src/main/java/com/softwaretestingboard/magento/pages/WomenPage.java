package com.softwaretestingboard.magento.pages;


import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class WomenPage extends Utility
{
    // Click on Jackets
    By clickOnJacket = By.xpath("//a[@id='ui-id-11']//span[contains(text(),'Jackets')]");

    public void clickOnJackets()
    {
        clickOnElement(clickOnJacket);
        // waitUntilVisibilityOfElementClickable(clickOnJacket,10);
    }
}