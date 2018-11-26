package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test3RadioButtons {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","G:\\Enviroment\\Eclipse\\Eclipse Selinium\\WebDriver\\geckodriver.exe");

		
		
		//load drover for firefox
		WebDriver driver = new FirefoxDriver();
		
		String appUrl = "http://demo.guru99.com/test/radio.html";
		
		WebElement radio1 = null;
		WebElement radio2 = null;
		WebElement radio3 = null;
		
		
		WebDriverWait wait=new WebDriverWait(driver, 40);
		
		
		
		// launch the firefox browser and open the application url
		driver.get(appUrl);
		
		//find radio buttons
		radio1 = driver.findElement(By.id("vfb-7-1"));
		radio2 = driver.findElement(By.id("vfb-7-2"));
		radio3 = driver.findElement(By.id("vfb-7-3"));
		
		radio1.click();
		
		radio2.click();
		
		radio3.click();
		
		if(radio3.isSelected())
		{
			System.out.println("radio3 selected");
		}
		
		
		
		
		
        //close the web browser
       driver.close();
        System.out.println("Test script executed successfully.");

	}

}
