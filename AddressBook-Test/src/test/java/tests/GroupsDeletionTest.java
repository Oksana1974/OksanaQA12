package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupsDeletionTest extends TestBase{

    @Test
    public void groupsDeletionTest() {
        app.goToGroupsPage();
        int before = app.getGroupCount();
        app.selectGroup();
        app.initGroupsDeletion();
        app.returnToGroupsPage();
        int after = app.getGroupCount();
        Assert.assertEquals(after, before-1);
    }




}
