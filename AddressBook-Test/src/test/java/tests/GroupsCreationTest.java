package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsCreationTest extends TestBase{

    @Test
    public void groupsCreationTest() {
        app.goTo().groupsPage();
        int before = app.groups().getGroupCount();
        app.groups().initGroupCreation();
        app.groups().fillGroupForm(new GroupData()
                .withName("dd")
                .withHeader("dd")
                .withFooter("gg"));
        app.groups().submitGroupCreation();
        app.groups().returnToGroupsPage();
        int after = app.groups().getGroupCount();
        Assert.assertEquals(after, before+1);
    }

}
