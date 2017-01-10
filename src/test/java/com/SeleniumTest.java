package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by viktor on 1/10/17.
 */
public class SeleniumTest {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/viktor/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/user/");

        //fillUpForm(driver, "test", 12, 10);
        removeUser(driver, "test");
    }

    public static void fillUpForm(WebDriver driver, String name, int age, int quantity) {

        for (int i = 0; i < quantity; i++) {
            driver.findElement(By.className("new")).click();
            driver.findElement(By.id("name")).sendKeys(name);
            driver.findElement(By.id("age")).sendKeys(String.valueOf(age));
            driver.findElement(By.className("save")).click();
        }

    }

    public static void removeUser(WebDriver driver, String name) {
        driver.findElement(By.className("new")).click();
        driver.findElement(By.partialLinkText(name)).click();
        driver.findElement(By.className("delete")).click();
    }
}
