package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10{
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        Actions actions = new Actions(driver);

        driver.get("https://training-support.net/webelements/drag-drop");
        System.out.println(driver.getTitle());

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement d1 = driver.findElement(By.id("dropzone1"));
        WebElement d2 = driver.findElement(By.id("dropzone2"));

        actions.dragAndDrop(ball, d1).build().perform();
        if (driver.findElement(By.xpath("//*[@id='dropzone1']/span")).getText().equals("Dropped!")) {
            System.out.println("Dropped in dropzone1");
        }

        actions.dragAndDrop(ball, d2).build().perform();
        if (driver.findElement(By.xpath("//*[@id='dropzone2']/span")).getText().equals("Dropped!")) {
            System.out.println("Dropped in dropzone2");
        }

        driver.quit();
    }
}