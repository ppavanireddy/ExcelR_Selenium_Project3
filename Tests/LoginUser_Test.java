package Tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginUser_Page;
import Utilities.Base;

public class LoginUser_Test extends Base{
	
		LoginUser_Page lu;
		
		@BeforeMethod
		public void bt() throws InterruptedException 
				
				{
					launch_browser();
					lu = new LoginUser_Page(dr);
				}
		@Test
		public void TC_001() throws InterruptedException
				
				{
			//To verify Login User with correct email and password
			System.out.println(readExcel(1,0) + " : "+ readExcel(1,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(1,2));
			lu.enter_password(readExcel(1,3));
			
			lu.click_button();
			
			String eSText1 = "Swag Labs";
			Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
			
			close_browser();
				}
		@Test
		public void TC_002() throws InterruptedException
				
				{
			//To verify Login User with correct email and password and check the account locked
			System.out.println(readExcel(2,0) + " : "+ readExcel(2,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(2,2));
			lu.enter_password(readExcel(2,3));
			
			lu.click_button();
			
			String eSText1 = "Epic sadface: Sorry, this user has been locked out.";
			Assert.assertEquals(lu.Verify_locked(), eSText1);
			
			close_browser();
				}
		@Test
		public void TC_003() throws InterruptedException
				
				{
			//To verify Login User with correct email and password
			System.out.println(readExcel(3,0) + " : "+ readExcel(3,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(3,2));
			lu.enter_password(readExcel(3,3));
			
			lu.click_button();
			
			String eSText1 = "Swag Labs";
			Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
			
			close_browser();
				}
		@Test
		public void TC_004() throws InterruptedException
				
				{
			//To verify Login User with correct email and password
			System.out.println(readExcel(4,0) + " : "+ readExcel(4,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(4,2));
			lu.enter_password(readExcel(4,3));
			
			lu.click_button();
			
			String eSText1 = "Swag Labs";
			Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
			
			close_browser();
				}
		@Test
		public void TC_005() throws InterruptedException
				
				{
			//To verify Login User with correct email and password
			System.out.println(readExcel(5,0) + " : "+ readExcel(5,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(5,2));
			lu.enter_password(readExcel(5,3));
			
			lu.click_button();
			
			String eSText1 = "Swag Labs";
			Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
			
			close_browser();
				}
		@Test
		public void TC_006() throws InterruptedException
				
				{
			//To verify Login User with correct email and password
			System.out.println(readExcel(6,0) + " : "+ readExcel(6,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(6,2));
			lu.enter_password(readExcel(6,3));
			
			lu.click_button();
			
			String eSText1 = "Swag Labs";
			Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
			
			close_browser();
				}
		@Test
		public void TC_007() throws InterruptedException
				
				{
			//Verify user can login using invalid username and valid password
			System.out.println(readExcel(7,0) + " : "+ readExcel(7,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(7,2));
			lu.enter_password(readExcel(7,3));
			
			lu.click_button();
			
			String eSText1 = "Epic sadface: Username and password do not match any user in this service";
			Assert.assertEquals(lu.Verify_errormsg(), eSText1);
			
			close_browser();
				}
		@Test
		public void TC_008() throws InterruptedException
				
				{
			//Verify user can login using valid username and invalid password
			System.out.println(readExcel(8,0) + " : "+ readExcel(8,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(8,2));
			lu.enter_password(readExcel(8,3));
			
			lu.click_button();
			
			String eSText1 = "Epic sadface: Username and password do not match any user in this service";
			Assert.assertEquals(lu.Verify_errormsg(), eSText1);
			
			close_browser();
				}
		
		@Test
		public void TC_009() throws InterruptedException
				
				{
			//To verify Login User with correct email and password
			System.out.println(readExcel(9,0) + " : "+ readExcel(9,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(9,2));
			lu.enter_password(readExcel(9,3));
			
			lu.click_button();
			
			String eSText1 = "Swag Labs";
			Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
			
			lu.click_button1();
			
			Thread.sleep(5000);
			
			lu.click_logout();
			
			close_browser();
				}
		
		
}

