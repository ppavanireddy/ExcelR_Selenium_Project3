package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RemoveProduct_Page {
WebDriver dr;
	
	public RemoveProduct_Page(WebDriver dr) 
	{
		this.dr = dr;
	}
	
	public void remove_button()
	{
		WebElement remove = dr.findElement(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
		remove.click();
	}
	public static void testProductSorting(WebDriver driver, String optionValue, String expectedFirstItem) {
        // Select sorting option
        Select sortingDropdown = new Select(driver.findElement(By.className("product_sort_container")));
        sortingDropdown.selectByValue(optionValue);

        // Wait for sorting to apply
        try {
            Thread.sleep(2000); // Consider using WebDriverWait for a more robust solution
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}

}
