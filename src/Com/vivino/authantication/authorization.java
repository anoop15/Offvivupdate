package Com.vivino.authantication;

import org.apache.xpath.compiler.Keywords;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class authorization {
	
	public WebDriver driver; 
	public void waitbyxpath(WebDriver driver, String Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Locator)));
	}

	public void waitbyid(WebDriver driver, String Locator) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id(Locator)));
	}
	
	public void loginforpremium(){
		driver.findElement(By.xpath(".//*[@id='menu']/nav/ul[2]/li/a[2]")).click();
		driver.findElement(By.xpath(".//*[@id='logins-login']/div/div/div[2]/p[4]/button")).click();
		waitbyid(driver, "form-btn");
		driver.findElement(By.id("logins-email-field")).sendKeys("anoop@vivino.com");
		driver.findElement(By.id("password")).sendKeys("anoop");
		driver.findElement(By.id("form-btn")).click();
		waitbyxpath(driver, ".//*[@id='menu']/nav/ul[2]/li/a/div");
		}
		 
		public void loginforfree(){
			driver.findElement(By.xpath(".//*[@id='menu']/nav/ul[2]/li/a[2]")).click();
			driver.findElement(By.xpath(".//*[@id='logins-login']/div/div/div[2]/p[4]/button")).click();
			waitbyid(driver, "form-btn");
			driver.findElement(By.id("logins-email-field")).sendKeys("sittu3@vivino.com");
			driver.findElement(By.id("password")).sendKeys("123");
			driver.findElement(By.id("form-btn")).click();
			waitbyxpath(driver, ".//*[@id='menu']/nav/ul[2]/li/a/div");
			}
		
	
}
