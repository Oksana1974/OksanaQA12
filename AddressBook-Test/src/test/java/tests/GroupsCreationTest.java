package tests;

import model.GroupData;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsCreationTest extends TestBase{

    @Test
    public void groupsCreationTest() {
        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.initGroupCreation();
        app.fillGroupForm(new GroupData("g", "h", "f"));
        app.submitGroupCreation();
        app.returnToGroupsPage();
        int after = app.getGroupCount();
        Assert.assertEquals(after, before+1);
    }

}
