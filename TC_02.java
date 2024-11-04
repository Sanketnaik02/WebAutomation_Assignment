/*
 * Test_Case_02 // Steps
// 1. Go to the Amazon site,
// 2. Search for mobile phones.
// 3. Click on the 3rd phone from the list by using the Xpath locator, // 4. Add it to the cart.
// 5. Now go back to the listing page
// 6. Select the 4th option from the list. // 7. Add it to the cart.
// 8. Come back to the main window and click on the cart option
// 8. Add an assertion to make sure both products are displayed in the cart. (Check the product count) 
// 9. Quit the browser.

 */
package testAssignment;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_02 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		
		
		// 1. Go to the Amazon site,
		driver.get("https://www.amazon.in/");
		
		// 2. Search for mobile phones.
		WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("mobile phones");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		// 3. Click on the 3rd phone from the list by using the Xpath locator, 
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[5]")).click();
		
		// 4. Add it to the cart.
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		
		// 5. Now go back to the listing page
		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();
		
		
		// 6. Select the 4th option from the list. 
		driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[6]")).click();
		
		
		// 7. Add it to the cart.
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		// 8. Come back to the main window and click on the cart option
		driver.switchTo().window(tabs.get(0));
		driver.navigate().refresh();
		driver.findElement(By.id("nav-cart-count-container")).click();
		
		// 8. Add an assertion to make sure both products are displayed in the cart. (Check the product count)
		
		WebElement ExpectedTotal  = driver.findElement(By.xpath("//span[@id='sc-subtotal-label-buybox'])"));
		String opString = ExpectedTotal.getText();
		System.out.println(opString);
		
		// 9. Quit the browser.
		driver.quit();

	}

}
