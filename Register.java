package edx_Ass_2;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Register extends Driver_Interaction{

	public Register(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
	        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
	        salt.append(SALTCHARS.charAt(index));
        	}
        String saltStr = salt.toString();
        return saltStr;
    }

	public void My_Registration(String FullName,String Username,String Password,String Country) throws InterruptedException {
		//Fill out Registration Form
		driver.findElement(Page_Obj.Register_Email).sendKeys(getSaltString()+"@mailinator.com");
		driver.findElement(Page_Obj.Register_FullName).sendKeys(FullName);
		driver.findElement(Page_Obj.Register_PulicUsername).sendKeys(Username+getSaltString());
		driver.findElement(Page_Obj.Register_Password).sendKeys(Password);
		driver.findElement(Page_Obj.Register_Country).sendKeys(Country);
	}
	
	public void Checkbox() {
		//Radio button selection - Wait/scroll into view/Radio BTN selection 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		driver.findElement(Page_Obj.RadioButton).click();
		((JavascriptExecutor) driver).executeScript("scroll(0,600)");
	}
	
	public void Additional_Info_dropdown_values(String Gender,String YOB,String Edu) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Dropdown Gender selection
		Select Gender1 = new Select(driver.findElement(Page_Obj.Gender));
		Gender1.selectByVisibleText(Gender);
		//Dropdown Year selection
		Select Year = new Select(driver.findElement(Page_Obj.Year_of_Birth));
		Year.selectByVisibleText(YOB);
		//Dropdown Education selection
		Select education = new Select(driver.findElement(Page_Obj.Education));
		education.selectByVisibleText(Edu);
		}
	
	public void Registration_Note() {
		//My Registration Note
		driver.findElement(Page_Obj.Note).sendKeys("This is my special registration note.");
	}

	//Wait for element visibility & then Register else catch an exception
	public void waitForVisibility() throws Error{
		try {
			new WebDriverWait(driver, 10)
		    .until(ExpectedConditions.visibilityOf(driver.findElement(Page_Obj.Register_BTN)));
		    System.out.println("Element is visible");
			}
		catch(InvalidSelectorException e) {
			System.out.println("I found an exception here" + "\n" + e);
			}
	    driver.findElement(Page_Obj.Register_BTN).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		}
}

