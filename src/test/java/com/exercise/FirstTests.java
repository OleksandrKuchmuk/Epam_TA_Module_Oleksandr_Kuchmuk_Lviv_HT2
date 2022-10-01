package com.exercise;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstTests {


    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://avic.ua");
        WebElement input = driver.findElement(By.xpath("//div/i[@class = 'icon icon-search']"));
        input.click();


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.close();
    }

    @Test
    public void secondTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://avic.ua");
        WebElement element = driver.findElement(By.xpath("//a[@class='mobile-cat mobile-item js_search_btn']/div[@class='mobile-label']"));
        String param = element.getAttribute("outerText");
        Assert.assertEquals(" ", "Пошук", param);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.close();
    }

    @Test
    public void thirdTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://avic.ua");
        WebElement macBook = driver.findElement(By.xpath("//div[contains(text(),'Space Gray 2019')]"));
        macBook.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement bye = driver.findElement(By.xpath("//a[@class = 'main-btn main-btn--green main-btn--large']"));
        bye.click();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.close();

    }

    @Test
    public void fourthTest() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://avic.ua");
        WebElement discount = driver.findElement(By.xpath("//a[@class = 'or-color'][@href='/ua/discount']"));
        discount.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebElement product = driver.findElement(By.xpath("//div[contains(text(), '(MHMW3) (Open Box)')]"));
        product.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        driver.quit();
    }
}
