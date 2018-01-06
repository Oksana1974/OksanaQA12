package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactsDeletionTest extends TestBase{

    @Test
    public void ContactsDeletionTest() {
        int before = wd.findElements(By.xpath("//*[@title='Edit']")).size();
        selectContact();
        initContactDeletion();
        confirmAlert();
        int after = wd.findElements(By.xpath("//*[@title='Edit']")).size();
        Assert.assertEquals(after, before-1);
    }
}
