package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModify(){
        app.goTo().groupsPage();
        if(!app.groups().isThereAGroup()){
            app.groups().createGroup(new GroupData()
                    .withName("fff")
                    .withHeader("ggg")
                    .withFooter("ddd"));
        }
        int before = app.groups().getGroupCount();
        app.groups().selectGroupByIndex(before-1);
        app.groups().initgroupModification();
        app.groups().fillGroupForm(new GroupData()
                .withName(null)
                .withHeader(" ")
                .withFooter(" "));
        app.groups().confirmGroupModification();
        app.groups().returnToGroupsPage();
    }
}
