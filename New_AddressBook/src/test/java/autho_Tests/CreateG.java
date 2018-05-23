package autho_Tests;

import model_G_C.Data_Groups;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateG extends Tests_Base{
    
    @Test
    public void createGroup() {
        appl.navigationHelper.goToGroups();
        int before = appl.getSize();
        appl.getGroupHelper().addNewGroup();
        appl.getGroupHelper().fillGroup(new Data_Groups("new", "new", "new"));
        appl.getGroupHelper().confirmG();
        appl.getGroupHelper().returnToGroups();
        int after = appl.getSize();
        Assert.assertEquals(after, before+1);
    }

}
