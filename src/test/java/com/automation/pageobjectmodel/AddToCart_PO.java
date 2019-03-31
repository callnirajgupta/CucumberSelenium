package com.automation.pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.util.SeleniumUtil;

public class AddToCart_PO {

	public static final String AddToCart_AddToCardButton_XPATH = "//p[@id='add_to_cart']/button[@name='Submit']";

	public static String AddToCart_ProductImage_XPATH = "//img[@alt='ProductName'][@title='ProductName']";

	public static String AddToCart_Frame_ToClickAddToCart_XPATH = "//iframe[contains(@id,'fancybox-frame')][@class='fancybox-iframe']";

	public static final String AddToCart_ProceedtoCheckOutButton_XPATH = "//span[contains(text(),'Proceed to checkout')]//i[@class='icon-chevron-right right']";

	// public static final String
	// AddToCart_ProductImage_CSS="a[class='product-name'][title='ProductName']";

	public static void clickProductImageFromSearchResult(String item) throws InterruptedException {

		AddToCart_ProductImage_XPATH = AddToCart_ProductImage_XPATH.replace("ProductName", item);

		SeleniumUtil.clickWebElement(By.xpath(AddToCart_ProductImage_XPATH));

		SeleniumUtil.switchFrame(AddToCart_Frame_ToClickAddToCart_XPATH);

		SeleniumUtil.clickWebElement(By.xpath(AddToCart_AddToCardButton_XPATH));

		SeleniumUtil.switchToDefaultContent();

	}

	public static void clickCheckOut() throws InterruptedException {

		Thread.sleep(5000);
		SeleniumUtil.clickWebElement(By.xpath(AddToCart_ProceedtoCheckOutButton_XPATH));
		
	}

}