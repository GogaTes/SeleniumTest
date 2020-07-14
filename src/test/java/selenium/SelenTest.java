package selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import automation.SelenPage;
import nahla.NahlaPage;


public class SelenTest {

private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//executable//chromedriver.exe");
	    
		ChromeOptions option= new ChromeOptions();
	//	option.addArguments("incognito");
	   
		driver= new ChromeDriver(option);
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	   
	    driver.manage().window().maximize();
	   
	    driver.get("https://amina-pez.github.io/automation/");
	   	
	}

	@Test(priority = 1)
	public void testSelenium () throws Exception {
		
		SelenPage test= new SelenPage(driver);
		
		test.clickHideButton(); //1
		
	//	String CheckHide = test.getCheckHide("Hide");
	//	Assert.assertEquals(CheckHide, "Hide", "Text should be hidden");
		
		test.checkEmu(); 
	
		int number = test.getCheckBoxes("checkbox");  
		Assert.assertEquals(number, 6, "Number of checkboxes is not 6");
		
		
		test.clickRadioButton(); 
		
		test.clickNahla();
		
		test.chooseTurski();
		
		test.clickPromt(); // 7 i 8 zadatak
		
		test.getRowNr();
		
		test.clickOpenBrowser();
		 
		
	/*	Set<String> allHands=driver.getWindowHandles();
		for(String hand: allHands) {
			driver.switchTo().window(hand);
			System.out.println("Current url " + driver.getCurrentUrl());
		}*/
		
		NahlaPage testna= new NahlaPage(driver);
		
	//	Assert.assertEquals(testna.getCurrentUrl(),"https://nahla.ba/", "User is on correct page");
		
	//	testna.oNama();
		
	//	Assert.assertEquals(testna.getCurrentUrl(),"https://nahla.ba/o-nama/#tim", "User is on correct page"); 
		
		driver.switchTo();
		
		
		
		test.reoderElemnts();
		
		test.mouseOver();
		
		test.volontiRaj();
		
	//	Assert.assertEquals(test.getCurrentUrl(),"https://nahla.ba/volontiraj/", "User is on correct page");
		
		Assert.assertEquals(test.getCurrentUrl(),"https://amina-pez.github.io/automation/", "User is on correct page");
	}	
		
	
	
}
