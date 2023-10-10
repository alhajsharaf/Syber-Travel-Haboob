package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class Contact_test {
    @Test
    public void contact() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users/Alhaj/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://haboob.travel");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"main-footer\"]/div/div/div[3]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0,500)");
        driver.findElement(By.id("drpContacttitle")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"drpContacttitle\"]/option[2]")).click();
        driver.findElement(By.id("txtcontactfname")).sendKeys("Alhaj");
        Thread.sleep(2000);
        driver.findElement(By.name("LastName")).sendKeys("Sharaf");
        Thread.sleep(2000);
        WebElement ddown = driver.findElement(By.id("phoneCountryCode"));
        Select select = new Select(ddown);
        select.selectByValue("+249SD");
        Thread.sleep(2000);
        driver.findElement(By.id("txtmobile")).sendKeys("+249124135952");
        Thread.sleep(2000);
        driver.findElement(By.name("Email")).sendKeys("alhaj.sharaf@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("drpsubject")).click();
        driver.findElement(By.cssSelector("#drpsubject > option:nth-child(3)")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("txtcontactmsg")).sendKeys("Just for test - PS Team");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"btnContactus\"]")).click();
        Thread.sleep(3000);
        String ExpectedTitle = "Haboob Travel - Search Hotels, Cheap Flights, Activities and Packages worldwide";
        String ActualTitle = driver.getTitle();
        System.out.println("The title of the web page is: " + ActualTitle);
        if (ActualTitle.equals(ExpectedTitle)) {
            System.out.println("Test is successful");
        } else {
            System.out.println("Test is failure");
        }
        driver.quit();

    }

    }
