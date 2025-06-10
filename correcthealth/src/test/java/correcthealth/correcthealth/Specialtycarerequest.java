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

public class Specialtycarerequest {
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
 	WebElement clickspsummary = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Specialty Care Request']")));
 	clickspsummary.click(); 
 	Thread.sleep(5000);
 	
    //Select Status
    WebElement Status = driver.findElement(By.id("specialityCareStatus"));
    Select select4 = new Select(Status);
    select4.selectByVisibleText("Active");
    
    //Select date requested
   // driver.findElement(By.id("dateRequested")).click();
    
    
    //Select Facility
    driver.findElement(By.id("select2-autoCompleterFacilityId-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Test");
    WebElement facility = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Test (010)']")));
    facility.click();
    
    //Select patientname
    driver.findElement(By.id("select2-autoCompleterPatientID-container")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("Vijay");
    WebElement patientname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(text(),'Vijay Leo')]")));
    patientname.click();
    
  //Select Destination
    driver.findElement(By.xpath("//span[contains(text(),'Select Destination')]")).click();
    driver.findElement(By.xpath("//input[@role='textbox']")).sendKeys("ganga");
    WebElement destination = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[normalize-space()='Ganga Hospital']")));
    destination.click();
    
    //Select Visittype
    WebElement visittype = driver.findElement(By.id("visitType"));
    Select selecttype = new Select(visittype);
    selecttype.selectByVisibleText("OnSite");
    
    //Select servicetype
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement secondDropdown = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("serviceTypeId")));
    if (secondDropdown.isDisplayed()) {
    	Select selectSecond = new Select(secondDropdown);
    	wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@id='serviceTypeId']/option"), 1));
    	selectSecond.selectByIndex(1);
    	 System.out.println("Successfully selected options from both dropdowns!");
    } else {
        System.out.println("Second dropdown is not displayed.");
    }

    
    
        
        
    //Select reason
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement secondDropdown1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("serviceTypeReasonId")));
    if (secondDropdown1.isDisplayed()) {
    	Select selectSecond1 = new Select(secondDropdown1);
    	wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(By.xpath("//select[@id='serviceTypeReasonId']/option"), 1));
    	selectSecond1.selectByIndex(1);
    	 System.out.println("Successfully selected options from both dropdowns!");
    } else {
        System.out.println("Second dropdown is not displayed.");
    }

    
    driver.findElement(By.id("referrer")).sendKeys("akilanksa10@gmail.com");
    
    //add vitals sign data
    driver.findElement(By.id("vitalSignsTemperature")).sendKeys("98");
    driver.findElement(By.id("vitalSignsBloodPressure")).sendKeys("120");
    driver.findElement(By.id("vitalSignsRespirationRate")).sendKeys("76");
    driver.findElement(By.id("vitalSignsPulseRate")).sendKeys("99");
    driver.findElement(By.id("internalNotes")).sendKeys("Test Check");
    driver.findElement(By.id("requestForApproval1")).click();
    
}
}