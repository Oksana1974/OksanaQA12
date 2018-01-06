package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsCreateTest extends TestBase{

    @Test
    public void ContactsCreateTest() {
        int before = wd.findElements(By.xpath("//*[@title='Edit']")).size();
        createContactTest();
        fillContactsForm("a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "a", "1111", "1122", "d", "d", "d");
        submitContactCreation();
        int after = wd.findElements(By.xpath("//*[@title='Edit']")).size();
        Assert.assertEquals(after, before+1);
    }

}
