import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ABTesting {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/abtest");

        String pageText = driver.getPageSource();

        if (pageText.contains("A/B Test Variation 1")) {
            System.out.println("A/B testing Version A validated");
        } else if (pageText.contains("A/B Test Control")) {
            System.out.println("A/B testing Version B validated");
        }
        driver.quit();

    }
}
