package com.qa.TechtorialCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class CRMMainPage {

    public CRMMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//span[contains(text(), 'Dashboard')]")
    WebElement dashboard;

    public void dashboardValidation(WebDriver driver,String expectedTitle){
        Assert.assertEquals(dashboard.getText(), expectedTitle );
    }



}
