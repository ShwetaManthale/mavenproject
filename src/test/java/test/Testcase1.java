package test;

import org.testng.annotations.Test;

import source.Homepage;
import source.Loginpage;

public class Testcase1 extends LaunchQuit{
	
	//login to amazon\
	@Test
	public void loginamazon() {
		
		Homepage h1= new Homepage(driver);
		h1.aandlist(driver);
		h1.sign_in(driver);
		Loginpage l1= new Loginpage(driver);
		l1.un(driver);
		l1.username_continue(driver);
		l1.pwd(driver);
		l1.pwd_signin(driver);
		
	}

}

