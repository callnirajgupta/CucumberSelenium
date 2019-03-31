@Checkout_Scenarios
Feature: Checkout related scenarios like add to cart,remove,payment etc.

@AddToCart @getexamplecount
Scenario Outline: Add a single item into cart and then remove it
Given User "<User>" with password "<Password>" login into the application with correct credentials
When user searches for the "<Item>" 
And user Add To Cart and Proceed to checkout
Then summary section shows the added item
When user delete the item with sku as "<SKU>"
Then added item should be removed
And verify that User successfully log out of the application


Examples:
|User      |Password|Item|SKU|
|admin@p.com|Password-11|Faded Short Sleeve T-shirts|SKU : demo_1|


	


 
#Given User "<User>" with password "<Password>" login into the application with correct credentials
#When User searches for the "<Item>"
#Then Verify item is present
#When User clicks on Add To cart
#Then Item is successfully added to the cart
#When Proceed to checkout
#Then Summary section shows the added item
#When user clicks on delete for item with sku as "<SKU>"
#Then Added item should be removed
#Given User successfully log out of the application after clicking on log out button


