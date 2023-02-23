package CRM_ProjectPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Activity1_getTitle {

    @Test
    public void getTitle() throws InterruptedException {

            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            //Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver(options);

            driver.get("http://alchemy.hguy.co/crm");

            String actualTitle = driver.getTitle();
            String expectedTitle = "SuiteCRM";
            Assert.assertEquals(actualTitle, expectedTitle);
            driver.close();
         }
    }
