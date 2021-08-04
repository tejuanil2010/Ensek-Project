package Screening.Ensek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SaleConfirmationPageObject {
	
	public WebDriver driver;
	
	By css=By.cssSelector("div[class=\"container body-content\"] h2");
	By xpath=By.xpath("//div[@class=\"container body-content\"]/p[2]/a");
	
	public SaleConfirmationPageObject(WebDriver driver) {
		this.driver=driver;
	}

	public WebElement confirmSale()
	{
		return driver.findElement(css);
	}
	public WebElement goback()
	{
		return driver.findElement(xpath);
	}

}
