package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Products_Page {
	WebDriver dr;
    WebDriverWait wait;

    // Constructor
    public Products_Page(WebDriver dr) {
        this.dr = dr;
        this.wait = new WebDriverWait(dr, Duration.ofSeconds(10));
    }

    // Method to wait until the product page loads
    public void waitForProductPage() {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.className("inventory_item")));
    }

    // Method to get the list of products
    public List<WebElement> getProducts() {
        return dr.findElements(By.className("inventory_item"));
    }

    // Method to verify product details
    public void verifyProductDetails() {
        List<WebElement> products = getProducts();

        // Check if the product list is displayed and contains items
        if (products.size() == 0) {
            throw new AssertionError("No products found.");
        }

        // Verify each product's details
        for (WebElement product : products) {
            // Verify product name is displayed
            WebElement productName = product.findElement(By.className("inventory_item_name"));
            if (productName.getText().isEmpty()) {
                throw new AssertionError("Product name is missing.");
            }

            // Verify product price is displayed
            WebElement productPrice = product.findElement(By.className("inventory_item_price"));
            if (productPrice.getText().isEmpty()) {
                throw new AssertionError("Product price is missing.");
            }

            // Verify product image is displayed
            WebElement productImage = product.findElement(By.className("inventory_item_img"));
            if (productImage.findElements(By.tagName("img")).size() == 0) {
                throw new AssertionError("Product image is missing.");
            }
        }

        System.out.println("All products have names, prices, and images displayed correctly.");
    }
}

