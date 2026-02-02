package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity14 {
    public static void main(String[] args) {

        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/tables");
        System.out.println(driver.getTitle());

        java.util.List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());

        java.util.List<WebElement> cols = driver.findElements(By.xpath("//table/thead/tr/th"));
        System.out.println(cols.size());

        WebElement book = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println(book.getText());

        WebElement price_header = driver.findElement(By.xpath("//table/thead/tr/th[contains(text(),'Price')]"));
        price_header.click();

        WebElement book_af_sort = driver.findElement(By.xpath("//table/tbody/tr[5]/td[2]"));
        System.out.println(book_af_sort.getText());

        driver.quit();
    }
}