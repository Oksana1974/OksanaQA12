package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsCreateTest extends TestBase{

    @Test
    public void contactsCreateTest() {
        app.goTo().contactsPage();
        int before = app.contacts().getContactCount();
        app.contacts().createContactTest();
        app.contacts().fillContactsForm(new ContactData()
                .withFirstName("A")
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
        int after = app.contacts().getContactCount();
        Assert.assertEquals(after, before+1);
    }
}
