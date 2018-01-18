package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsCreateTest extends TestBase{

    @Test
    public void contactsCreateTest() {
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().createContactTest();
        app.getContactHelper().fillContactsForm(new ContactData("Oksana", "AA", "AB", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "1111", "1122", "d", "d", "d"));
        app.getContactHelper().submitContactCreation();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);
    }
}
