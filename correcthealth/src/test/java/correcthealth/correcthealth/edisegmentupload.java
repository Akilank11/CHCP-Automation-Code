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

public class edisegmentupload {
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
		 	WebElement patientrecord = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='EDI']")));
		 	patientrecord.click(); 
		 	WebElement inpatientrecord = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='EDI Segment Upload']"))); 
		 	inpatientrecord.click();
	Thread.sleep(2000);

	 //Upload file
	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement fileInput = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles1")));
	File fileToUpload = new File("C:\\Users\\panini019\\Desktop\\xml-to-text-converter.txt"); // Update with the path to your PNG file
	fileInput.sendKeys(fileToUpload.getAbsolutePath());
	 Thread.sleep(2000);
	 
	//Select type
	    WebElement type = driver.findElement(By.id("ediFileType"));
	    Select typeselect = new Select(type);
	    typeselect.selectByVisibleText("837P");
	    
	    Thread.sleep(1000);
	 
	 driver.findElement(By.xpath("//button[normalize-space()='EDI Segment Upload']")).click();
	 
	}}