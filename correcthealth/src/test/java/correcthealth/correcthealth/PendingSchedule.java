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

public class PendingSchedule {
	WebDriver driver = new ChromeDriver();


@Test
public void f() throws InterruptedException {
	
	 driver.get("http://localhost:8090/CHCP/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	driver.findElement(By.id("password")).sendKeys("Dev@9090");
	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	rememberme.click();
	driver.findElement(By.id("btn-login")).click();

	driver.findElement(By.xpath("//a[normalize-space()='Specialty Care']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	WebElement clickspsummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Specialty Care Status']")));
 	clickspsummary.click(); 
 	Thread.sleep(15000);

 	WebElement pendingschedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Pending Scheduling']")));
 	pendingschedule.click(); 
 	Thread.sleep(5000);
 	
 	
 	//Select Facility
    driver.findElement(By.xpath("//span[contains(text(),'Select Facility')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Bartow County Jail");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Bartow County Jail']")));
    facility.click();
    
    //Select patientid
    driver.findElement(By.xpath("//span[@id='select2-autoCompleterPatientID-container']")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("114-P02312");
    WebElement patientid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'114-P02312')]")));
    patientid.click();
    
    //Select patientname
    driver.findElement(By.id("select2-autoCompleterPatientName-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Stutler Willie");
    WebElement patientname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Stutler Willie')]")));
    patientname.click();
    
  //Select Destination
    driver.findElement(By.xpath("//span[contains(text(),'Select Destination')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ASHLAND EMERGENCY MEDICINE ASSOCIATES");
    WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='ASHLAND EMERGENCY MEDICINE ASSOCIATES']")));
    destination.click();
    
    //Select referrer
    driver.findElement(By.xpath("//span[contains(text(),'Select Referrer')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("zee");
    WebElement referrer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='zee']")));
    referrer.click();
    
  //Select visitid
    driver.findElement(By.xpath("//span[contains(text(),'Select Visit ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("114-V05022");
    WebElement VISITID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='114-V05022']")));
    VISITID.click();

    
    //Select visitTYPE
      driver.findElement(By.xpath("//span[contains(text(),'Select Visit Type')]")).click();
      driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("OffSite");
      WebElement Visittype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='OffSite']")));
      Visittype.click();


      //Select Servicetype
        driver.findElement(By.xpath("//span[contains(text(),'Select Service Type')]")).click();
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("XRay");
        WebElement Servicetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='XRay']")));
        Servicetype.click();

      //Select Status
        WebElement Status = driver.findElement(By.id("specialityCareStatus"));
        Select select4 = new Select(Status);
        select4.selectByVisibleText("Active");
       
      //Click Search
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
        search.click(); 
        
        //Click Clear
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
        clear.click(); 
        
    	//Resubmit edit
        WebElement schedulevisit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_3119766']//a[contains(text(),'Schedule Visit')]")));
        schedulevisit.click(); 
        driver.findElement(By.id("internalNotes")).sendKeys("Verify and Submit");
        driver.findElement(By.id("dateofService")).click();
        driver.findElement(By.xpath("(//div[@class='xdsoft_calendar'])[2]")).click();
        driver.findElement(By.id("dateofTransform")).click();
        driver.findElement(By.xpath("(//div[@class='xdsoft_calendar'])[3]")).click();
        driver.findElement(By.id("pendingSchedulingBtn3")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Ok'])[1]")).click();
        driver.findElement(By.id("gotoSummary")).click();
}}