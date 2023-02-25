package com.bridgelabz.cqa115selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFbReg {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("firstname")).sendKeys("Suchendra");
        Thread.sleep(2000);

        driver.findElement(By.name("lastname")).sendKeys("Mishra");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email__")).sendKeys("suchendramishra396@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("suchendramishra396@gmail.com");
        Thread.sleep(2000);

        driver.findElement(By.name("reg_passwd__")).sendKeys("Hello123*");
        Thread.sleep(2000);

        driver.findElement(By.id("day")).sendKeys("7");
        Thread.sleep(2000);

        driver.findElement(By.id("month")).sendKeys("May");
        Thread.sleep(2000);

        driver.findElement(By.id("year")).sendKeys("1997");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
        Thread.sleep(2000);
    }
}