/*
 * Test_Case_03 // Steps
// 1. Go to the Amazon site,
// 2. Click on the Search dropdown list from the homepage. 
// 3. Get the count of All the options from the list.
// 4. Use Select class and get the text of the 4th element from the options.
// 5. Use Select class and click on “Electronics”, so that "Electronics" is selected from the dropdown 
// 6. Search Laptop from the search box.
// 7. Validate Page title contains 'laptop' 
// 8. Close the browser.

 */
package testAssignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class TC_03 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// 1. Go to the Amazon site,
		driver.get("https://www.amazon.in/");
		
		
		// 2. Click on the Search dropdown list from the homepage.
		WebElement searchDropDown = driver.findElement(By.id("searchDropdownBox"));
		searchDropDown.click();
		
		// 3. Get the count of All the options from the list.
		Select selectDropdown = new Select(searchDropDown);
		List<WebElement> options = selectDropdown.getOptions();
		options.size();
		System.out.println("Options Element Size Is "+options.size());
		
		// 4. Use Select class and get the text of the 4th element from the options.
		if(options.size() >=4) {
			
			String fourthElement = options.get(3).getText();
			System.out.println("Fourth Element Is : "+fourthElement);
			
		}else {
			System.out.println("No Found Fourth Element");
		}
		
		// 5. Use Select class and click on “Electronics”, so that "Electronics" is selected from the dropdown
		selectDropdown.selectByVisibleText("Electronics");
		
		// 6. Search Laptop from the search box.
		WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys("Laptop");
		searchBox.submit();
		
		
		// 7. Validate Page title contains 'laptop'
		String ExpectedTitle = "Laptop";
		if (driver.getTitle().contains(ExpectedTitle)) {
			System.out.println("Test CAse Passed ");
		}
		else {
			System.out.println("Test Case Failed !!");
		}
		System.out.println(driver.getTitle());
		// 8. Close the browser.
		driver.close();

	}

}
