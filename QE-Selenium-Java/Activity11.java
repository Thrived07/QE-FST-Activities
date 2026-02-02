package demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activiy11{
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://training-support.net/webelements/dynamic-controls");

        System.out.println(driver.getTitle());

        driver.findElement(By.id("checkbox"));

        WebElement toggleButton = driver.findElement(By.xpath("//button[contains(text(), 'Toggle Checkbox')]"));

        actions.click(toggleButton).build().perform();

        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));

        System.out.println("waited until checkbox was disappeared");

        actions.click(toggleButton).build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));

        System.out.println("waited until checkbox was visible");
        driver.quit();
    }
}