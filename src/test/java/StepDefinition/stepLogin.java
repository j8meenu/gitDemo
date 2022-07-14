package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepDefLogin {
	
	WebDriver driver = null;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/gmail/about/");
	}

	@When("User Navigate to Sign In Page")
	public void user_navigate_to_sign_in_page() {
		//Click on Sign In link on gmail home page
	   driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	}

	@And("User enters UserName and Password")
	public void user_enters_user_name_and_password() throws InterruptedException {
		// Enter the user name and click on Next button
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("user.test0736");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
		Thread.sleep(3000);
		//Enter the password and click on Next button
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("testPass");
		driver.findElement(By.xpath("//span[text() = 'Next']")).click();
	}

	@Then("User is redirected to landing page")
	public void user_is_redirected_to_landing_page() {
		// Print title of landing page
	   System.out.println("Title of page is : "+driver.getTitle());
	   driver.quit();
	}

}
