package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;;

public class testCase7Tables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","G:\\Enviroment\\Eclipse\\Eclipse Selinium\\WebDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		String appUrl = "http://newtours.demoaut.com/";
		
		// launch the firefox browser and open the application url
		driver.get("http://demo.guru99.com/test/table.html");
		
		//get element with xpath only
		String innerText= driver.findElement(By.xpath("//table/tbody/tr[4]/td[3]")).getText();
		
		System.out.println("innerText =" + innerText);
		
		//go to second page for different table
		driver.get(appUrl);
		
		//get by attribute
		
		innerText= driver.findElement(By.xpath("//table[@width=\"270\"]/tbody/tr[4]/td")).getText();
		
		System.out.println("innerText =" + innerText);
		
        //close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");


	}

}
