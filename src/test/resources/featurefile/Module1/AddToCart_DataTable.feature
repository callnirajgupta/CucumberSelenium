@Checkout_Scenarios_byreading_DataTable
Feature: FR01

@AddToCart_FR01_SCR001
Scenario Outline: SCR001
Given user "Admin" login into the application with correct credentials
When user searches for the "<Item>" 
And user Add To Cart and Proceed to checkout
Then summary section shows the added item
When user delete the item with sku as "<SKU>"
Then added item should be removed
And verify that User successfully log out of the application

Examples:
|User      |Password|Item|SKU|
|admin@p.com|Password-11|Faded Short Sleeve T-shirts|SKU : demo_1|
