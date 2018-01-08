package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsDeletionTest extends TestBase{

    @Test
    public void contactsDeletionTest() {
        int before = app.getContactCount();
        app.selectContact();
        app.initContactDeletion();
        app.confirmAlert();
        int after = app.getContactCount();
        Assert.assertEquals(after, before-1);
    }

}
