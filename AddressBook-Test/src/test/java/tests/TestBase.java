package tests;

import application.ApplicationManager;
import org.openqa.selenium.remote.BrowserType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;

public class TestBase {

    protected static final ApplicationManager app = new ApplicationManager(BrowserType.CHROME);
    Logger loger = LoggerFactory.getLogger(TestBase.class);

    @BeforeSuite
    public void setUp() throws Exception {
        app.start();
    }

    @BeforeMethod
    public void logTestStart(Method m)  {
        loger.info("Start test " + m.getName());
    }

    @AfterMethod(alwaysRun = true)
    public void logTestStop(Method m){
        loger.info("Stop test " + m.getName());
    }

    @AfterSuite(alwaysRun = true)
    public void tearDown() {
        app.stop();
    }

}

