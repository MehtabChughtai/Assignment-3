package edx_Ass_2;
import org.openqa.selenium.By;

public class Page_Obj {

	public static By Register = By.cssSelector(".js-user-cta > a[href$=\"register\"]");
	public static By Register_Email = By.cssSelector("#register-email");
	public static By Register_FullName = By.cssSelector("#register-name");
	public static By Register_PulicUsername = By.cssSelector("#register-username");
	public static By Register_Password = By.cssSelector("#register-password");
	public static By Register_Country = By.cssSelector("#register-country");
	public static By RadioButton = By.cssSelector(".input-block.checkbox");
	public static By Gender = By.cssSelector("#register-gender");
	public static By Year_of_Birth = By.cssSelector("#register-year_of_birth");
	public static By Education = By.cssSelector("#register-level_of_education");
	public static By Note = By.cssSelector("#register-goals");
	public static By Register_BTN = By.cssSelector(".register-button");
	public static By Explore_Course = By.cssSelector(".btn.btn-primary");
	public static By Explore_BTN = By.cssSelector(".btn-neutral");
	public static By Profile_Dropdown = By.cssSelector(".button.button-more.has-dropdown");
	public static By Signout = By.cssSelector(".dropdown-item.last .action.last-focus");	
}
