package tests;

import model.GroupData;
import org.testng.annotations.Test;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModify(){
        app.getNavigationHelper().goToGroupsPage();
        if(!app.getGroupHelper().isThereAGroup()){
            app.getGroupHelper().createGroup(new GroupData("y", "j", "f"));
        }
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initgroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData(" ", null, " "));
        app.getGroupHelper().confirmGroupModification();
        app.getGroupHelper().returnToGroupsPage();
    }
}
