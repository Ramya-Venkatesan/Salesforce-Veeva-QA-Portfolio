import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceLoginTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://login.salesforce.com/");

            // Enter username
            driver.findElement(By.id("username")).sendKeys("your_username");

            // Enter password
            driver.findElement(By.id("password")).sendKeys("your_password");

            // Click the Login button
            driver.findElement(By.id("Login")).click();

            // Validate successful login by checking the page title or an element
            String pageTitle = driver.getTitle();
            if (pageTitle.contains("Home")) {
                System.out.println("Login test passed.");
            } else {
                System.out.println("Login test failed.");
            }
        } finally {
            driver.quit();
        }
    }
}
