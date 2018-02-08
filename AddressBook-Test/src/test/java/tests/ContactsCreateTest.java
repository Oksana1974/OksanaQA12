package tests;

import model.ContactData;
import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactsCreateTest extends TestBase {

    @DataProvider
    public Iterator<Object[]> validContacts() throws IOException {
        List<Object[]> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader
                (new FileReader(new File("src/test/resources/contacts.csv")));
        String line = reader.readLine();
        while (line != null) {
            String[] split = line.split(";");
            list.add(new Object[]{new ContactData()
                    .withFirstName(split[0])
                    .withLastName(split[1])
                    .withAddress(split[2])
//                    .withaDay(split[3])
                    .withAddress2(split[3])
//                    .withaMonth(split[5])
                    .withaYear(split[4])
//                    .withbDay(split[7])
//                    .withbMonth(split[8])
                    .withbYear(split[5])
                    .withCompany(split[6])
                    .withEmail(split[7])
                    .withEmail2(split[8])
                    .withEmail3(split[9])
                    .withFax(split[10])
//                    .withGroup(split[11])
                    .withHome(split[11])
                    .withHomePage(split[12])
                    .withMiddleName(split[13])
                    .withMobile(split[14])
                    .withNickName(split[15])
                    .withNotes(split[16])
                    .withPhone2(split[17])
                    .withTitle(split[18])
                    .withWork(split[19])});
            line = reader.readLine();
        }
        return list.iterator();
    }

    @Test(dataProvider = "validContacts")
    public void contactsCreateTest(ContactData contact) {
        app.goTo().contactsPage();
//        int before = app.contacts().getContactCount();
        List<ContactData> before = app.contacts().getContactList();
        app.contacts().createContactTest();
        app.contacts().fillContactsForm(contact);
        app.contacts().submitContactCreation();
//        int after = app.contacts().getContactCount();
        List<ContactData> after = app.contacts().getContactList();
        Assert.assertEquals(after.size(), before.size() + 1);
    }
}
