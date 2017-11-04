import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class LocatorsExercise2 {


    public static void main(String[] args) throws InterruptedException, NullPointerException {

        String browser = "chrome";


        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDriver.manage().window().setSize(new Dimension(980, 980));

        // Get Google home page
        myDriver.get("https://www.google.com.mx");

        WebElement searchBox = myDriver.findElement(By.id("JustAnId"));

        myDriver.quit();


    }

}
