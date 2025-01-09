package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Capandnoncapexpenses {
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
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement capandnoncapdata = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='CAP And Non-CAP Data']")));
		 	capandnoncapdata.click(); 
		 	Thread.sleep(3000);
		 	WebElement Expenses = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CAP and Non-CAP Expenses']"))); 
		 	Expenses.click();
	  Thread.sleep(2000);
	  
	  
	  //select facility
	  WebElement facility = driver.findElement(By.name("facilityCode"));
      Select facilityselect = new Select(facility);
      facilityselect.selectByVisibleText("Acadia Parish Jail");
      Thread.sleep(1500);
   // Click Search and Clear
	    WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
      search.click(); 
      Thread.sleep(3000);
      WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
      clear.click();
      Thread.sleep(2000);
       driver.findElement(By.xpath("//tr[@id='row_43']//td[@class='details_open-control']")).click();
       

     //Page navigation 
     		        WebElement pagenavigation = driver.findElement(By.name("capAndNonCapExpensesTable_length"));
     		        Select select4 = new Select(pagenavigation);
     		        select4.selectByVisibleText("80");
     		        Thread.sleep(3000);
     		        WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("capAndNonCapExpensesTable_next")));
     		        nextpage.click();
     		        Thread.sleep(5000);
     		        WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("capAndNonCapExpensesTable_previous")));
     		        previous.click();
     		        Thread.sleep(7000);
	  
	}}