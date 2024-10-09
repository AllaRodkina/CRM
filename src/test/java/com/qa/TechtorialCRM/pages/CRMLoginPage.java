package com.qa.TechtorialCRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.BrowserUtils;
import utils.ConfigReader;

public class CRMLoginPage {

    public CRMLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(tagName = "title")
    WebElement title;

    @FindBy(xpath = "//h1[contains(text(), 'Login')]")
    WebElement login;

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailBox;

    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordBox;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginButton;

    public void loginPageInformation(WebDriver driver,String expectedTitle){
        Assert.assertTrue(loginButton.isDisplayed() && loginButton.isEnabled());
        Assert.assertEquals(driver.getTitle(),expectedTitle);
    }

    public void login(){
        emailBox.sendKeys(ConfigReader.readProperty("email"));
        passwordBox.sendKeys(ConfigReader.readProperty("password"));
       loginButton.click();
    }


}






