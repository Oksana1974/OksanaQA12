package app;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

public class ApplManager {
    WebDriver wd;

    public GroupHelper groupHelper;
    public NavigationHelper navigationHelper;
    public ContactHelper contactHelper;
    public SessionHelper sessionHelper;
    private String browser;

    public ApplManager(String browser) {

        this.browser = browser;
    }

    public void start() {
        if(browser.equals(BrowserType.FIREFOX)){
            System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox ISR\\firefox.exe");
            wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        }else
        if(browser.equals(BrowserType.CHROME)){
            wd = new ChromeDriver();
        }else
        if(browser.equals(BrowserType.IE)){
            wd = new InternetExplorerDriver();
        }
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        sessionHelper = new SessionHelper(wd);
        sessionHelper.goToSite("http://localhost/addressbook/");
        groupHelper = new GroupHelper(wd);
        navigationHelper = new NavigationHelper(wd);
        contactHelper = new ContactHelper(wd);
        sessionHelper.authorization("admin", "secret");
    }

    public void stop() {
        wd.quit();
    }

    public int getSize() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }

    public ContactHelper getContactHelper() {
        return contactHelper;
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;

    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
