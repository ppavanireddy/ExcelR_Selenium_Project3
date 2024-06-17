package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddtoCart_Page {
WebDriver dr;
	
	public AddtoCart_Page(WebDriver dr) 
	{
		this.dr = dr;
	}
	
	public void click_addtocart()
	{
		WebElement cart = dr.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		cart.click();
	}
	
	public void click_addtocartbutton()
	{
		WebElement cartbutton = dr.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cartbutton.click();
	}
	
	public void click_checkoutbutton()
	{
		WebElement checkoutbutton = dr.findElement(By.xpath("//button[@id='checkout']"));
		checkoutbutton.click();
	}
	
	public void enter_firstname(String firstname)
	{
		WebElement FirstName = dr.findElement(By.xpath("//input[@id='first-name']"));
		FirstName.sendKeys(firstname);
	}
	
	public void enter_lastname(String lastname)
	{
		WebElement LastName = dr.findElement(By.xpath("//input[@id='last-name']"));
		LastName.sendKeys(lastname);
	}
	
	public void enter_code(int i)
	{
		WebElement ZipCode = dr.findElement(By.xpath("//input[@id='postal-code']"));
		ZipCode.sendKeys(Integer.toString(i));
	}
	
	public void click_continuebutton()
	{
		WebElement continuebutton = dr.findElement(By.xpath("//input[@id='continue']"));
		continuebutton.click();
	}
	
	public void click_finishbutton()
	{
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(5));
		WebElement finishButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input#finish")));
		finishButton.click();
	}
	
	public String Verify_msg() //Login to your account
	{
		WebElement text = dr.findElement(By.xpath("//h2[normalize-space()='Thank you for your order!']"));
		String aTxt =  text.getText();
		return aTxt;
	}

}
