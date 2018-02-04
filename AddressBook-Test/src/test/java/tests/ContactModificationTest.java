package tests;

import model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.List;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModify(){
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
//        int before = app.contacts().getContactCount();
        List<ContactData> before = app.contacts().getContactList();
        app.contacts().selectAndModifyContactByIndex(before.size()-1);
        ContactData contact = new ContactData()
                .withId(before.get(before.size()-1).getId())
                .withFirstName("Test")
                .withLastName("Test");
        app.contacts().fillContactsForm(contact);
        app.contacts().updateContact();
        List<ContactData> after = app.contacts().getContactList();
        Assert.assertEquals(after.size(), before.size());
        before.remove(before.size()-1);
        before.add(contact);
        Assert.assertEquals(new HashSet<Object>(before), new HashSet<Object>(after));
    }
}
