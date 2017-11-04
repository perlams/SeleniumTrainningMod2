package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LocatorExercise5 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {

        String browser = "chrome";


        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDriver.manage().window().setSize(new Dimension(980, 980));

        // Get Amazon home page
        myDriver.get(" https://www.amazon.com.mx/");

        WebElement searchDb = myDriver.findElement(By.id("searchDropdownBox"));

        Select select = new Select(searchDb);

        List <WebElement> option = select.getOptions();

        for ( WebElement element:option) {
            System.out.println(element.getText());

        }

        System.out.println("Is it multiple = " + select.isMultiple());

        System.out.println("Select options = "+select.getFirstSelectedOption().getText());

        select.selectByIndex(0);
        System.out.println("Selected option = " + select.getFirstSelectedOption().getText());

        //select.selectByValue(By."Auto");
        System.out.println("Selected option = " + select.getFirstSelectedOption().getText());


        Thread.sleep(2000);


        myDriver.quit();


    }
}
