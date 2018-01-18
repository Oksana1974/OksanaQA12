package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsDeletionTest extends TestBase{

    @Test
    public void contactsDeletionTest() {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactDeletion();
//        app.getContactHelper().confirmAlert();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);
    }
}
