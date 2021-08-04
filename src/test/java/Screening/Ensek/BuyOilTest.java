package Screening.Ensek;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.BuyEnergyPageObject;
import pageObjects.HomePageObject;
import resources.base;

public class BuyOilTest extends base {

	HomePageObject hpo;
	BuyEnergyPageObject bepo;

	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		hpo = new HomePageObject(driver);
		hpo.goToBuyEnergy().click();
		bepo = new BuyEnergyPageObject(driver);
		bepo.Reset().click();
	}

	@Test(dataProvider = "quantity-data-provider")
	public void buyEnergyTest(String data) throws InterruptedException, IOException {
		// System.out.println("Data from DP" + data);
		int quantity = Integer.parseInt(data);
		int availquantity = Integer.parseInt(bepo.availOilQty().getText());
		if (quantity > 0 && quantity <= availquantity) {
			bepo.oilUnitsToBuy().sendKeys(data);
			bepo.oilBuyButton().click();
			SaleConfirmationPageObject scpo = new SaleConfirmationPageObject(driver);
			String saleConfmsg = scpo.confirmSale().getText();
			Thread.sleep(1000);
			scpo.goback().click();
		} else {
			Assert.fail("Enter valid quantity");
		}

	}

	@DataProvider(name = "quantity-data-provider")
	public Object[][] dpMethod() {
		return new Object[][] { { "0" }, { "1" }, { "30" }, { "-1" } };
	}

	@AfterTest
	public void browserClose() {
		driver.close();
	}
}
