import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorsExercise3 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {

        String browser = "firefox";


        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDriver.manage().window().setSize(new Dimension(980, 980));

        // Get NASA home page
        myDriver.get(" https://www.nasa.gov/");

        WebElement missionLink = myDriver.findElement(By.linkText("Missions"));

        System.out.println(missionLink.getAttribute("href"));

        WebElement nasaTvLink = myDriver.findElement(By.linkText("NASA TV"));
        System.out.println(nasaTvLink.getAttribute("href"));

        WebElement marsLink = myDriver.findElement(By.partialLinkText("Mars"));
        System.out.println(marsLink.getAttribute("href"));

        List<WebElement> inputTags = myDriver.findElements(By.tagName("Input"));

        for (WebElement element:inputTags) {
            System.out.println(element.getAttribute("class"));
        }

        Thread.sleep(2000);


        myDriver.quit();


    }


}
