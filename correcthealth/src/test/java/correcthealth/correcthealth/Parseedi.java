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

public class Parseedi {
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
		 	WebElement Edi = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='EDI']")));
		 	Edi.click(); 
		 	WebElement Parseedi = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Parse EDI']"))); 
		 	Parseedi.click();
	Thread.sleep(2000);

	 //Upload file
	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement fileInput = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles1")));
	File fileToUpload = new File("C:\\Users\\panini019\\Desktop\\CH_Unum_December_2024.xml"); // Update with the path to your PNG file
	fileInput.sendKeys(fileToUpload.getAbsolutePath());
	 Thread.sleep(2000);
	
    
  //Select Receiving date
    driver.findElement(By.id("ediReceivedDate")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement FROMDATE = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
    FROMDATE.click();
    WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='3'][data-year='2025']")));
    dosselect.click();
    
    Thread.sleep(3000);
    //Select type
    WebElement type = driver.findElement(By.id("ediFileType"));
    Select typeselect = new Select(type);
    typeselect.selectByVisibleText("837P");
    
    Thread.sleep(1000);
	
    WebElement parsebutton = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Parse EDI']")));
    parsebutton.click();
    
    Thread.sleep(5000);
	}
	@Test(enabled = false)
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
			 	WebElement inpatientrecord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Parse EDI']"))); 
			 	inpatientrecord.click();
		Thread.sleep(2000);
    //Search Function
    WebElement type1 = driver.findElement(By.id("ediFileType"));
    Select typeselect1 = new Select(type1);
    typeselect1.selectByVisibleText("837P");
    Thread.sleep(2000);
    
    driver.findElement(By.id("ediReceivedDate")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement FROMDATE1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
    FROMDATE1.click();
    WebElement dosselect1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='3'][data-year='2025']")));
    dosselect1.click();
    Thread.sleep(1000);
    driver.findElement(By.id("newSearch")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("clearSearch")).click();
    Thread.sleep(2000);
    //Delete
    WebElement delete = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_260']//td[contains(@class,'delete-control fileDeleteBtn2')]")));
    delete.click();
    Thread.sleep(1000);
    WebElement popup = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='confirm']")));
    popup.click();
    
	}}