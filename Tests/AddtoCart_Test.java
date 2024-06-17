package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AddtoCart_Page;
import Pages.LoginUser_Page;
import Utilities.Base;

public class AddtoCart_Test extends Base{

	LoginUser_Page lu;
	AddtoCart_Page ap;
	
	@BeforeMethod
	public void bt() throws InterruptedException 
			
			{
				launch_browser();
				lu = new LoginUser_Page(dr);
				ap = new AddtoCart_Page(dr);
			}
	@Test
	public void TC_0010() throws InterruptedException
			
			{
		//Verify that user can add the product to cart
		System.out.println(readExcel(10,0) + " : "+ readExcel(10,1));
		
		String eSText = "Swag Labs";
		Assert.assertEquals(lu.Verify_login(), eSText);
		
		lu.enter_email(readExcel(10,2));
		lu.enter_password(readExcel(10,3));
		
		lu.click_button();
		
		String eSText1 = "Swag Labs";
		Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
		
		ap.click_addtocart();
		
		close_browser();
			}
	
	@Test
	public void TC_0011() throws InterruptedException
			
			{
		//Verify that user can add the product to cart
		System.out.println(readExcel(11,0) + " : "+ readExcel(11,1));
		
		String eSText = "Swag Labs";
		Assert.assertEquals(lu.Verify_login(), eSText);
		
		lu.enter_email(readExcel(11,2));
		lu.enter_password(readExcel(11,3));
		
		lu.click_button();
		
		String eSText1 = "Swag Labs";
		Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
		
		ap.click_addtocart();
		
		ap.click_addtocartbutton();
		
		ap.click_checkoutbutton();
		
		ap.enter_firstname(readExcel(11,4));
		
		ap.enter_lastname(readExcel(11,5));
		
		ap.enter_code(readExcelInt(11,6));
		
		ap.click_continuebutton();
		scrollDown();
		
		ap.click_finishbutton();
		
		Thread.sleep(5000);
		String eSText2 = "Thank you for your order!";
		Assert.assertEquals(ap.Verify_msg(), eSText2);
		
		close_browser();
			}
	
	@Test
	public void TC_0015() throws InterruptedException
			
			{
		//empty cart checkout
		System.out.println(readExcel(15,0) + " : "+ readExcel(15,1));
		
		String eSText = "Swag Labs";
		Assert.assertEquals(lu.Verify_login(), eSText);
		
		lu.enter_email(readExcel(15,2));
		lu.enter_password(readExcel(15,3));
		
		lu.click_button();
		
		String eSText1 = "Swag Labs";
		Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
		
		ap.click_addtocartbutton();
		
		ap.click_checkoutbutton();
		
		ap.enter_firstname(readExcel(15,4));
		
		ap.enter_lastname(readExcel(15,5));
		
		ap.enter_code(readExcelInt(15,6));
		
		ap.click_continuebutton();
		scrollDown();
		
		ap.click_finishbutton();
		
		Thread.sleep(5000);
		String eSText2 = "Thank you for your order!";
		Assert.assertEquals(ap.Verify_msg(), eSText2);
		
		close_browser();
			}
}
