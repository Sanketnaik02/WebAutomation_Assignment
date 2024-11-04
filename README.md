#**Web Automation Assignment with Java and Selenium**
Overview
This repository contains a set of web automation test cases developed using Java and Selenium WebDriver. These test cases focus on automating various functionalities of popular websites like Amazon and Google, covering actions like product search, filtering, adding to cart, and validating page elements.
Prerequisites
- Java 8 or higher
- Selenium WebDriver
- ChromeDriver
- Test data in Excel (for Test Case 10)

#Setup Instructions
1.	Clone this repository:
2.	Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).
3.	Add Selenium WebDriver to your project’s build path.
4.	Download and set up ChromeDriver in your system's PATH.

#Test Cases Overview
 
| Test Case     | Description                                                                                                            |
|---------------|------------------------------------------------------------------------------------------------------------------------|
| Test Case 01  | Launch Amazon, search for "Samsung Galaxy S23," add to cart, and validate in the cart.                                 |
| Test Case 02  | Search mobile phones on Amazon, add multiple items to cart, and validate product count in cart.                        |
| Test Case 03	|	Validate the dropdown options in Amazon's search bar, select "Electronics," and verify page title.                   |
| Test Case 04	|	Change Amazon’s site language to Hindi, validate, and revert to English with assertions.                             |
| Test Case 05	|	Search for "Software Testing Jobs" on Google, navigate to the next page, and validate the first result in a new tab. |
| Test Case 06	|	Scroll through Amazon’s mobile listings, locate a "Limited time deal" item, and print the name.                      |
| Test Case 07	|	Validate footer links on Amazon by clicking each one and verifying the URL.                                          |
| Test Case 08	|	Filter iPhones on Amazon by 4-star ratings, count results, and validate filter functionality.                        |
| Test Case 09	|	Get and click on all header menu items on Amazon, asserting URL consistency.                                         |
| Test Case 10	|	Automate Amazon account creation using data from an Excel sheet and validate account creation status.                |

	
_______________________________________
#Test Case Details
Test Case 01
•	Steps:
1.	Launch Chrome and open Amazon.
2.	Search for "Samsung Galaxy S23" and select the first result.
3.	Add it to the cart, navigate back to the main window, and validate it in the cart.

Test Case 02
•	Steps:
1.	Search for mobile phones on Amazon.
2.	Add the 3rd and 4th products to the cart, validate the total product count.
...

#How to Run the Tests
1.	Ensure ChromeDriver is configured and updated to match your Chrome version.
2.	Run each test case as a Java application or from the command line with:

#Future Improvements
•	Integrate TestNG for advanced testing functionality.
•	Add more validation checks and improve error handling.
•	Create more robust reports for test results.

