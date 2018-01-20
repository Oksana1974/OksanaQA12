package tests;

import model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsDeletionTest extends TestBase{

    @Test
    public void groupsDeletionTest() {
        app.getNavigationHelper().goToGroupsPage();
        if(!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("y", "j", "f"));
        }
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroupByIndex(before-1);
        app.getGroupHelper().initGroupsDeletion();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after, before-1);
    }




}
