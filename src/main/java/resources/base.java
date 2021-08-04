package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {
	
	public Properties prop;
	public WebDriver driver;
	
		
	public WebDriver initializeDriver() throws IOException
	{
		
	  //Location of data.properties file to retrieve desired browser to be invoked
	  prop=new Properties();
	  FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties");
	  prop.load(fis);
	  String browserName=prop.getProperty("browser");
	  
	  
	  if(browserName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
		  driver=new ChromeDriver();
		  
	  }
	  else if(browserName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\geckodriver.exe");
		  driver=new FirefoxDriver();
	  }
	  else if(browserName.equals("IE"))
	  {
		  System.setProperty("webdriver.IE.driver", System.getProperty("user.dir")+"\\src\\main\\java\\resources\\IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
	  }
	  
	  
	  //timeouts to be used all over the project
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  
	  return driver;
	  
	}

}
