package autho_Tests;

import app.ApplManager;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Tests_Base {

    protected final ApplManager appl = new ApplManager(BrowserType.FIREFOX);

    @BeforeClass
    public void setUp() throws Exception {
        appl.start();
    }


    @AfterClass
    public void tearDown() {
        appl.stop();
    }

}
