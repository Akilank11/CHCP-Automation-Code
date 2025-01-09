package correcthealth.correcthealth;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Forgetpassword {


	
	WebDriver driver = new ChromeDriver();
	  @Test
	  public void f() throws InterruptedException {
		
	 	 driver.get("http://localhost:8080/CHCP/login");
	 	driver.manage().window().maximize();
	 	driver.findElement(By.xpath("//b[contains(text(),'Forgot Password?')]")).click();
	 	driver.findElement(By.id("email")).sendKeys("akilanksa10@gmail.com");
	 	Thread.sleep(3000);
	 	driver.findElement(By.id("forgotBtn")).click();
	 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement messageElement = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='alert alert-danger fade in']")));  // Replace with actual ID or selector of the message
        String displayedMessage = messageElement.getText();
        System.out.println("Captured message: " + displayedMessage);
        driver.findElement(By.xpath("//b[normalize-space()='Back to Login']")).click();

	  }
	  
}