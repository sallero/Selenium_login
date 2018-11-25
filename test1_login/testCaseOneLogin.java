package test1_login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;



public class testCaseOneLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","G:\\Enviroment\\Eclipse\\Eclipse Selinium\\WebDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		String appUrl = "http://demo.guru99.com/test/facebook.html";
		// declare and initialize the variable to store the expected title of the webpage.
        String expectedTitle = "Selenium IDE Test";
        String actualTitle="";
		
		
		
		// launch the firefox browser and open the application url
		driver.get(appUrl);
		
		// maximize the browser window
       // driver.manage().window().maximize();
        
        actualTitle = driver.getTitle();
        
        System.out.println("title is = " + actualTitle);
        
     // compare the expected title of the page with the actual title of the page and print the result
        if (expectedTitle.equals(actualTitle))
        {
               System.out.println("Verification Successful - The correct title is displayed on the web page.");
        }
       else
        {
               System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
        }
        
     // enter a valid username in the email textbox
        WebElement username = driver.findElement(By.id("email"));
        username.clear();
        username.sendKeys("TestSelenium");
       
        //enter a valid password in the password textbox
        WebElement password = driver.findElement(By.id("pass"));
        password.clear();
        password.sendKeys("password123");
       
        //click on the Sign in button
        WebElement SignInButton = driver.findElement(By.id("u_0_b"));
        SignInButton.click();
 
        
        //implecide wait
        WebDriverWait wait=new WebDriverWait(driver, 30);
        
        
        //close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");
   /*    
        //terminate the program
        System.exit(0);
        
 */       
        
        
        
        
        
        
        
        
		 
        // Print a Log In message to the screen
        System.out.println("Successfully opened the website www.Store.Demoqa.com");
 
 
	}

}
