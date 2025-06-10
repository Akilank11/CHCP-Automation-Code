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

public class offsitependingreturn {WebDriver driver = new ChromeDriver();


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
 	//Actions action = new Actions(driver);
 	//WebElement we = driver.findElement(By.xpath("//a[normalize-space()='Internal Consult']"));
 	//action.moveToElement(we).click().build().perform();
 	WebElement offsitepending = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Offsite / Pending Return']")));
 	offsitepending.click(); 
 	Thread.sleep(2000);
 	
 	
	//Select Facility
    driver.findElement(By.xpath("//span[contains(text(),'Select Facility')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Carroll County Prison");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Carroll County Prison (119)']")));
    facility.click();
    
    //Select patientid
    driver.findElement(By.xpath("//span[contains(text(),'Select Patient ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("119-P00103");
    WebElement patientid = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'119-P00103')]")));
    patientid.click();
    
    //Select patientname
    driver.findElement(By.xpath("//span[contains(text(),'Select Patient Name')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Victor Marcus T");
    WebElement patientname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Victor Marcus T')]")));
    patientname.click();
    
  //Select Destination
    driver.findElement(By.xpath("//span[contains(text(),'Select Destination')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("24 ON PHYSICIANS PC");
    WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='24 ON PHYSICIANS PC']")));
    destination.click();
    
    //Select referrer
    driver.findElement(By.xpath("//span[contains(text(),'Select Referrer')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("zee");
    WebElement referrer = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='zee']")));
    referrer.click();
    
  //Select visitid
    driver.findElement(By.xpath("//span[contains(text(),'Select Visit ID')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("119-V01249");
    WebElement VISITID = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='119-V01249']")));
    VISITID.click();

    
    //Select visitTYPE
      driver.findElement(By.xpath("//span[contains(text(),'Select Visit Type')]")).click();
      driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("OffSiteER");
      WebElement Visittype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='OffSiteER']")));
      Visittype.click();


      //Select Servicetype
        driver.findElement(By.xpath("//span[contains(text(),'Select Service Type')]")).click();
        driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ER");
        WebElement Servicetype = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='ER']")));
        Servicetype.click();

      //Select Status
        //WebElement Status = driver.findElement(By.id("specialityCareStatus"));
        //Select select4 = new Select(Status);
        //select4.selectByVisibleText("Active");
       
      //Click Search
        WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
        search.click(); 
        
        //Click Clear
        Thread.sleep(500);
        WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='clearSearch']")));
        clear.click(); 
        
        
        
        //update return release
      Thread.sleep(1000);
        WebElement updaterow = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_3119767']//a[contains(text(),'Update Return/Release')]")));
        updaterow.click();
        WebElement return1 = driver.findElement(By.id("returnOrRelease"));
        Select release = new Select(return1);
        release.selectByVisibleText("Return");
        driver.findElement(By.id("completeVisitNotes")).sendKeys("Test");
        driver.findElement(By.id("requestClosingDate")).click();
    	WebElement claimwithout3 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='12'][data-month='11'][data-year='2024']")));
     	claimwithout3.click();  
     	driver.findElement(By.id("updateReturnReleaseBtn3")).click();
     	driver.findElement(By.id("gotoSummary")).click();
     	
     	//Reschedule visit
     	
     	 WebElement reschedulevisit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'RescheduleVisit')])[1]")));
     	reschedulevisit.click();
driver.findElement(By.id("rescheduleVisitBtn1")).click();
driver.findElement(By.id("gotoSummary")).click();






}}