package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class Flights_test {
    @Test
    public void flight() throws InterruptedException {
        //launch the browser
        System.setProperty("webdriver.edge.driver", "C:/Users/Alhaj/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        //navigate to url
        driver.get("http://haboob.travel");
        Thread.sleep(7000);
        //insert destination
        driver.findElement(By.xpath("//*[@id=\"txtARR0\"]")).sendKeys("doha");
        Thread.sleep(2000);
        //click doha airport
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div[1]/div/div[2]/div/flightautocomplete/div/div/div/div/ul/li[2]/span")).click();
        Thread.sleep(2000);
        //choose departure
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[6]/a")).click();
        Thread.sleep(3000);
        //close crisp live chat
        driver.findElement(By.xpath("//*[@id=\"crisp-chatbox\"]/div/a/span[1]/span/span/span/span[1]/span/span[1]")).click();
        Thread.sleep(2000);
        //choose return
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[2]/div/div/div[2]/div/div/div[1]/div/div/div[2]/div/div/div[2]/div[2]/div/input")).click();
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a")).click();
        Thread.sleep(1000);
        //click non-stop option
        /*driver.findElement(By.xpath("//*[@id=\"flightsection\"]/div[3]/div/div[1]/div/div[2]/div[2]/span/input")).click();
        Thread.sleep(1000);*/
        //click search flights
        driver.findElement(By.xpath("//*[@id=\"dvNationalityF\"]/div[2]/button")).click();
        Thread.sleep(10000);
        //click book on haboob
        driver.findElement(By.xpath("//*[@id=\"select-btn\"]")).click();
        Thread.sleep(5000);
        //click continue as guest
        driver.findElement(By.xpath("//*[@id=\"login-dialog\"]/div/input")).click();
        Thread.sleep(2000);
        //enter phone number
        driver.findElement(By.id("txtMobileNo")).sendKeys("0124135952");
        Thread.sleep(2000);
        //enter email
        driver.findElement(By.id("txtEmailId")).sendKeys("alhaj.s@sybertechnology.com");
        Thread.sleep(1000);
        //choose Mr title
        WebElement dd = driver.findElement(By.id("ddlTitle0"));
        Select select = new Select(dd);
        select.selectByValue("Mr");
        Thread.sleep(1000);
        //enter first name
        driver.findElement(By.id("txtFirstName0")).sendKeys("Alhaj");
        Thread.sleep(1000);
        //enter last name
        driver.findElement(By.id("txtLastName0")).sendKeys("Ali");
        Thread.sleep(1000);
        //Select date of birth
        driver.findElement(By.id("txtDOB0")).click();
        WebElement ddown = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select"));
        Select select1 = new Select(ddown);
        select1.selectByValue("1998");
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[7]/a")).click();
        Thread.sleep(1000);
        //enter passport number
        driver.findElement(By.id("txtPassportNo0")).sendKeys("P08138511");
        Thread.sleep(1000);
        //select passport expiry date
        driver.findElement(By.id("txtPassportExpiry0")).click();
        WebElement ddown1 = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select"));
        Select select2 = new Select(ddown1);
        select2.selectByValue("2026");
        driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[5]/a")).click();
        Thread.sleep(2000);
        //scroll down to payment
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("window.scrollBy(0,1800)");
        Thread.sleep(2000);
        //click to confirm terms and condition
        driver.findElement(By.id("TermConditions")).click();
        Thread.sleep(1000);
        //click read Disclaimer
        driver.findElement(By.id("ReadDisclaimer")).click();
        Thread.sleep(1000);
        //click proceed to payment
        driver.findElement(By.id("btnPaxSubmit")).click();
        Thread.sleep(10000);
        //quit browser
        driver.quit();
        Thread.sleep(1000);



    }
}
