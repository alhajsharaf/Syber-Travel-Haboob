package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class AgentLogin_test {
    @Test
    public void agentlogin() throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "C:/Users/Alhaj/Downloads/edgedriver_win64/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://agents.haboob.travel");
        Thread.sleep(2000);
        driver.findElement(By.name("RequestBody.UserDetails.UserName")).sendKeys("psagent");
        Thread.sleep(1000);
        driver.findElement(By.id("txtPassword")).sendKeys("Haboob1117.");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"main\"]/div/div/div/div/form/div[1]/div[3]/div/button")).click();
        Thread.sleep(3000);
        String ExpectedTitle = "Haboob - Agents";
        String ActualTitle = driver.getTitle();
        System.out.println("The web page title is :"+ActualTitle);
        if(ActualTitle.equals(ExpectedTitle)){
            System.out.println("Test is Successful");
        }
        else{
            System.out.println("Test is Failure");
        }
        driver.quit();
    }
}
