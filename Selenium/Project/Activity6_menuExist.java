package CRM_ProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.Test;

import java.time.Duration;

public class Activity6_menuExist {
    @Test
    public void menuExist() throws InterruptedException {


            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            //Create a new instance of the Firefox driver
            WebDriver driver = new FirefoxDriver(options);


            driver.get("http://alchemy.hguy.co/crm");
            WebElement userName = driver.findElement(By.xpath("//*[@id=\"user_name\"]"));
            WebElement password = driver.findElement(By.xpath("//*[@id=\"username_password\"]"));
            //Type credentials
            userName.sendKeys("admin");
            password.sendKeys("pa$$w0rd");
            //Click Log in
            driver.findElement(By.xpath("//*[@id=\"bigbutton\"]")).click();

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            boolean checkmenuexist = driver.findElement(By.xpath("//*[@id=\"toolbar\"]/ul/li[5]/span[2]")).isDisplayed();

               if (checkmenuexist) {
                   System.out.println("Menu ACTIVITIES is dispalyed");
               } else {
                   System.out.println("Menu ACTIVITIES is not dispalyed");
               }

            driver.close();

        }
    }
