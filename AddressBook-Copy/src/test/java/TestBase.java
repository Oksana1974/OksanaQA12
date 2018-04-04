import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeMethod
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    public void confirm() {
        wd.findElement(By.cssSelector("button.personalPageBtnRed")).click();
    }


    public void authorization() {
        wd.findElement(By.xpath("//div[@class='topItem']//p[.='Вход/Регистрация']")).click();
        wd.findElement(By.id("username")).click();
        wd.findElement(By.id("username")).clear();
        wd.findElement(By.id("username")).sendKeys("anaxanamun74@mail.ru");
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).sendKeys("\\undefined");
    }

    public void goToCite() {
        wd.get("http://5.23.48.15/html/main.html?name=first");
    }

    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
