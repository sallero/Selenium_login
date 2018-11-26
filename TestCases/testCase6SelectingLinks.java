package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;;

public class testCase6SelectingLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","G:\\Enviroment\\Eclipse\\Eclipse Selinium\\WebDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		String appUrl = "http://demo.guru99.com/test/link.html";
		
		// launch the firefox browser and open the application url
		driver.get(appUrl);
		
		//this will click the firdst link that has the click here text
		driver.findElement(By.linkText("click here")).click();
		
		
		
		
		WebDriverWait wait=new WebDriverWait(driver, 30);
		
        //close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");


	}

}
