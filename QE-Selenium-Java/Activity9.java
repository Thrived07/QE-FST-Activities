package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
        Actions builder = new Actions(driver);

        driver.get("https://training-support.net/webelements/keyboard-events");
        System.out.println(driver.getTitle());

        builder.sendKeys("Hello World").build().perform();

        String text = driver.findElement(By.xpath("//h1[contains(@class,'text-4xl')]")).getText();
        System.out.println("You typed:" + text);

        driver.quit();
    }
}
