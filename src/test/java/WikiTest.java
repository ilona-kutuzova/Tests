import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;

public class WikiTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.wikipedia.org/");

        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"searchInput\"]"));
        searchField.sendKeys("QA");
        searchField.submit();

        Thread.sleep(3000);

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Quality assurance"));



     //   driver.quit();

    }
}
