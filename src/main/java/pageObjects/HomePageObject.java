package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObject {
	
	public WebDriver driver;
	
	//Elements
	By buyEnergyButton=By.cssSelector("div[class=\"col-md-4\"] a[href*=\"Buy\"]");
	
	public HomePageObject(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	//Method for WebElements
	public WebElement goToBuyEnergy()
	{
		return driver.findElement(buyEnergyButton);
	}

}
