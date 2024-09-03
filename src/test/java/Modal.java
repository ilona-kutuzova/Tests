import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Modal {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");
//        driver.manage().window().maximize();

        WebElement openModalButton = driver.findElement(By.cssSelector("#modal-button"));
        openModalButton.click();

        Thread.sleep(5000);

        WebElement closeButton = driver.findElement(By.id("close-button"));
//        webdriver click method (sometimes doesn't work, so use JavascriptExecutor instead)
//        closeButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click()", closeButton);


        System.out.println("Modal closed");

        driver.quit();
    }
}
