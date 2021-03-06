package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BrowserManager {
    public static void click(By by){
        driver.findElement(by).click();
    }
    public static void sendKeyText(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }
    public static String currentTime() {
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddmmyymmss");
        return sdf.format(date);
    }
    public static void waitForClickable(By by,int timeInSeconds){
        WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
    public static void waitForVisible(By by, int timeInSeconds){
        WebDriverWait wait=new WebDriverWait(driver,timeInSeconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
