package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsDeletionTest extends TestBase{

    @Test
    public void contactsDeletionTest() {
        app.goTo().contactsPage();
        if(!app.contacts().isThereAContact()){
            app.contacts().createContact(new ContactData()
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
        }
        int before = app.contacts().getContactCount();
        app.contacts().selectContactByIndex(before-1);
        app.contacts().initContactDeletion();
//        app.getContactHelper().confirmAlert();
        int after = app.contacts().getContactCount();
        Assert.assertEquals(after, before-1);
    }
}
