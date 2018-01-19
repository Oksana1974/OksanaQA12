package tests;

import model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModify(){
        app.getContactHelper().selectContact();
        app.getContactHelper().fillContactsForm(new ContactData("A", "A", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
        app.getContactHelper().updateContact();
    }
}
