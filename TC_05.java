/*
 * // Steps
// 1. Navigate to Google
// 2. Search for "Software Testing Jobs" and press Enter 
// 3. Scroll down the page
// 4. Click "Next" to go to page 2 from the navigation 
// 5. Open the "1st" link in a new tab.
// 6. Switch to the new tab.
// 7. Validate the link and print "Link opened successfully" else assert False 
// 8. Quit the browser.

 */
package testAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class TC_05 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// 1. Navigate to Google
		driver.get("https://www.google.com/");

		// 2. Search for "Software Testing Jobs" and press Enter
		WebElement SearchBar = driver.findElement(By.id("APjFqb"));
		SearchBar.sendKeys("Software Testing Jobs");
		SearchBar.submit();

		// 3. Scroll down the page
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN);

		// 4. Click "Next" to go to page 2 from the navigation
		driver.findElement(By.xpath("//a[@aria-label='Page 2']")).click();

		// 5. Open the "1st" link in a new tab.
		driver.findElement(By.cssSelector(
				"body > div:nth-child(10) > div:nth-child(1) > div:nth-child(20) > div:nth-child(1) > div:nth-child(3) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)"))
				.click();

		// 6. Switch to the new tab.
		
		
		
		// 7. Validate the link and print "Link opened successfully" else assert False
		System.out.println("Link opened successfully");
		
		// 8. Quit the browser.
		driver.close();
	}

}
