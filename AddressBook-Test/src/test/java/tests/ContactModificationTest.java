package tests;

import model.ContactData;
import org.testng.annotations.Test;

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
        int before = app.contacts().getContactCount();
        app.contacts().selectContactByIndex(before-1);
        app.contacts().fillContactsForm(new ContactData()
                .withFirstName("")
                .withLastName("")
                .withNickName("")
                .withAddress("")
                .withAddress2("")
                .withaYear("")
                .withbYear("")
                .withCompany("")
                .withEmail("")
                .withEmail2("")
                .withEmail3("")
                .withFax("")
                .withHome("")
                .withHomePage("")
                .withMiddleName("")
                .withMobile("")
                .withNotes("")
                .withPhone2("")
                .withTitle("")
                .withWork(""));
        app.contacts().updateContact();
    }
}
