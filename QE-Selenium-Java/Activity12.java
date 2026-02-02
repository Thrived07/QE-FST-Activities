package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();

        Actions actions = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/dynamic-content");
        System.out.println(driver.getTitle());

        WebElement clickMeButton = driver.findElement(By.id("genButton"));
        actions.click(clickMeButton).build().perform();

        WebElement word_text = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("word"))
        );

        wait.until(
                ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release")
        );

        System.out.println(word_text.getText());

        driver.quit();
    }
}

