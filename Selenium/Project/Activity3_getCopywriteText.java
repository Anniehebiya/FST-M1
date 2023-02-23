package CRM_ProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

public class Activity3_getCopywriteText {

    @Test
    public void getCopywriteText() throws InterruptedException {
        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver(options);

        driver.get("http://alchemy.hguy.co/crm");

        String firsttxt = driver.findElement(By.xpath("//*[@id=\"admin_options\"]")).getText();
        driver.close();

        System.out.println("The first copy write text is: " + firsttxt);

    }
}
