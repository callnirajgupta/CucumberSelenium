package com.automation.pageobjectmodel;

import org.openqa.selenium.By;

import com.automation.util.SeleniumUtil;

public class ShoppingCartSummaryPage_PO {

	public static final String ShoppingCartSummary_ProductText_CSS="a[title='ProductName'][class='cart_block_product_name']";
	public static String ShoppingCartSummary_Delete_XPATH="//tr[td[small[text()='SKU']]]//a[@title='Delete']";
	
	
	public static void deleteItem(String sku){
		ShoppingCartSummary_Delete_XPATH=ShoppingCartSummary_Delete_XPATH.replace("SKU", sku);
				
		SeleniumUtil.clickWebElement(By.xpath(ShoppingCartSummary_Delete_XPATH));
		
		/*try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	
	
}
