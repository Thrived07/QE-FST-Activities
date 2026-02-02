package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class Activity13 {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        System.out.println(driver.getTitle());

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());

        List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(cols.size());

        List<WebElement> third_row = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
        for (WebElement cell : third_row) {
            System.out.println(cell.getText());
        }

        WebElement cell_value = driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]"));
        System.out.println(cell_value.getText());

        driver.quit();
    }
}