package com.qa.TechtorialCRM.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utils.BrowserUtils;
import utils.ConfigReader;
import utils.DriverHelper;

public class CRMTestBase {
        public WebDriver driver;

        @BeforeMethod
        public void setup() {
//        driver=new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver = DriverHelper.getDriver();
            driver.get(ConfigReader.readProperty("qa_url"));
        }

        @AfterMethod
        public void teardown(ITestResult iTestResult) {
            if (!iTestResult.isSuccess()) {
                BrowserUtils.getScreenShot(driver, "TechtorialCRM");
            }
           // driver.quit();
        }
}
