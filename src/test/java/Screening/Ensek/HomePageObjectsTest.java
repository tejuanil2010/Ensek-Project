package Screening.Ensek;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.HomePageObject;
import resources.base;

public class HomePageObjectsTest extends base{

	@BeforeTest
	public void initialize() throws IOException
	{
		//Driver initialization
		driver=initializeDriver();
		
		//invoke browser
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void homepageClickFunctionality()
	{
		HomePageObject hpo=new HomePageObject(driver);
		hpo.goToBuyEnergy().click();
	}
	
	@AfterTest
	public void screenShot() throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"\\Screenshots\\HomePageLanding.png") );
		
	}
	
}
