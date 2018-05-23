package autho_Tests;

import org.testng.annotations.Test;

public class UpdateG extends Tests_Base {

    @Test
    public void updateGroup() {
        appl.navigationHelper.goToGroups();
        appl.getGroupHelper().chooseGroup();
        appl.getGroupHelper().editGr();
        appl.getGroupHelper().changeGr(null);
        appl.getGroupHelper().returnToGroups();
    }

}
