package source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	
	WebDriver driver;
	@FindBy(xpath="//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(xpath="//span[@class='nav-action-inner']")
	WebElement signin;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	
	
	
	public void aandlist(WebDriver driver) {
		Actions a1= new Actions(driver);
		a1.moveToElement(accountandlist).perform();
	}
	
	public void sign_in(WebDriver driver) {
		signin.click();
	}
	
	public void searching(WebDriver driver) {
		search_tf.sendKeys("mobiles" +Keys.ENTER);
	}

	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
