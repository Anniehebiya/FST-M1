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

public class Activity9_TraversingTables2 {

    @Test
    public void TraversingTables2() throws InterruptedException {
        
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


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='grouptab_0']")));


        WebElement menuSales = driver.findElement(By.xpath("//a[@id='grouptab_0']"));

        Actions actions = new Actions(driver);

        actions.moveToElement(menuSales);

        WebElement subMenu = driver.findElement(By.xpath("//*[@id=\"moduleTab_9_Leads\"]"));

        actions.moveToElement(subMenu);

        actions.click().build().perform();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(100));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[1]/h2")));

        //Row1
        WebElement rowname1 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[1]/td[3]/b/a"));
        String name1 = rowname1.getText();
        WebElement rowusername1 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[1]/td[8]/a"));
        String username1 = rowusername1.getText();
        System.out.println(name1+" : "+username1);

        //Row2
        WebElement rowname2 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[2]/td[3]/b/a"));
        String name2 = rowname2.getText();
        WebElement rowusername2 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[2]/td[8]/a"));
        String username2 = rowusername2.getText();
        System.out.println(name2+" : "+username2);

        //Row3
        WebElement rowname3 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[3]/td[3]/b/a"));
        String name3 = rowname3.getText();
        WebElement rowusername3 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[3]/td[8]/a"));
        String username3 = rowusername3.getText();
        System.out.println(name3+" : "+username3);

        //Row4
        WebElement rowname4 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[4]/td[3]/b/a"));
        String name4 = rowname4.getText();
        WebElement rowusername4 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[4]/td[8]/a"));
        String username4 = rowusername4.getText();
        System.out.println(name4+" : "+username4);

        //Row5
        WebElement rowname5 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[5]/td[3]/b/a"));
        String name5 = rowname5.getText();
        WebElement rowusername5 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[5]/td[8]/a"));
        String username5 = rowusername5.getText();
        System.out.println(name5+" : "+username5);

        //Row6
        WebElement rowname6 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[6]/td[3]/b/a"));
        String name6 = rowname6.getText();
        WebElement rowusername6 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[6]/td[8]/a"));
        String username6 = rowusername6.getText();
        System.out.println(name6+" : "+username6);

        //Row7
        WebElement rowname7 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[7]/td[3]/b/a"));
        String name7 = rowname7.getText();
        WebElement rowusername7 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[7]/td[8]/a"));
        String username7 = rowusername7.getText();
        System.out.println(name7+" : "+username7);

        //Row8
        WebElement rowname8 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[8]/td[3]/b/a"));
        String name8 = rowname8.getText();
        WebElement rowusername8 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[8]/td[8]/a"));
        String username8 = rowusername8.getText();
        System.out.println(name8+" : "+username8);

        //Row9
        WebElement rowname9 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[9]/td[3]/b/a"));
        String name9 = rowname9.getText();
        WebElement rowusername9 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[9]/td[8]/a"));
        String username9 = rowusername9.getText();
        System.out.println(name9+" : "+username9);

        //Row10
        WebElement rowname10 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[10]/td[3]/b/a"));
        String name10 = rowname10.getText();
        WebElement rowusername10 = driver.findElement(By.xpath("//*[@id=\"MassUpdate\"]/div[3]/table/tbody/tr[10]/td[8]/a"));
        String username10 = rowusername10.getText();
        System.out.println(name10+" : "+username10);
      }
}

