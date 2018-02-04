package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
        List<ContactData> before = app.contacts().getContactList();
//        int before = app.contacts().getContactCount();
        app.contacts().selectAndModifyContactByIndex(before.size()-1);
        app.contacts().initContactDeletion();
//        app.contacts().confirmAlert();
//        int after = app.contacts().getContactCount();
        List<ContactData> after = app.contacts().getContactList();
        Assert.assertEquals(after.size(), before.size()-1);
        before.remove(before.size()-1);
        Assert.assertEquals(before, after);
    }
}
