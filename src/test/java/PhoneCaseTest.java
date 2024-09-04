import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PhoneCaseTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/ilonakutuzova/Downloads/chromedriver-mac-arm64/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://ws00-test.myshopify.com/");

        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("12345");
        System.out.println("entered password");

        WebElement enterButton = driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/form/button"));
        enterButton.click();
        System.out.println("clicked enter button");

        WebElement viewAllButton = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/div[2]/a"));
        viewAllButton.click();
        System.out.println("clicked view all button");

        WebElement phoneCaseProduct = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/ul/li[9]/div/div/div[2]/div[1]/h3/a"));
        phoneCaseProduct.click();
        System.out.println("clicked on phone case product");
        Thread.sleep(5000);

        WebElement productModel = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[2]/div[2]/div[2]/span[20]/div"));
        productModel.click();
        System.out.println("selected product model");

        WebElement productDesign = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[5]/div[2]/div[2]/span[3]/div"));
        productDesign.click();
        System.out.println("selected product design");

        WebElement uploadImageField = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[6]/div[2]/div[2]/div/div/div/input"));
        String filePath = "/Users/ilonakutuzova/Downloads/cat_image.jpeg";
        uploadImageField.sendKeys(filePath);
        System.out.println("uploaded image file");

        WebElement text1 = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[7]/div[2]/div[2]/div/div/label[1]/input"));
        text1.sendKeys("First Text");
        System.out.println("entered text 1");

        WebElement text2 = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[7]/div[2]/div[2]/div/div/label[2]/input"));
        text2.sendKeys("Second Text");
        System.out.println("entered text 2");

        WebElement pickColor = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[8]/div[2]/div[2]/span[2]/span/div[1]/span"));
        pickColor.click();
        System.out.println("selected color");

        WebElement ringHolder = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div[2]/div[9]/div[2]/div[2]/div/div[3]/div[1]/span/div[1]/img"));
        ringHolder.click();
        System.out.println("selected ring holder");

        WebElement addToCartButton = driver.findElement(By.xpath("/html/body/main/section[1]/div/div/div/div/div/div/div/div[2]/div[2]/div[2]/div/button[4]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", addToCartButton);
        addToCartButton.click();
        System.out.println("clicked on add to cart button");
        Thread.sleep(10000);

        WebElement checkoutButton = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/div[2]/button"));
        checkoutButton.click();
        System.out.println("clicked on checkout button");

        driver.quit();

    }
}
