package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Capstatusreport {
	WebDriver driver = new ChromeDriver();
	//WebDriver driver;
	//FirefoxOptions firefoxoptions = new FirefoxOptions();
	//ChromeOptions chromeoptions = new ChromeOptions();
	//EdgeOptions edgeoptions = new EdgeOptions();

	//@Parameters("browser")
	//@BeforeTest

	//public void initialize(String browser) 

	//{
		// if (browser.equalsIgnoreCase("chrome")) {
	          
	           // driver = new ChromeDriver();
	        //} else if (browser.equalsIgnoreCase("firefox")) {
	            
	            //driver = new FirefoxDriver();
	       // } else if (browser.equalsIgnoreCase("edge")) {
	           
	            //driver = new EdgeDriver();
	        //}
	        //driver.manage().window().maximize();
	    //}
	@Test
	public void f() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@9090");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement capandnoncapdata = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='CAP And Non-CAP Data']")));
		 	capandnoncapdata.click(); 
		 	Thread.sleep(3000);
		 	WebElement statusreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CAP Status Report']"))); 
		 	statusreport.click();
	  Thread.sleep(2000);
	  
	  
	  Actions act = new Actions(driver);
WebElement ele = driver.findElement(By.xpath("(//option[@value='23'][normalize-space()='Barrow County Jail (124)'])[1]")); 
	act.doubleClick(ele).perform();
	  
	  
	  //select facility
	  WebElement contractYear = driver.findElement(By.name("contractYear"));
      Select contractYearselect = new Select(contractYear);
      contractYearselect.selectByVisibleText("Current Contract Year");
      
      
      driver.findElement(By.id("newSearch")).click();
      Thread.sleep(2000);
      driver.findElement(By.id("clearSearch")).click();
      
  }
}
