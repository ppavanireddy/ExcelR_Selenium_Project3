package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginUser_Page {
WebDriver dr;
	
	public LoginUser_Page(WebDriver dr) 
	{
		this.dr = dr;
	}
	//Login user
	public String Verify_login() //Login to your account
	{
		WebElement text = dr.findElement(By.xpath("//div[@class='login_logo']"));
		String aTxt =  text.getText();
		return aTxt;
	}
	
	public void enter_email(String email)
	{
		WebElement Email = dr.findElement(By.xpath("//input[@id='user-name']"));
		Email.sendKeys(email);
	}
	
	public void enter_password(String pass)
	{
		WebElement pwd = dr.findElement(By.xpath("//input[@id='password']"));
		pwd.sendKeys(pass);
	}
	
	public void click_button()
	{
		WebElement login = dr.findElement(By.xpath("//input[@id='login-button']"));
		login.click();
	}
	public String Verify_locked() //Epic sadface: Sorry, this user has been locked out.
	{
		WebElement text = dr.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Sorry, this user has been locked out')]"));
		String aTxt =  text.getText();
		return aTxt;
	}
	
	public String Verify_loginmsg() //Swag Labs
	{
		WebElement text = dr.findElement(By.xpath("//div[@class='app_logo']"));
		String aTxt =  text.getText();
		return aTxt;
	}
	public String Verify_errormsg() //Epic sadface: Username and password do not match any user in this service
	{
		WebElement text = dr.findElement(By.xpath("//h3[contains(text(),'Epic sadface: Username and password do not match a')]"));
		String aTxt =  text.getText();
		return aTxt;
	}
	
	public void click_button1()
	{
		WebElement button = dr.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
		button.click();
	}
	
	public void click_logout()
	{
		WebElement logout = dr.findElement(By.xpath("//a[@id='logout_sidebar_link']"));
		logout.click();
	}

}
