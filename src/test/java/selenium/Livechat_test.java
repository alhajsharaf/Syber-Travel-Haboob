package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class Livechat_test {
    @Test
    public void chat() throws InterruptedException {
       //launch the browser
        System.setProperty("webdriver.chrome.driver", "C://Users/Alhaj/Downloads/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(10000);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //navigate to URL
        driver.get("http://haboob.travel");
        Thread.sleep(3000);
        //click livechat widget
        driver.findElement(By.xpath("//*[@id=\"crisp-chatbox\"]/div/a/span[2]/span/span[1]/span/span")).click();
        Thread.sleep(2000);
        //type in chat
        driver.findElement(By.name("message")).sendKeys("Alhaj - PS team, just for test");
        Thread.sleep(2000);
        //click send the message button
        driver.findElement(By.xpath("//*[@id=\"crisp-chatbox\"]/div/div/div[2]/div/div[5]/div/span")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
