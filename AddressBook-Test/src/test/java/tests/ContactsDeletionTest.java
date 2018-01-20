package tests;

import model.ContactData;
import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsDeletionTest extends TestBase{

    @Test
    public void contactsDeletionTest() {
        app.getNavigationHelper().goToContactsPage();
        if(!app.getContactHelper().isThereAContact()){
            app.getContactHelper().createContact(new ContactData("y", "j", "f", "", "", "", "","", "", "", "", "", "", "", "", "", "", "", "", ""));
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().selectContactByIndex(before-1);
        app.getContactHelper().initContactDeletion();
//        app.getContactHelper().confirmAlert();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before-1);
    }
}
