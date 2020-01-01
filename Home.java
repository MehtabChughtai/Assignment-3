package edx_Ass_2;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

public class Home extends Driver_Interaction{

	public Home(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void homePage() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("https://www.edx.org/");
	}
	
	public void Home_Register_btn() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(Page_Obj.Register).click();
	}
}
