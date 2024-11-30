package source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement username_tf;
	
	@FindBy(id="continue")
	WebElement continue_button;
	
	@FindBy(name="password")
	WebElement password_tf;
	
	@FindBy(id="signInSubmit")
	WebElement signin_button;
	
	
	
	
	
	
	public void un(WebDriver driver) 
	{
		username_tf.sendKeys("6362470741");
	}
	
	public void username_continue(WebDriver driver) {
		continue_button.click();
		
	}
	public void pwd(WebDriver driver) {
		password_tf.sendKeys("Shweta@1");
		
	}
	public void pwd_signin(WebDriver driver) {
		signin_button.click();
	}

	
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}


}
