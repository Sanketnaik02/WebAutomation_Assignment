/*
 * Test_Case_01 // Steps
// 1. Launch Chrome browser.
// 3. Launch URL "https://www.amazon.in" // 4. Search for "Samsung Galaxy S23"
// 5. Click on the first search Result. (It will open in a new window) // 6. Add the product to the cart.
// 7. Come back to the main window and click on the cart option
// 8. Validate if the product is there in the cart using product text. (Put validation) // 9. Make the test Case Pass else Fail
// 10. Close the browser

 */
package testAssignment;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC_01 {

	public static void main(String[] args) throws InterruptedException {

		// 1. Launch Chrome browser.
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 3. Launch URL "https://www.amazon.in"
		driver.get("https://www.amazon.in");

		// Explict wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));

		try {
			// 4. Search for "Samsung Galaxy S23"
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys("Samsung Galaxy S23");

			driver.findElement(By.id("nav-search-submit-button")).click();

			// 5. Click on the first search Result. (It will open in a new window)
			WebElement firstResult = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_2'] h2[class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")));
			firstResult.click();

			// 6. Add the product to the cart.
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			String actualValue = driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
			System.out.println(actualValue);

			WebElement addCart = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(
					"body > div:nth-child(5) > div:nth-child(79) > div:nth-child(7) > div:nth-child(7) > div:nth-child(1) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > form:nth-child(1) > div:nth-child(28) > div:nth-child(1) > div:nth-child(38) > div:nth-child(2) > span:nth-child(1) > span:nth-child(1) > span:nth-child(1) > input:nth-child(2)")));
			addCart.click();

			// 7. Come back to the main window and click on the cart option

			driver.switchTo().window(tabs.get(0));
			driver.navigate().refresh();
			
			WebElement Cart = wait.until(ExpectedConditions.elementToBeClickable(By.id("nav-cart")));
			Cart.click();

			// 8. Validate if the product is there in the cart using product text. (Put
			// validation)

			String expectedValue = driver.findElement(By.xpath("//div[@id='sc-active-8b93be7c-d11f-4376-b97f-ac32c1a79fa3']//span[@class='a-truncate-cut'][contains(text(),'SAMSUNG Galaxy S23 FE 5G (Graphite 128 GB Storage)')]")).getText();
			System.out.println(expectedValue);
//			if (actualValue = expectedValue != null) {
//				System.out.println("Test Pass Successfully ");
//			}
//			else {
//				System.out.println("Test CAse Failed");
//			}
			// 9. Make the test Case Pass else Fail

		} catch (Exception e) {
			System.out.println("Exception is OUT");
		} finally {

			// 10. Close the browser.
			driver.quit();
		}

	}

}
