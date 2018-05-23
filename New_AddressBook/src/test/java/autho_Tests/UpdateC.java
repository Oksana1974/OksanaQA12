package autho_Tests;

import org.testng.annotations.Test;

public class UpdateC extends Tests_Base{

    @Test
    public void updateContact() {
        appl.getContactHelper().editContact();
        appl.getContactHelper().changeC("fffff");
        appl.getContactHelper().updateCon();
    }

}
