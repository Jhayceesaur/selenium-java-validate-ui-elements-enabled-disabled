import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidatingUIElementsEnabledDisabled 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		//Print style value before clicking the round trip radio button
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style")); 
		
		//Choosing trip option -- Round Trip
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click(); 
		
		//Print style value after clicking the round trip radio button
		System.out.println(driver.findElement(By.id("Div1")).getDomAttribute("style")); 
		
		//Validate if UI Element is displayed as enabled or disabled
		if (driver.findElement(By.id("Div1")).getDomAttribute("style").contains("1")) //Change the value of contains to test if it will throw error
		{
			System.out.println("CalendarUI is enabled");
			Assert.assertTrue(true);
		}
		
		else 
		{
			Assert.assertTrue(false);
		}

	}
}
