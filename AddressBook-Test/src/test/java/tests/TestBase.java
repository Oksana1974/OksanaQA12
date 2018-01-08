package tests;

import model.ContactData;
import model.GroupData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

public class TestBase {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    @BeforeClass
    public void setUp() throws Exception {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        openAddressBook();
        login("admin", "secret");
    }

    public void returnToGroupsPage() {
        wd.findElement(By.linkText("group page")).click();
    }

    public void submitGroupCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void fillGroupForm(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());

    }

    public void initGroupCreation() {
        wd.findElement(By.name("new")).click();
    }

    public void goToGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
    }

    public void login(String userName, String userPass) {
        type(By.name("user"), userName);
        type(By.name("pass"), userPass);
        wd.findElement(By.xpath("//*[@type='submit']")).click();
    }

    public void type(By locator, String text) {
        wd.findElement(locator).click();
        wd.findElement(locator).clear();
        wd.findElement(locator).sendKeys(text);
    }

    public void openAddressBook() {
        wd.get("http://localhost/addressbook/");
    }

    @AfterClass
    public void tearDown() {
        wd.quit();
    }

    public void initGroupsDeletion() {
        wd.findElement(By.name("delete")).click();
    }

    public void selectGroup() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void confirmAlert(){
        wd.switchTo().alert().accept();
    }

    public void initContactDeletion() {
        wd.findElement(By.xpath("//*[@value='Delete']")).click();
    }

    public void selectContact() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void submitContactCreation() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
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
//        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[6]")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='content']/form/select[1]//option[6]")).click();
//        }
//        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[11]")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='content']/form/select[2]//option[11]")).click();
//        }
        type(By.name("byear"), contactData.getbYear());
//        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[6]")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='content']/form/select[3]//option[6]")).click();
//        }
//        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[12]")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='content']/form/select[4]//option[12]")).click();
//        }
        type(By.name("ayear"), contactData.getaYear());
//        if (!wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[2]")).isSelected()) {
//            wd.findElement(By.xpath("//div[@id='content']/form/select[5]//option[2]")).click();
//        }
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone2());
        type(By.name("notes"), contactData.getNotes());
    }

    public void createContactTest() {
        wd.findElement(By.linkText("add new")).click();
    }
}
