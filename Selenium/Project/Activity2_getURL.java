package CRM_ProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;


public class Activity2_getURL {
@Test
public void getURL() throws InterruptedException {

        FirefoxOptions options = new FirefoxOptions();
        options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
        //Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver(options);

        driver.get("http://alchemy.hguy.co/crm");

        String imgurl = driver.findElement(By.xpath("//*[@id=\"form\"]/div[1]/img")).getAttribute("src");
        driver.close();

        System.out.println("The URL of the image is " + imgurl);

    }
}

