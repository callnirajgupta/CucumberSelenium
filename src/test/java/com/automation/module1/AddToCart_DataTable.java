package com.automation.module1;
/*package com.ingcapgemini.wm.module1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.ingcapgemini.wm.pageobjectmodel.AddToCart_PO;
import com.ingcapgemini.wm.pageobjectmodel.ShoppingCartSummaryPage_PO;
import com.ingcapgemini.wm.pageobjectmodel.WelcomePage_PO;
import com.ingcapgemini.wm.util.SeleniumUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart_DataTable {
	
	private static final Logger LOGGER=LogManager.getLogger(Login.class);
	String item;
	String sku;
	
	@When("^user searches for the \"(.*?)\"$")
	public void user_searches_for_the(String arg1) throws Throwable {
		LOGGER.info("######  Inside user_searches_for_the ##############"+arg1);
		item=arg1;
		WelcomePage_PO.searchItem(item);
		
		SeleniumUtil.ValidateWebElementVisible(By.xpath(AddToCart_PO.AddToCart_ProductImage_XPATH.replace("ProductName", item)));
		
		//Assert.assertTrue("Object is NOT displayed",SeleniumUtil.validateWebElementDisplay(By.xpath(AddToCart_PO.AddToCart_ProductImage_XPATH.replace("ProductName", item))));
		//Assert.assertTrue("Object is NOT displayed-Count-0",SeleniumUtil.validateWebElementCount(By.xpath(AddToCart_PO.AddToCart_ProductImage_XPATH.replace("ProductName", item)))>0);
	
		
		
	    
	}

	@And("^user Add To Cart and Proceed to checkout$")
	public void verify_item_is_present() throws Throwable {
		AddToCart_PO.clickProductImageFromSearchResult(item);
		AddToCart_PO.clickCheckOut();
		
		
		
	}

	


	@Then("^summary section shows the added item$")
	public void summary_section_shows_the_added_item() throws Throwable {
		SeleniumUtil.ValidateWebElementPresence(By.cssSelector(ShoppingCartSummaryPage_PO.ShoppingCartSummary_ProductText_CSS.replace("ProductName", item)));
	}

	@When("^user delete the item with sku as \"(.*?)\"$")
	public void user_clicks_on_delete(String arg1) throws Throwable {
		sku=arg1;	
		
	    ShoppingCartSummaryPage_PO.deleteItem(sku);
	}


	
	

	@Then("^added item should be removed$")
	public void Then_added_item_should_be_removed() throws Throwable {
		
		SeleniumUtil.wait(5000);
		
		Assert.assertTrue("Item NOT deleted successfully",SeleniumUtil.validateWebElementCount(By.cssSelector(ShoppingCartSummaryPage_PO.ShoppingCartSummary_ProductText_CSS.replace("ProductName", item)))==0);
		
	    
	}
	

	
	
	
	
	
	

}
*/