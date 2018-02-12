package application;

import model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void createContactTest() {
        click(By.linkText("add new"));
    }

    public void fillContactsForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("middlename"), contactData.getMiddleName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("nickname"), contactData.getNickName());
        type(By.name("title"), contactData.getTitle());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("work"), contactData.getWork());
        type(By.name("fax"), contactData.getFax());
        type(By.name("email"), contactData.getEmail());
        type(By.name("email2"), contactData.getEmail2());
        type(By.name("email3"), contactData.getEmail3());
        type(By.name("homepage"), contactData.getHomePage());
        type(By.name("byear"), contactData.getbYear());
        type(By.name("ayear"), contactData.getaYear());
//        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(contactData.getbDay());
//        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getbMonth());
//        new Select(wd.findElement(By.name("aday"))).selectByVisibleText(contactData.getaDay());
//        new Select(wd.findElement(By.name("amonth"))).selectByVisibleText(contactData.getaMonth());
//        new Select(wd.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
        attach(By.name("photo"),contactData.getPhoto());
    }

    public void submitContactCreation() {
        click(By.xpath("//div[@id='content']/form/input[21]"));
    }

    public void initContactDeletion() {
        click(By.xpath("//*[@value='Delete']"));
    }

    public void selectContact() {
        click(By.xpath("//*[@title='Edit']"));
    }

    public void selectAndModifyContactByIndex(int index) {
        wd.findElements(By.xpath("//*[@title='Edit']")).get(index).click();

    }

    public int getContactCount() {
        return wd.findElements(By.xpath("//*[@title='Edit']")).size();
    }

    public void updateContact() {
        click(By.name("update"));
    }

    public boolean isThereAContact() {
        return isElementPresent(By.xpath("//*[@title='Edit']"));
    }

    public void createContact(ContactData contact) {
        createContactTest();
        fillContactsForm(contact);
        submitContactCreation();
    }

    public List<ContactData> getContactList() {
        List<ContactData> contacts = new ArrayList<>();
        List<WebElement> elements = wd.findElements(By.name("entry"));
        for (WebElement element : elements){
            int id = Integer.parseInt(element.findElement(By.tagName("input")).getAttribute("id"));
            String lastName = element.findElement(By.xpath(".//td[2]")).getText();
            String firstName = element.findElement(By.xpath(".//td[3]")).getText();
            ContactData contact = new ContactData().withId(id).withLastName(lastName).withFirstName(firstName);
            contacts.add(contact);
        }
        return contacts;
    }
}
