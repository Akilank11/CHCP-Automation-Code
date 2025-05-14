package correcthealth.correcthealth;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Edidetails {
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
	@Test (priority = 2)
	public void f() throws InterruptedException {
		  driver.get("http://localhost:8090/CHCP/login");
		 	driver.manage().window().maximize();
		 	
		 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
		 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		 	rememberme.click();
		 	driver.findElement(By.id("btn-login")).click();

		 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement patientrecord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='EDI']")));
		 	patientrecord.click(); 
		 	WebElement inpatientrecord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='EDI Details']"))); 
		 	inpatientrecord.click();
	Thread.sleep(2000);

	 //Create EDI Details
	driver.findElement(By.id("ediFileName")).sendKeys("Test1234");
	Thread.sleep(1000);
	driver.findElement(By.id("noOfClaimsReceived")).sendKeys("2");
	Thread.sleep(1000);
	driver.findElement(By.id("noOfClaimsRejected")).sendKeys("1");
	Thread.sleep(1000);
	
    
  //Select Receiving date
    driver.findElement(By.id("ediReceivedDate")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement FROMDATE = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
    FROMDATE.click();
    WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='3'][data-year='2025']")));
    dosselect.click();
    
    Thread.sleep(1000);
    //Select type
    WebElement type = driver.findElement(By.id("ediFileType"));
    Select typeselect = new Select(type);
    typeselect.selectByVisibleText("837P");
    
    Thread.sleep(1000);
	
    WebElement save = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("addNewData")));
    save.click();
    
    Thread.sleep(2000);
	}
	@Test (priority = 1)
	public void search() throws InterruptedException {
		
			  driver.get("http://localhost:8090/CHCP/login");
			 	driver.manage().window().maximize();
			 	
			 	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
			 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
			 	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
			 	rememberme.click();
			 	driver.findElement(By.id("btn-login")).click();

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 	WebElement patientrecord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='EDI']")));
			 	patientrecord.click(); 
			 	WebElement inpatientrecord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='EDI Details']"))); 
			 	inpatientrecord.click();
		Thread.sleep(2000);
    //Search Function
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement type1 = driver.findElement(By.id("ediFileType"));
    Select typeselect1 = new Select(type1);
    typeselect1.selectByVisibleText("837P");
    WebElement search = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='newSearch']")));
    search.click();
    Thread.sleep(1000);
    WebElement clear = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='clearNewData']")));
    clear.click();
    
    driver.findElement(By.id("ediReceivedDate")).click();
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement FROMDATE1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
    FROMDATE1.click();
    WebElement dosselect1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='3'][data-year='2025']")));
    dosselect1.click();
    Thread.sleep(1000);
    search.click();
    clear.click();
    driver.findElement(By.id("ediFileName")).sendKeys("Test123");
    search.click();
    clear.click();
	driver.findElement(By.id("noOfClaimsReceived")).sendKeys("2");
	search.click();
    clear.click();
	driver.findElement(By.id("noOfClaimsRejected")).sendKeys("1");
	search.click();
    clear.click();
    
  //Page navigation
	   
    
    WebElement pagenavigation = driver.findElement(By.name("ediDetailsSummaryTable_length"));
    Select select4 = new Select(pagenavigation);
    select4.selectByVisibleText("100");
    Thread.sleep(3000);
    WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ediDetailsSummaryTable_next")));
    nextpage.click();
    Thread.sleep(5000);
    WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ediDetailsSummaryTable_previous")));
    previous.click();
    Thread.sleep(8000);
  
    
	}}