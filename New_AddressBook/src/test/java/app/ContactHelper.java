package app;

import model_G_C.Data_Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmC() {
        click(By.name("submit"));
    }

    public void fillContact(Data_Contact data_Contact) {
        changeC(data_Contact.getfName());
        type(By.name("address"), data_Contact.getAddress());
        type(By.name("address2"), data_Contact.getAdress2());
    }

    public void addNewContact() {
        click(By.linkText("add new"));
    }

    public void deleteCont() {
        click(By.xpath("//div[@id='content']/form[2]/input[2]"));
    }

    public void editContact() {
        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td[8]/a/img"));
    }

    public void updateCon() {
        click(By.xpath("//div[@id='content']/form[1]/input[22]"));
    }

    public void changeC(String firstName) {
        type(By.name("firstname"), firstName);
    }

}
