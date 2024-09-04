import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;

public class PhoneCaseTest2 {

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

        WebElement phoneCaseProduct = driver.findElement(By.xpath("/html/body/main/section[2]/div/div/slider-component/ul/li[8]/div/div/div[2]/div[1]/h3/a"));
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
        Thread.sleep(5000);
        addToCartButton.click();
        System.out.println("clicked on add to cart button");
        Thread.sleep(10000);

        WebElement checkoutButton = driver.findElement(By.xpath("/html/body/main/div[2]/div/div/div/div/div[2]/button"));
        checkoutButton.click();
        System.out.println("clicked on checkout button");
        Thread.sleep(5000);

        WebElement contactField = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div/main/div/form/div[1]/div[1]/section/div/div[1]/div/div/div[3]/div[1]/div/div/div/input"));
        contactField.sendKeys("test@test.com");
        System.out.println("entered contact info");

        WebElement firstName = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div/main/div/form/div[1]/div[3]/div/section/div/div[2]/section/div/div/div[1]/div/div/div/div[1]/div[2]/div[1]/div/div/input"));
        firstName.sendKeys("Test");
        System.out.println("entered first name");

        WebElement lastName = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div[1]/div[2]/div[1]/div/main/div/form/div[1]/div[3]/div/section/div/div[2]/section/div/div/div[1]/div/div/div/div[1]/div[2]/div[2]/div/div/input"));
        lastName.sendKeys("Test");
        System.out.println("entered last name");

        WebElement address = driver.findElement(By.id("shipping-address1"));
        address.sendKeys("1411 Broadway");
        System.out.println("entered address");

        WebElement city = driver.findElement(By.id("TextField3"));
        city.sendKeys("New York");
        System.out.println("entered city");

        Select se = new Select(driver.findElement(By.id("Select1")));
        se.selectByVisibleText("New York");
        System.out.println("selected state");

        WebElement zipCode = driver.findElement(By.id("TextField4"));
        zipCode.sendKeys("10018");
        System.out.println("entered zip code");
        Thread.sleep(5000);

        new Actions(driver).moveToElement(driver.findElement(By.id("number"))).click().sendKeys("1").build().perform();
        System.out.println("entered credit card number");

        new Actions(driver).moveToElement(driver.findElement(By.id("expiry"))).click().sendKeys("09/25").build().perform();
        System.out.println("entered expiry date");

        new Actions(driver).moveToElement(driver.findElement(By.id("verification_value"))).click().sendKeys("123").build().perform();
        System.out.println("entered security code");

        WebElement payNowButton = driver.findElement(By.id("checkout-pay-button"));
        payNowButton.click();
        System.out.println("clicked on pay now button");
        Thread.sleep(5000);

        String pageText = driver.getPageSource();
        assertTrue(pageText.contains("Your order is confirmed"));
        System.out.println("the test is passed");

        Thread.sleep(10000);

        driver.quit();
    }
}
