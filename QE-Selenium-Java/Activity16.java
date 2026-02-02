package demos;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Activity16 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/selects");

        System.out.println(driver.getTitle());

        WebElement singleSelectElement = driver.findElement(By.tagName("select"));
        Select singleSelect = new Select(singleSelectElement);

        singleSelect.selectByVisibleText("Two");
        singleSelect.selectByIndex(2);
        singleSelect.selectByValue("four");

        System.out.println("All options in Single Select:");
        List<WebElement> options = singleSelect.getOptions();
        for (WebElement option : options) {
            System.out.println(option.getText());
        }

        driver.quit();
    }
}