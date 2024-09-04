import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropDown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/dropdown");

        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton\"]"));
        dropDown.click();

        WebElement checkbox = driver.findElement(By.xpath("/html/body/div/div/div/a[3]"));
        checkbox.click();

        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("https://formy-project.herokuapp.com/checkbox"));

        Thread.sleep(5000);

        driver.quit();

    }
}
