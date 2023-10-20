package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class AgentRegistration_test {
    @Test
    public void agentregister_test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alhaj\\Downloads\\chrome-win64\\chrome-win64\\chrome.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://agents.haboob.travel/Home/PartnerRegistration");
        Thread.sleep(2000);
        driver.findElement(By.id("txtAgencyName")).sendKeys("PS Agency for test");
        Thread.sleep(2000);
        driver.findElement(By.id("ddlNatureOfBusiness")).click();
        Thread.sleep(1000);
        WebElement ddown = driver.findElement(By.id("ddlNatureOfBusiness"));
        Select select = new Select(ddown);
        select.selectByValue("3");
        Thread.sleep(2000);
        driver.findElement(By.id("ddlCountry")).click();
        Thread.sleep(2000);
        WebElement ddown1 = driver.findElement(By.id("ddlCountry"));
        Select select1 = new Select(ddown1);
        select1.selectByVisibleText("Sudan");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"crisp-chatbox\"]/div/a/span[1]/span/span/span/span[1]/span/span[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("ddlCity")).click();
        Thread.sleep(2000);
        WebElement ddown2 = driver.findElement(By.id("ddlCity"));
        Select select2 = new Select(ddown2);
        select2.selectByValue("KRT");
        Thread.sleep(3000);
        driver.findElement(By.name("Address")).sendKeys("Burri, Khartoum");
        Thread.sleep(2000);
        driver.findElement(By.id("txtpostCode")).sendKeys("123456");
        Thread.sleep(2000);
        driver.findElement(By.id("ddlTimeZone")).click();
        WebElement ddown3 = driver.findElement(By.id("ddlTimeZone"));
        Select select3 = new Select(ddown3);
        select3.selectByVisibleText("(GMT +02:00) Cairo");
        Thread.sleep(2000);
        driver.findElement(By.id("IATAStatusApp")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("txtIataNo")).sendKeys("12345");
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");
        Thread.sleep(2000);
        driver.findElement(By.id("txtFName")).sendKeys("Alhaj");
        Thread.sleep(1000);
        driver.findElement(By.id("txtLName")).sendKeys("Sharaf");
        Thread.sleep(1000);
        driver.findElement(By.id("ddlTCode")).click();
        Thread.sleep(1000);
        WebElement ddown4 = driver.findElement(By.id("ddlTCode"));
        Select select4 = new Select(ddown4);
        select4.selectByValue("+249");
        Thread.sleep(1000);
        driver.findElement(By.name("Phone")).sendKeys("124135952");
        Thread.sleep(1000);
        driver.findElement(By.id("txtDesignation")).sendKeys("PS Travel");
        Thread.sleep(1000);
        driver.findElement(By.name("CountrydialCode")).click();
        Thread.sleep(1000);
        WebElement ddown5 = driver.findElement(By.name("CountrydialCode"));
        Select select5 = new Select(ddown5);
        select5.selectByVisibleText("Sudan +249");
        Thread.sleep(1000);
        driver.findElement(By.id("txtMobile")).sendKeys("124135952");
        Thread.sleep(1000);
        driver.findElement(By.name("EmailId")).sendKeys("alhaj.s@sybertechnology.com");
        Thread.sleep(1000);
        driver.findElement(By.id("txtUserName")).sendKeys("psagent");
        Thread.sleep(1000);
        driver.findElement(By.name("Password")).sendKeys("Haboob1117.");
        Thread.sleep(1000);
        driver.findElement(By.id("txtRePwd")).sendKeys("Haboob1117.");
        Thread.sleep(1000);
        driver.findElement(By.id("btnSubmitA")).click();
        Thread.sleep(3000);
        String ExpectedTitle = "Haboob - Agents";
        String ActualTitle = driver.getTitle();
        System.out.println("The title of the web page is: " + ActualTitle);
        if (ActualTitle.equals(ExpectedTitle)){
            System.out.println("Test is Successful");
        }
        else {
            System.out.println("Test is Failure");
        }
        driver.quit();



    }
}
