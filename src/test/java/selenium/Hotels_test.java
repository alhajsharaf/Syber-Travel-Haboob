package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class Hotels_test {
    @Test
    public void hotels() throws InterruptedException {
        //launch the browser
        System.setProperty("webdriver.edge.driver", "C:/Users/Alhaj/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //navigate to URL
        driver.get("http://haboob.travel");
        Thread.sleep(2000);
        //click hotels
        driver.findElement(By.xpath("//*[@id=\"myTab\"]/li[2]/a/span")).click();
        Thread.sleep(10000);
        //insert destination
        driver.findElement(By.xpath("//*[@id=\"Hotels\"]/div/form/div[1]/div[1]/div/hotelautocomplete/input")).sendKeys("dubai");
        Thread.sleep(20000);
        //click dubai
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/div[1]/div[1]/div/hotelautocomplete/div[2]/div/div/div/ul/li[1]/span")).click();
        Thread.sleep(1000);
        //choose checkin
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/div[1]/div[2]/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")).click();
        Thread.sleep(1000);
        //choose checkout
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/div/div/div[2]/div/div/div/form/div[1]/div[2]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[4]/a")).click();
        Thread.sleep(1000);
        //close crisp
        driver.findElement(By.xpath("//*[@id=\"crisp-chatbox\"]/div/a/span[1]/span/span/span/span[1]/span/span[1]")).click();
        Thread.sleep(1000);
        //click search for hotels
        driver.findElement(By.xpath("//*[@id=\"tab-1\"]/form/div[2]/div/button")).click();
        Thread.sleep(30000);
        //click book on haboob
        driver.findElement(By.xpath("//*[@id=\"serviceResultId\"]/div[2]/div/div[2]/div[2]/ul/li[1]/a/div/div[3]/span[4]")).click();
        Thread.sleep(15000);
        driver.getCurrentUrl();
        //choose room and click book on haboob
        driver.findElement(By.xpath("//*[@id=\"flightsmenu\"]/a")).click();
        Thread.sleep(10000);
        //click continue as guest
        driver.findElement(By.xpath("//*[@id=\"login-dialog\"]/div/input")).click();
        Thread.sleep(2000);
        //enter phone number
        driver.findElement(By.id("txtMobileNo")).sendKeys("0124135952");
        Thread.sleep(2000);
        //enter email
        driver.findElement(By.id("txtEmailId")).sendKeys("alhaj.s@sybertechnology.com");
        Thread.sleep(1000);


        //driver.quit();



    }
}
