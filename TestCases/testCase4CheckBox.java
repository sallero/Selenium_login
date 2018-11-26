package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class testCase4CheckBox {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver","G:\\Enviroment\\Eclipse\\Eclipse Selinium\\WebDriver\\geckodriver.exe");

		
		
		//load drover for firefox
		WebDriver driver = new FirefoxDriver();
		
		String appUrl = "http://demo.guru99.com/test/radio.html";
		
		WebElement option1 = null;
		WebElement option2 = null;
		WebElement option3 = null;
		
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		
		
		// launch the firefox browser and open the application url
		driver.get(appUrl);
		
		//find radio buttons
		option1 = driver.findElement(By.id("vfb-6-0"));
		option2 = driver.findElement(By.id("vfb-6-1"));
		option3 = driver.findElement(By.id("vfb-6-2"));
		
		option1.click();
		
		option2.click();
		
		option3.click();
		
		if(option3.isSelected())
		{
			System.out.println("option3 selected");
		}
		else
		{
			System.out.println("option3 not selected");
		}
		
        option1.click();
		
		option2.click();
		
		option3.click();
		
		if(option3.isSelected())
		{
			System.out.println("option3 selected");
		}
		else
		{
			System.out.println("option3 not selected");
		}
		
        //close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");

	}

}
