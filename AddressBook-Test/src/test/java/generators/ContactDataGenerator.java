package generators;

import model.ContactData;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class ContactDataGenerator {
    public static void main(String[] arg) throws IOException {
        int count = Integer.parseInt(arg[0]);
        File file = new File(arg[1]);

        List<ContactData> contacts = generateContacts(count);
        save(contacts, file);
    }

    private static void save(List<ContactData> contacts, File file) throws IOException {
        Writer writer = new FileWriter(file);
        for (ContactData contact : contacts) {
            writer.write(String.format("%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s;%s\n"
                    , contact.getFirstName()
                    , contact.getLastName()
                    , contact.getAddress()
//                    , contact.getaDay()
                    , contact.getAddress2()
//                    , contact.getaMonth()
                    , contact.getaYear()
//                    , contact.getbDay()
//                    , contact.getbMonth()
                    , contact.getbYear()
                    , contact.getCompany()
                    , contact.getEmail()
                    , contact.getEmail2()
                    , contact.getEmail3()
                    , contact.getFax()
//                    , contact.getGroup()
                    , contact.getHome()
                    , contact.getHomePage()
                    , contact.getMiddleName()
                    , contact.getMobile()
                    , contact.getNickName()
                    , contact.getNotes()
                    , contact.getPhone2()
                    , contact.getTitle()
                    , contact.getWork()));
        }
        writer.close();
    }

    private static List<ContactData> generateContacts(int count) {
        List<ContactData> contacts = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            contacts.add(new ContactData()
                    .withFirstName(String.format("firstName %s", i))
                    .withLastName(String.format("lastName %s", i))
                    .withAddress(String.format("address %s", i))
//                    .withaDay(String.format("aDay %s", i))
                    .withAddress2(String.format("address2 %s", i))
//                    .withaMonth(String.format("aMonth %s", i))
                    .withaYear(String.format("aYear %s", i))
//                    .withbDay(String.format("bDay %s", i))
//                    .withbMonth(String.format("bMonth %s", i))
                    .withbYear(String.format("bYear %s", i))
                    .withCompany(String.format("company %s", i))
                    .withEmail(String.format("eMail %s", i))
                    .withEmail2(String.format("eMail2 %s", i))
                    .withEmail3(String.format("eMail3 %s", i))
                    .withFax(String.format("fax %s", i))
//                    .withGroup(String.format("group %s", i))
                    .withHome(String.format("home %s", i))
                    .withHomePage(String.format("homePage %s", i))
                    .withMiddleName(String.format("middleName %s", i))
                    .withMobile(String.format("mobile %s", i))
                    .withNickName(String.format("nickName %s", i))
                    .withNotes(String.format("notes %s", i))
                    .withPhone2(String.format("phone2 %s", i))
                    .withTitle(String.format("title %s", i))
                    .withWork(String.format("work %s", i)));
        }

        return contacts;
    }


}
