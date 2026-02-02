package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity7 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open page
        driver.get("https://training-support.net/webelements/dynamic-controls");

        // Print title
        System.out.println("Title: " + driver.getTitle());

        // Check input field before enabling
        System.out.println(driver.findElement(By.xpath("//*[@id='textInput']")).isEnabled());
        driver.findElement(By.xpath("//*[@id='textInputButton']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='textInput']")));
        System.out.println(driver.findElement(By.xpath("//*[@id='textInput']")).isEnabled());
        driver.quit();
    }
}