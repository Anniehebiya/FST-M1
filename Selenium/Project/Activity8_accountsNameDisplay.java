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

public class Activity8_accountsNameDisplay {

    @Test
    public void accountsList() throws InterruptedIOException {
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


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(80));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='grouptab_0']")));

        WebElement menuSales = driver.findElement(By.xpath("//a[@id='grouptab_0']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(menuSales);

        WebElement subMenuAccounts = driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Accounts\"]"));

        actions.moveToElement(subMenuAccounts);

        actions.click().build().perform();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[1]/h2")));

        WebElement ruwnum1 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[1]/td[3]/b/a"));
        String name1 = ruwnum1.getText();
        System.out.println("The Name in Row1: " +name1);

        WebElement ruwnum2 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[3]/td[3]/b/a"));
        String name2 = ruwnum2.getText();
        System.out.println("The Name in Row3: " +name2);

        WebElement ruwnum3 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[5]/td[3]/b/a"));
        String name3 = ruwnum3.getText();
        System.out.println("The Name in Row5: " +name3);

        WebElement ruwnum4 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[7]/td[3]/b/a"));
        String name4 = ruwnum4.getText();
        System.out.println("The Name in Row7: " +name4);


        WebElement ruwnum5 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[9]/td[3]/b/a"));
        String name5 = ruwnum5.getText();
        System.out.println("The Name in Row9: " +name5);
    }
}
