package nahla;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NahlaPage {

	private WebDriver driver;
	
	private By oNama = By.xpath("//*[@id=\"menu-item-22\"]/a");
	
	
public NahlaPage(WebDriver driver) {
		
		this.driver = driver;
		
}



public void oNama() {
	
	Actions action = new Actions(driver);
	WebElement testna = driver.findElement(oNama);
	action.moveToElement(testna).perform();
	
	driver.findElement(By.xpath("//*[@id=\"menu-item-1464\"]/a")).click();
	
	driver.close();
}



public String getCurrentUrl() {
	
	return driver.getCurrentUrl();
	
}

   
	
	
	
}
