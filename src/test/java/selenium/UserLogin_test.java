package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class UserLogin_test {
    @Test
    public void userlogin() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Users/Alhaj/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://haboob.travel");
        driver.findElement(By.id("tplinkSignin")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("emailId")).sendKeys("alhaj.s@sybertechnology.com");
        Thread.sleep(2000);
        driver.findElement(By.id("pass")).sendKeys("Haboob1117.");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"btnlogin\"]")).click();
        Thread.sleep(3000);
        String ExpectedTitle = "Haboob Travel - Search Hotels, Cheap Flights, Activities and Packages worldwide";
        String ActualTitle = driver.getTitle();
        System.out.println("The title of the web page is: "+ActualTitle);
        if (ActualTitle.equals(ExpectedTitle)){
            System.out.println("Test is successful");
        }
        else {
            System.out.println("Test is failure");
        }
        driver.quit();



    }


}
