package edx_Ass_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Dashboard extends Driver_Interaction{
	
	public Dashboard(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void waitForVisibility() throws Error{
		try {
			new WebDriverWait(driver, 10)
		    .until(ExpectedConditions.visibilityOf(driver.findElement(Page_Obj.Explore_Course)));
		    System.out.println("Element is visible");
			}
		catch(InvalidSelectorException e) {
			System.out.println("I found an exception here" + "\n" + e);
			}
	}

	public void URL_assertEquals(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"https://courses.edx.org/dashboard");
		System.out.println("This line is executed because assertEquals " + "passed since both the strings are same");
	}
	
	public void Explore_BTN(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(Page_Obj.Explore_BTN).click();
	}
	
	public void URL2_assertEquals(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String URL = driver.getCurrentUrl();
		Assert.assertEquals(URL,"https://www.edx.org/course");
		System.out.println("This line is executed because assertEquals " + "passed since both the strings are same");
	}
	
	public void User_Profile_Dropdown(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(Page_Obj.Profile_Dropdown).click();
	}
	
	public void Profile_Dropdown_Signout_BTN(){
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(Page_Obj.Signout).click();
	}
	
}
