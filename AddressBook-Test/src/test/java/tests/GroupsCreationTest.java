package tests;

import model.GroupData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsCreationTest extends TestBase{

    @Test
    public void GroupsCreationTest() {
        goToGroupsPage();
        int before = wd.findElements(By.name("selected[]")).size();
        initGroupCreation();
        fillGroupForm(new GroupData("g", "h", "f"));
        submitGroupCreation();
        returnToGroupsPage();
        int after = wd.findElements(By.name("selected[]")).size();
        Assert.assertEquals(after, before+1);
    }

}
