package automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SelenPage {
	
	private WebDriver driver;
	
	private By HideButton = By.id("hide-textbox");
	
	//private By CheckHide = By.id("displayed-text");
	
	private By checkEmu = By.id("emu-checkbox");
	
	private By RadioButton = By.xpath("//*[@id=\"booksCheckboxes\"]/input[2]");
	
	private By Nahla = By.id("Nahla Course");
	
	private By Turski = By.xpath("//*[@id=\"Nahla Course\"]/option[4]");
	
	private By Promt = By.id("promptBox");
	
	private By Browser = By.id("win1");	
	
	private By volontiRaj = By.xpath("//*[@id=\"page\"]/div[3]/div/section[1]/div/div/div[5]/div/div/div[2]/div/div/p[3]/a");

	
    public SelenPage(WebDriver driver) {
		
		this.driver = driver;
	}


	public void clickHideButton() {
		
		driver.findElement(HideButton).click();
		
	}
	
        public void checkEmu() {
		
		driver.findElement(checkEmu).getAttribute("disabled");
		
	}


	public int getCheckBoxes(String checkbox) {
		
	List<WebElement> checkBoxList = driver.findElements(By.cssSelector("[type=\"" + checkbox + "\"]"));
					
					
	System.out.println("Number of checkboxes is: " + checkBoxList.size());
	
	return checkBoxList.size();
	
	}


	public void clickRadioButton() {
		
		driver.findElement(RadioButton).click();
	}


	public void clickNahla() {
		
		driver.findElement(Nahla).click();
		
	}


	public void chooseTurski() {
		
		driver.findElement(Turski).click();
		
		
	}


	public void clickPromt() {  // 7 i 8 zadatak
	
		driver.findElement(Promt).click();
		
		driver.switchTo().alert().sendKeys("Goga");
		driver.switchTo().alert().accept();
		
		String text = driver.findElement(By.id("demo")).getText();
	
		 System.out.println("Text displayed: "+ text);
	}


	public void getRowNr() {
		
		List<WebElement> row = driver.findElements(By.xpath("/html/body/form/div[7]/div/div/table/tbody/tr[position()>1]"));
	
		System.out.println("Number of Rows = " + row.size());
		
	}


	public void clickOpenBrowser() {
		
		driver.findElement(Browser).click();
	}


	public void reoderElemnts() {
		
        Actions action = new Actions(driver);
		
		WebElement sourceElement = driver.findElement(By.id("clickAndHold")); 
		
		WebElement targetElement = driver.findElement(By.id("click")); 
				
		action.dragAndDrop(sourceElement, targetElement).perform();
	}


	public void mouseOver() {
		
		Actions action = new Actions(driver);
		
		WebElement mouse = driver.findElement(By.id("demo2"));
		
		action.moveToElement(mouse).perform();
		
		
	}


	public void volontiRaj() {
		
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/iframe")));
		
		driver.findElement(volontiRaj).click();
		
		driver.switchTo().defaultContent();
		
	}


	public String getCurrentUrl() {
		
		return driver.getCurrentUrl();
	}





/*	public int getTableSize() throws InterruptedException{
	    List<WebElement> rowElements = driver.findElements(By.cssSelector("#practiceForm > div:nth-child(8) > div > div"));
	 
	  System.out.println("Text displayed: "+ rowElements);
	  
	  return  rowElements.size() -1;
    }*/



	/*public String getCheckHide(String nesto) {
		
		driver.findElement(CheckHide).isDisplayed();		
		return nesto;
	}*/


	

	



}
