package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;



public class testCase2_findElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:\\Enviroment\\Eclipse\\Eclipse Selinium\\WebDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		String appUrl = "http://demo.guru99.com/test/login.html";
		
		// launch the firefox browser and open the application url
				driver.get(appUrl);
				
				
		List<WebElement> listOfElements = driver.findElements(By.id("columns"));
				
		 //implecide wait
        WebDriverWait wait=new WebDriverWait(driver, 30);
		
		//print the list
		System.out.println("Printing List");
		
		for(int i=0;i<listOfElements.size();i++){
		    System.out.println(listOfElements.get(i));
		} 
				
		 //implecide wait
        wait=new WebDriverWait(driver, 30);		
				
				
				
				
				
		//close the web browser
		driver.close();
		System.out.println("Test script executed successfully.");		
	}

}
