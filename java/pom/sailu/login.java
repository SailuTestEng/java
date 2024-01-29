package pom.sailu;

import java.awt.Menu;

import javax.sql.rowset.WebRowSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
 public class Login {
	 public Menu menu=null;
	 public Login (WebDriver driver) {
		 PageFactory.initElements(driver,Menu.class);
		 
	 }
	 @FindBy(id = "Email")
	 WebElement username;
	
	 @FindBy(name="password")
	 WebElement pwd;
	 
	 @FindBy(xpath ="//button[@type='submit']" )
	 WebElement loginbutton;
	 
	 
	 public void loginfunction(String uname,String pass) {
		 username.clear();
		 username.sendKeys(uname);
		 pwd.clear();
		 pwd.sendKeys(pass);
		 loginbutton.click();
		 
		
	}
	 
	 
 }
}
