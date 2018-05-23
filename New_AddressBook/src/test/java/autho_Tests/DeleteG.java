package autho_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteG extends Tests_Base{

    @Test
    public void deleteGroup() {
        appl.navigationHelper.goToGroups();
        int before = appl.getSize();
        appl.getGroupHelper().chooseGroup();
        appl.getGroupHelper().deleteGroups();
        appl.getGroupHelper().returnToGroups();
        int after = appl.getSize();
        Assert.assertEquals(after, before-1);
    }

}
