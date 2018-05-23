package autho_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DeleteC extends Tests_Base{
    
    @Test
    public void deleteContact() {
        int before = appl.getSize();
        appl.getContactHelper().editContact();
        appl.getContactHelper().deleteCont();
        int after = appl.getSize();
        Assert.assertEquals(after, before-1);
    }

}
