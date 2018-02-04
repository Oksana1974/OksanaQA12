package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class GroupsCreationTest extends TestBase{

    @Test
    public void groupsCreationTest() {
        app.goTo().groupsPage();
        List<GroupData> before = app.groups().getGroupList();
//        int before = app.groups().getGroupCount();
        app.groups().initGroupCreation();
        app.groups().fillGroupForm(new GroupData()
                .withName("dd")
                .withHeader("dd")
                .withFooter("gg"));
        app.groups().submitGroupCreation();
        app.groups().returnToGroupsPage();
        List<GroupData> after = app.groups().getGroupList();
        Assert.assertEquals(after.size(), before.size()+1);
//        int after = app.groups().getGroupCount();
//        Assert.assertEquals(after, before+1);
    }

}
