package TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;;

public class testCase5Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:\\Enviroment\\Eclipse\\Eclipse Selinium\\WebDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
	
		
		
		String appUrl = "http://output.jsbin.com/osebed/2";
		
		// launch the firefox browser and open the application url
		driver.get(appUrl);
		
		//find drop down lelment
		Select drpItem = new Select(driver.findElement(By.id("fruits")));
		
		
		//select 1 item
		drpItem.selectByVisibleText("Banana");
		
		//deselect items
		drpItem.deselectAll();
		
		//select more than one item
		
		drpItem.selectByVisibleText("Apple");
		drpItem.selectByIndex(2);
		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
        //close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");


	}

}
