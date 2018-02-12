package application;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class HelperBase {
    WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text) {
        click(locator);
        if(text != null) {
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
    }

    public void attach(By locator, File file) {
        if(file != null) {
            wd.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void confirmAlert(){
        wd.switchTo().alert().accept();
    }

    public boolean isElementPresent(By locator){
        try{
            wd.findElement(locator);
            return true;}
            catch (NoSuchElementException ex){
            return false;
        }
    }
}
