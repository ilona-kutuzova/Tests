import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneCaseTest2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ws00-test.myshopify.com/");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("12345");
        System.out.println("entered password");

        WebElement enterButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/button"));
        enterButton.click();
        System.out.println("clicked enter button");

        WebElement phoneCaseProduct = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/slider-component/ul/li[8]/div/div/div[2]/div[1]/h3/a"));
        phoneCaseProduct.click();
        System.out.println("clicked on phone case product");


    }
}
