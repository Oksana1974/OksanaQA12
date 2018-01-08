package tests;

import model.ContactData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsCreateTest extends TestBase{

    @Test
    public void contactsCreateTest() {
        int before = app.getContactCount();
        app.createContactTest();
        app.fillContactsForm(new ContactData("a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "1111", "1122", "d", "d", "d"));
        app.submitContactCreation();
        int after = app.getContactCount();
        Assert.assertEquals(after, before+1);
    }

}
