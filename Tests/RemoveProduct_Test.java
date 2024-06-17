package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.AddtoCart_Page;
import Pages.LoginUser_Page;
import Pages.RemoveProduct_Page;
import Utilities.Base;

public class RemoveProduct_Test extends Base {

		LoginUser_Page lu;
		AddtoCart_Page ap;
		RemoveProduct_Page rp;
		
		@BeforeMethod
		public void bt() throws InterruptedException 
				
				{
					launch_browser();
					lu = new LoginUser_Page(dr);
					ap = new AddtoCart_Page(dr);
					rp = new RemoveProduct_Page(dr);
				}
		@Test
		public void TC_0012() throws InterruptedException
				
				{
			//Verify that user can add the product to cart
			System.out.println(readExcel(12,0) + " : "+ readExcel(12,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(12,2));
			lu.enter_password(readExcel(12,3));
			
			lu.click_button();
			
			String eSText1 = "Swag Labs";
			Assert.assertEquals(lu.Verify_loginmsg(), eSText1);
			
			ap.click_addtocart();
			
			rp.remove_button();
			
			close_browser();
				}
		@Test
		public void TC_0013() throws InterruptedException
		{
			//Verify that user can sort the products
			System.out.println(readExcel(13,0) + " : "+ readExcel(13,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(13,2));
			lu.enter_password(readExcel(13,3));
			
			lu.click_button();
			
			// Test sorting by Name (A to Z)
           RemoveProduct_Page. testProductSorting(dr, "az", "Sauce Labs Backpack");

            // Test sorting by Name (Z to A)
            RemoveProduct_Page.testProductSorting(dr, "za", "Test.allTheThings() T-Shirt (Red)");

            // Test sorting by Price (low to high)
            RemoveProduct_Page.testProductSorting(dr, "lohi", "Sauce Labs Onesie");

            // Test sorting by Price (high to low)
            RemoveProduct_Page.testProductSorting(dr, "hilo", "Sauce Labs Fleece Jacket");
            
            close_browser();
			
		}
		

}
