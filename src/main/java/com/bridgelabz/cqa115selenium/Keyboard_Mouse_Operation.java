package com.bridgelabz.cqa115selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Keyboard_Mouse_Operation {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\suche\\Documents\\Drivers\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(2000);

        Robot r = new Robot();

        r.mouseMove(300, 500);

        r.keyPress(KeyEvent.VK_CONTROL);

        r.keyPress(KeyEvent.VK_SHIFT);

        r.keyPress(KeyEvent.VK_I);

        r.keyRelease(KeyEvent.VK_I);

        r.keyRelease(KeyEvent.VK_SHIFT);

        r.keyRelease(KeyEvent.VK_CONTROL);

        r.keyPress(KeyEvent.VK_CONTROL);

        r.keyPress(KeyEvent.VK_SHIFT);

        r.keyPress(KeyEvent.VK_C);
        Thread.sleep(3000);
      driver.close();
    }

}
