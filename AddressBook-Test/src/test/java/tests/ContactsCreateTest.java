package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactsCreateTest extends TestBase{

    @Test
    public void contactsCreateTest() {
        app.goTo().contactsPage();
//        int before = app.contacts().getContactCount();
        List<ContactData> before = app.contacts().getContactList();
        app.contacts().createContactTest();
        app.contacts().fillContactsForm(new ContactData()
                .withFirstName("Test")
                .withLastName("g")
                .withNickName("l")
                .withAddress("ff")
                .withAddress2("")
                .withaYear("")
                .withbYear("")
                .withCompany("h")
                .withEmail("j")
                .withEmail2("h")
                .withEmail3("k")
                .withFax("j")
                .withHome("h")
                .withHomePage("j")
                .withMiddleName("h")
                .withMobile("g")
                .withNotes("t")
                .withPhone2("t")
                .withTitle("u")
                .withWork("j"));
        app.contacts().submitContactCreation();
//        int after = app.contacts().getContactCount();
        List<ContactData> after = app.contacts().getContactList();
        Assert.assertEquals(after.size(), before.size()+1);
    }
}
