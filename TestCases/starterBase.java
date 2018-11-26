package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class starterBase {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","G:\\Enviroment\\Eclipse\\Eclipse Selinium\\WebDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		String appUrl = "http://demo.guru99.com/test/facebook.html";
		
		// launch the firefox browser and open the application url
		driver.get(appUrl);
		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
        //close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");


	}

}
