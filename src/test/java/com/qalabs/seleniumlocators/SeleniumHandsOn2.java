package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn2 {

    public void printWinner(List<WebElement> list){

     System.out.println("----------------------------------------------------------------");
     //list.("//h2[@class='scoreLabel_title']").getText();


    }

    public static void main(String[] args) throws InterruptedException, NullPointerException {

        String browser = "firefox";


        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        myDriver.manage().window().setSize(new Dimension(980, 980));

        // Get ESPN home page
        myDriver.get(" http://www.espn.com.mx/");

        List<WebElement> leaguesList = myDriver.findElements(By.xpath("//*[contains(@class, 'scoreboard active')]"));

        for ( List<WebElement> leaguesList: league) {

             printWinner(leaguesList);

        }

        Thread.sleep(2000);

        myDriver.quit();


    }
}
