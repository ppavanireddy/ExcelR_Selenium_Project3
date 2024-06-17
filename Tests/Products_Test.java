package Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.LoginUser_Page;
import Pages.Products_Page;
import Utilities.Base;

public class Products_Test extends Base {

		LoginUser_Page lu;
		Products_Page p;
		
		@BeforeMethod
		public void bt() throws InterruptedException 
				
				{
					launch_browser();
					lu = new LoginUser_Page(dr);
					p = new Products_Page(dr);
				}
		@Test
		public void TC_0014() throws InterruptedException
				
				{
			//Verify that user can add the product to cart
			System.out.println(readExcel(14,0) + " : "+ readExcel(14,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(14,2));
			lu.enter_password(readExcel(14,3));
			
			lu.click_button();
			// Wait until the product page loads
            p.waitForProductPage();

            // Verify product list and details
            p.verifyProductDetails();
            
            close_browser();
				}
		
		@Test
		public void TC_0016() throws InterruptedException
				
				{
			//Verify that user can add the product to cart
			System.out.println(readExcel(16,0) + " : "+ readExcel(16,1));
			
			String eSText = "Swag Labs";
			Assert.assertEquals(lu.Verify_login(), eSText);
			
			lu.enter_email(readExcel(16,2));
			lu.enter_password(readExcel(16,3));
			
			lu.click_button();
			
			// Measure product page load time
            long productPageLoadTime = measurePageLoadTime(dr, "https://www.saucedemo.com/inventory.html");
            p.waitForProductPage();
            System.out.println("Product Page Load Time: " + productPageLoadTime + " milliseconds");

    }

    public static long measurePageLoadTime(WebDriver driver, String url) {
        long startTime = System.currentTimeMillis();
        
        driver.get(url);

        // Use WebDriverWait to ensure the page has loaded fully by waiting for a known element on the page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("body")));

        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }
			
			
}
			
