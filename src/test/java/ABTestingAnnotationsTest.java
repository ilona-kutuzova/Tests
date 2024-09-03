import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class ABTestingAnnotationsTest {

        WebDriver driver;

//   WebDriver driver = new ChromeDriver();

        @BeforeTest
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");
            driver = new ChromeDriver();
        }

        @Test
        public void test() {

            driver.get("https://the-internet.herokuapp.com/abtest");

            String pageText = driver.getPageSource();

            if (pageText.contains("A/B Test Variation 1")) {
                System.out.println("A/B testing Version A validated");
            } else if (pageText.contains("A/B Test Control")) {
                System.out.println("A/B testing Version B validated");
            }
        }

        @AfterTest
        public void quit() {
            driver.quit();

    }
}
