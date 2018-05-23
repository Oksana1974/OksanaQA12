package autho_Tests;

import model_G_C.Data_Contact;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateC extends Tests_Base{

@Test
public void createContact() {
        int before = appl.getSize();
        appl.getContactHelper().addNewContact();
        appl.getContactHelper().fillContact(new Data_Contact("d", "d", "d"));
        appl.getContactHelper().confirmC();
        int after = appl.getSize();
        Assert.assertEquals(after, before+1);
        }

        }
