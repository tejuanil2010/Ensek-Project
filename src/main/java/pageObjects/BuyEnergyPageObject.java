package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BuyEnergyPageObject {
	
	public WebDriver driver;
	
	By css=By.cssSelector("table[class=\"table\"] tbody tr:nth-child(1) td:nth-child(6) input");
	By Xpath=By.xpath("//table[@class=\"table\"]/tbody/tr[1]/td[5]/input");
	By Xpath1=By.xpath("//div[@class=\"well col-lg-9\"]/table/tbody/tr[1]/td[3]");
	By css1=By.cssSelector("table[class=\"table\"] tbody tr:nth-child(3) td:nth-child(6) input");
	By Xpath2=By.xpath("//table[@class=\"table\"]/tbody/tr[3]/td[5]/input");
	By Xpath3=By.xpath("//div[@class=\"well col-lg-9\"]/table/tbody/tr[3]/td[3]");
	By name1= By.name("Reset");
	By css2=By.cssSelector("table[class=\"table\"] tbody tr:nth-child(4) td:nth-child(6) input");
	By Xpath4=By.xpath("//table[@class=\"table\"]/tbody/tr[4]/td[5]/input");
	By Xpath5=By.xpath("//div[@class=\"well col-lg-9\"]/table/tbody/tr[4]/td[3]");
	//By Xpath6=By.xpath("//input[@name=\"Reset\"]");
	
	public BuyEnergyPageObject(WebDriver driver) {
		this.driver=driver;	
	}

	public WebElement supplyUnitsToBuy()
	{
		return driver.findElement(css);
	}
	
	public WebElement buyButton()
	{
		return driver.findElement(Xpath);
	}
	
	public WebElement availQty()
	{
		return driver.findElement(Xpath1);
	}
	
	public WebElement Reset()
	{
		return driver.findElement(name1);
	}
	
	public WebElement electricityUnitsToBuy()
	{
		return driver.findElement(css1);
	}
	
	public WebElement electricityBuyButton()
	{
		return driver.findElement(Xpath2);
	}
	
	public WebElement availElecQty()
	{
		return driver.findElement(Xpath3);
		
	}
	
	public WebElement oilUnitsToBuy()
	{
		return driver.findElement(css2);
	}
	
	public WebElement oilBuyButton()
	{
		return driver.findElement(Xpath4);
	}
	
	public WebElement availOilQty()
	{
		return driver.findElement(Xpath5);
	}
}
