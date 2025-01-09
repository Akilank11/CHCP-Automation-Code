package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Usertype { 
	WebDriver driver;
FirefoxOptions firefoxoptions = new FirefoxOptions();
ChromeOptions chromeoptions = new ChromeOptions();
EdgeOptions edgeoptions = new EdgeOptions();

@Parameters("browser")
@BeforeTest

public void initialize(String browser) 

{
	 if (browser.equalsIgnoreCase("chrome")) {
          
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
           
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

  @Test
  public void f() throws InterruptedException {
	  
	  driver.get("http://localhost:8090/CHCP/login");
	 	driver.manage().window().maximize();
	 	
	 	driver.findElement(By.id("userName")).sendKeys("akilanksa10@gmail.com");
	 	driver.findElement(By.id("password")).sendKeys("Dev@1234");
	 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	 	rememberme.click();
	 	driver.findElement(By.id("btn-login")).click();
	 	driver.findElement(By.xpath("//a[normalize-space()='Users']")).click();
	 	
	 	//Open usertype
	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usertypeclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("a[href='/CHCP/user/userTypeSummary']")));
        usertypeclick.click();
        
        //Click Edit user
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement editusertype = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(@class,'edit-control')])[5]")));
        editusertype.click();
        driver.findElement(By.id("rolename")).clear();
        driver.findElement(By.id("rolename")).sendKeys("Corporate Admin");
        
        driver.findElement(By.xpath("//input[@id='editSave_30']")).click();
        driver.findElement(By.xpath("//input[@id='editSave_31']")).click();
        driver.findElement(By.xpath("//input[@id='editSave_32']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
        WebElement messageElement = wait1.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-success fade in']")));  // Replace with actual ID or selector of the message
        String displayedMessage = messageElement.getText();
        System.out.println("Captured message: " + displayedMessage);
        WebElement backbutton= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-md-4 col-sm-4 col-xs-12 text-left']//img[@class='img-responsive goSummary']")));
        backbutton.click();
        
        //Add new role
       
        driver.findElement(By.id("newAdminAcc")).click();
        driver.findElement(By.id("rolename")).sendKeys("Test Role");
        driver.findElement(By.xpath("(//input[@id='editSave_7'])[1]")).click();
        driver.findElement(By.xpath("(//input[@id='delete_7'])[1]")).click();
        driver.findElement(By.xpath("(//input[@id='download_7'])")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("savebtn1")).click();
        
      driver.findElement(By.xpath("(//img[@class='img-responsive goSummary'])[1]")).click();
        
  }
  
  
}
