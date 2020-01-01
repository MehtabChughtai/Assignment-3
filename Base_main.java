package edx_Ass_2;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base_main {
	
	@Test
	public void main() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\bin\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		Home obj = new Home(driver);
		obj.homePage();
		obj.Home_Register_btn();
		
		Register obj1 = new Register(driver);
		obj1.My_Registration("Mac","Mac_","abcd_1234","Pakistan");
		obj1.Checkbox();
		obj1.Additional_Info_dropdown_values("Male","1991","Bachelor's degree");
		obj1.Registration_Note();
		obj1.waitForVisibility();
		
		Dashboard obj2 = new Dashboard(driver);
		obj2.waitForVisibility();
		obj2.URL_assertEquals();
		obj2.Explore_BTN();
		obj2.URL2_assertEquals();
		obj2.User_Profile_Dropdown();
		obj2.Profile_Dropdown_Signout_BTN();
	}
}