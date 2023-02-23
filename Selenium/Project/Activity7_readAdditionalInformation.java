package CRM_ProjectPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.InterruptedIOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity7_readAdditionalInformation {

    @Test
    public void readAdditionalInformation() throws InterruptedException {

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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='grouptab_0']")));

        WebElement menuSales = driver.findElement(By.xpath("//a[@id='grouptab_0']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(menuSales);

        WebElement subMenu = driver.findElement(By.xpath("//li[2]//span[2]//ul[1]//li[5]//a[1]"));

        actions.moveToElement(subMenu);

        actions.click().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='adspan_1bf01e91-1f26-5249-ed14-63294367a7e5']//span[@title='Additional Details']")));

        WebElement infoBtn = driver.findElement(By.xpath("//span[@id='adspan_1bf01e91-1f26-5249-ed14-63294367a7e5']//span[@title='Additional Details']"));

        infoBtn.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='phone']")));

        WebElement phone = driver.findElement(By.xpath("//span[@class='phone']"));

        String mob = phone.getText();

        System.out.println("Phone: " + mob);

        driver.close();
    }
}
