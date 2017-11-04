package com.qalabs.seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn1 {

    public static void main(String[] args) throws InterruptedException, NullPointerException {


        String browser = "firefox";


        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        myDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        myDriver.manage().window().setSize(new Dimension(980, 980));

        // Get ESPN home page
        myDriver.get("https://www.amazon.com.mx");

        WebElement btnPromociones = myDriver.findElement(By.xpath("//a[@id='nav-your-amazon']/following-sibling::a[1]"));
        //By.LinkText("Promociones"));

        btnPromociones.click();

        WebElement cbAccElectronicos = myDriver.findElement(By.xpath(" //div[@class='a-row a-expander-container a-expander-inline-container']/span[1]/div/label/input"));

        // XPAth //input/following-sibling::span[contains(text(), 'Accesorios electr')]

        //   (//*[@id='widgetsFilters']//label/span)[1]]
        cbAccElectronicos.click();

        WebElement cbOfertasDestacadas = myDriver.findElement(By.xpath("//div[@class='a-row a-spacing-small filterItem'][2]/span[last()]/div/label/input"));

        // input/following-sibling::span[contains(text(),]

        cbOfertasDestacadas.click();

        WebElement linkFourStars = myDriver.findElement(By.xpath(" //i[@class='a-icon a-icon-star a-star-4']"));

        //  (//*[@class='a-link-normal']//span[contains(text(), 'o')])[1]

        linkFourStars.click();

        Thread.sleep(3000);

        Double lowestPrice = Double.MAX_VALUE;

        for ( WebElement product: myDriver.findElements(By.xpath("//div[contains(@class, 'priceBlock')]/span"))) {

            Double tmpPrice = Double.parseDouble(product.getText().replaceAll("\\$|,", ""));

            if (tmpPrice < lowestPrice) {

                lowestPrice = tmpPrice;

                System.out.println("The price updated is " + lowestPrice);

            }
        }

        System.out.println("The lowest price is " + lowestPrice);

        myDriver.quit();
    }
}
