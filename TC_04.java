/*
 * Test_Case_04 // Steps
// 1. Go to the Amazon site,
// 2. Scroll down to the bottom of the home page.
// 3. Click on the language select element and select the हि्दीlanguage
// 4. Add an assertion to make sure the language of the page has been changed to the selected language.
// 5. Now again go to the bottom of the home page
// 6. Click on the language select element and select the English language 
// 7. Add assertion to make sure the language is changed back to English. 
// 8. Close the browser.


 */
package testAssignment;

import java.awt.print.Pageable;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_04 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 1. Go to the Amazon site,
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);

		// 2. Scroll down to the bottom of the home page.
		act.sendKeys(Keys.PAGE_DOWN).perform();

		// 3. Click on the language select element and select the हि्दीlanguage
		WebElement Lang = driver.findElement(By.id("icp-touch-link-language"));
		act.moveToElement(Lang).build().perform();

		
// Not Found In Section//		
		driver.findElement(By.xpath("//div[@id='nav-flyout-icp-footer-flyout']//span[contains(@dir,'ltr')][contains(text(),'हिन्दी')]")).click();

		// 4. Add an assertion to make sure the language of the page has been changed to
		// the selected language.
		WebElement ConformationElemnetHindi = driver.findElement(By.xpath("//*[contains(text(),'नमस्ते')]"));
		
		
		if (ConformationElemnetHindi.isDisplayed()) {
			System.out.println("Hindi Language Changed Successfully ");

		} else {
			System.out.println("Test CAse Failed");
		}

		// 5. Now again go to the bottom of the home page
		act.sendKeys(Keys.PAGE_DOWN).perform();

		// 6. Click on the language select element and select the English language
		act.moveToElement(Lang).perform();

		driver.findElement(By.xpath("//div[@id='nav-flyout-icp-footer-flyout']//span[contains(@dir,'ltr')][contains(text(),'English')]")).click();
		Thread.sleep(2000);

		// 7. Add assertion to make sure the language is changed back to English.
		
		
		WebElement ConformationElemnetEnglish = driver.findElement(By.xpath("//*[contains(text(),'Hello')]"));
		
		if (ConformationElemnetEnglish.isDisplayed()) {
			System.out.println("English LAng CHnaged, Test CAse Passed");

		} else {
			System.out.println("Test CAse Failed Part Two");
		}
		
		// 8. Close the browser.
		driver.close();
	}

}
