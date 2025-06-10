package correcthealth.correcthealth;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Readyforvisit {
	WebDriver driver = new ChromeDriver();


@Test
public void f() throws InterruptedException {
	
	 driver.get("http://localhost:8080/CHCP/login");
	driver.manage().window().maximize();

	driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
 	driver.findElement(By.id("password")).sendKeys("Dev@7070");
	WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	rememberme.click();
	driver.findElement(By.id("btn-login")).click();

	driver.findElement(By.xpath("//a[normalize-space()='Specialty Care']")).click();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	WebElement clickspsummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Specialty Care Status']")));
 	clickspsummary.click(); 

 	Thread.sleep(15000);
 	WebElement readyforvisit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Ready For Visit']")));
 	readyforvisit.click(); 
 	Thread.sleep(5000);
 	
 	//WebElement pendingschedule = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Pending Scheduling']")));
 	//pendingschedule.click(); 
 	
 	
 	
 	//Select Facility
    driver.findElement(By.xpath("//span[contains(text(),'Select Facility')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Forsyth County Detention Center");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Forsyth County Detention Center (149)']")));
    facility.click();
    
    //Select patientid
    driver.findElement(By.xpath("//span[contains(text(),'Select Patient ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("149-P00327");
    WebElement patientid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'149-P00327')]")));
    patientid.click();
    
    //Select patientname
    driver.findElement(By.xpath("//span[contains(text(),'Select Patient Name')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("RAINEY BRENDA A");
    WebElement patientname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'RAINEY BRENDA A')]")));
    patientname.click();
    
  //Select Destination
    driver.findElement(By.xpath("//span[contains(text(),'Select Destination')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("2020 Medical Consulting Inc");
    WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='2020 Medical Consulting Inc']")));
    destination.click();
    
    //Select referrer
    driver.findElement(By.xpath("//span[contains(text(),'Select Referrer')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("zee");
    WebElement referrer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='zee']")));
    referrer.click();
    
  //Select visitid
    driver.findElement(By.xpath("//span[contains(text(),'Select Visit ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("149-V03065");
    WebElement VISITID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='149-V03065']")));
    VISITID.click();

    
    //Select visitTYPE
      driver.findElement(By.xpath("//span[contains(text(),'Select Visit Type')]")).click();
      driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("OffSite");
      WebElement Visittype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='OffSite']")));
      Visittype.click();


      //Select Servicetype
        driver.findElement(By.xpath("//span[contains(text(),'Select Service Type')]")).click();
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("DialysisOff");
        WebElement Servicetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='DialysisOff']")));
        Servicetype.click();

      //Select Status
        WebElement Status = driver.findElement(By.id("specialityCareStatus"));
        Select select4 = new Select(Status);
        select4.selectByVisibleText("Active");
       
      //Click Search
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
        search.click(); 
        
        //Click Clear
        Thread.sleep(5000);
        WebElement cleartext = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
        cleartext.click();
        
        
    	//Prepare Visit
        Thread.sleep(5000);
        WebElement schedulevisit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_3119757']//a[contains(text(),'PrepareVisit')]")));
        schedulevisit.click(); 
        driver.findElement(By.id("internalNotes")).sendKeys("Verify and Submit");
        WebElement Transfertype = driver.findElement(By.id("transferType"));
        Select Transfertypeselect = new Select(Transfertype);
        Transfertypeselect.selectByVisibleText("EMS");
        
        driver.findElement(By.xpath("(//div[@class='xdsoft_calendar'])[3]")).click();
        driver.findElement(By.xpath("(//button[normalize-space()='Ok'])[1]")).click();
        driver.findElement(By.id("gotoSummary")).click();
        
        //Reschedule Visit
        WebElement reschedulevisit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_3119757']//a[contains(text(),'Reschedule Visit')]")));
        reschedulevisit.click(); 
        WebElement Rescheduled = driver.findElement(By.id("rescheduled"));
        Select Rescheduledselect = new Select(Rescheduled);
        Rescheduledselect.selectByVisibleText("Yes");
        driver.findElement(By.xpath("(//div[@class='xdsoft_calendar'])[2]")).click();
        WebElement Transfertype1 = driver.findElement(By.id("transferType"));
        Select Transfertypeselect1 = new Select(Transfertype1);
        Transfertypeselect1.selectByVisibleText("EMS");
        driver.findElement(By.xpath("(//div[@class='xdsoft_calendar'])[3]")).click();
        
        WebElement RescheduleReason = driver.findElement(By.id("rescheduleReason"));
        Select RescheduleReasonselect1 = new Select(RescheduleReason);
        RescheduleReasonselect1.selectByVisibleText("Patient in court");
        driver.findElement(By.id("readyRescheduleVisitBtn3")).click();
        WebElement okayclick = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[normalize-space()='Ok'])[1]")));
        okayclick.click();
        driver.findElement(By.xpath("//img[@id='gotoSummary']")).click();
        
        
        
        
}}