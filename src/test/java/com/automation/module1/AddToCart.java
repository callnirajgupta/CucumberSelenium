package com.automation.module1;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.automation.common.GlobalStepDefinition;
import com.automation.pageobjectmodel.AddToCart_PO;
import com.automation.pageobjectmodel.ShoppingCartSummaryPage_PO;
import com.automation.pageobjectmodel.WelcomePage_PO;
import com.automation.util.SeleniumUtil;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCart {
	
	private static final Logger LOGGER=LogManager.getLogger(Login.class);
	String item;
	String sku;
	
	@When("^user searches for the \"(.*?)\"$")
	public void user_searches_for_the(String arg1) throws Throwable {
		if(GlobalStepDefinition.getRunMode().equalsIgnoreCase("Y")){
			GlobalStepDefinition.scenario.write(" inside user searches for the ");
		LOGGER.info("######  Inside user_searches_for_the ##############"+arg1);
		item=arg1;
		WelcomePage_PO.searchItem(item);
		
		SeleniumUtil.ValidateWebElementVisible(By.xpath(AddToCart_PO.AddToCart_ProductImage_XPATH.replace("ProductName", item)));
		
		//Assert.assertTrue("Object is NOT displayed",SeleniumUtil.validateWebElementDisplay(By.xpath(AddToCart_PO.AddToCart_ProductImage_XPATH.replace("ProductName", item))));
		//Assert.assertTrue("Object is NOT displayed-Count-0",SeleniumUtil.validateWebElementCount(By.xpath(AddToCart_PO.AddToCart_ProductImage_XPATH.replace("ProductName", item)))>0);
	
		
		
		}
	    
	}

	@And("^user Add To Cart and Proceed to checkout$")
	public void verify_item_is_present() throws Throwable {
		if(GlobalStepDefinition.getRunMode().equalsIgnoreCase("Y")){
		AddToCart_PO.clickProductImageFromSearchResult(item);
		AddToCart_PO.clickCheckOut();
		
		
		}
	}

	


	@Then("^summary section shows the added item$")
	public void summary_section_shows_the_added_item() throws Throwable {
		if(GlobalStepDefinition.getRunMode().equalsIgnoreCase("Y")){
		SeleniumUtil.ValidateWebElementPresence(By.cssSelector(ShoppingCartSummaryPage_PO.ShoppingCartSummary_ProductText_CSS.replace("ProductName", item)));
	}
	}

	@When("^user delete the item with sku as \"(.*?)\"$")
	public void user_clicks_on_delete(String arg1) throws Throwable {
		if(GlobalStepDefinition.getRunMode().equalsIgnoreCase("Y")){
		sku=arg1;	
		
	    ShoppingCartSummaryPage_PO.deleteItem(sku);
		}
	    
	}


	
	

	@Then("^added item should be removed$")
	public void Then_added_item_should_be_removed() throws Throwable {
		if(GlobalStepDefinition.getRunMode().equalsIgnoreCase("Y")){
		SeleniumUtil.wait(5000);
		
		Assert.assertTrue("Item NOT deleted successfully",SeleniumUtil.validateWebElementCount(By.cssSelector(ShoppingCartSummaryPage_PO.ShoppingCartSummary_ProductText_CSS.replace("ProductName", item)))==0);
		
		} 
	}
	

	
	
	
	
	
	

}
