package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class AppTest {
    @Test
    public void firstTest() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://oktana-1fb-dev-ed.my.salesforce.com/");

        WebElement usernameField = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='password']"));
        WebElement loginButton = driver.findElement(By.xpath("//input[@id='Login']"));

        usernameField.sendKeys("developers.lwc@oktana.com");
        passwordField.sendKeys("dev.lwc2023");

        loginButton.click();

        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Home | Salesforce", "Error message");


    }
}
