package com.qa.TechtorialCRM.tests;
import com.qa.TechtorialCRM.pages.CRMLoginPage;
import com.qa.TechtorialCRM.pages.CRMMainPage;
import org.testng.annotations.Test;

public class CRMLoginTest extends CRMTestBase {

    @Test
    public void validateLoginFunctionality() throws InterruptedException {
        CRMLoginPage loginPage =new CRMLoginPage(driver);
        loginPage.login();
    }

    @Test
    public void validateDashboard() throws InterruptedException {
        CRMLoginPage loginPage =new CRMLoginPage(driver);
        loginPage.login();
        CRMMainPage mainPage =new CRMMainPage(driver);
        mainPage.dashboardValidation(driver, "Dashboard");
    }


}

