package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class UserRegisteration_test {
    @Test
    public void userregister() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users/Alhaj/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://haboob.travel");
        driver.findElement(By.xpath("//*[@id=\"tplinkRegister\"]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("txtemailaddress")).sendKeys("kqstore1801@gmail.com");
        Thread.sleep(2000);
        /*driver.findElement(By.id("select2-phoneCountryCode-container")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("Sudan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"select2-phoneCountryCode-container\"]/span[2]")).click();
        Thread.sleep(2000);*/
        driver.findElement(By.id("txtmobile")).sendKeys("+249912442312");
        Thread.sleep(2000);
        driver.findElement(By.id("txtRegisterFirstName")).sendKeys("Tariq");
        Thread.sleep(2000);
        driver.findElement(By.id("txtpassword")).sendKeys("Tariq98.");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");
        Thread.sleep(1000);
        driver.findElement(By.id("txtConfirmPassword")).sendKeys("Tariq98.");
        Thread.sleep(2000);
        driver.findElement(By.id("btnregister")).click();
        Thread.sleep(10000);
        String ExpectedTitle = "Haboob Travel - Search Hotels, Cheap Flights, Activities and Packages worldwide";
        String ActualTitle = driver.getTitle();
        System.out.println("The title of the web page is: " + ActualTitle);
        if (ActualTitle.equals(ExpectedTitle)) {
            System.out.println("Test is successful");
        } else {
            System.out.println("Test is failure");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}
