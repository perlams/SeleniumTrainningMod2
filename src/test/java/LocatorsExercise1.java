import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise1 {

           public static void main(String[] args) throws InterruptedException, NullPointerException {

               String browser = "chrome";

               // Get correct driver for desire browser
               WebDriver myDriver = WebDriverFactory.getDriver(browser);

               myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);

               // Get mercado libre home page
               myDriver.get("https://www.mercadolibre.com.mx/");

               WebElement searchBox = myDriver.findElement(By.name("as_word"));

               searchBox.sendKeys("Selenium");
               WebElement searchButton = myDriver.findElement(By.className("nav-search-btn"));

               Thread.sleep(200);

               searchButton.click();

               WebElement firstProd = myDriver.findElement(By.className("main-title"));

               firstProd.click();


               Thread.sleep(2000);

               myDriver.quit();


           }


}
