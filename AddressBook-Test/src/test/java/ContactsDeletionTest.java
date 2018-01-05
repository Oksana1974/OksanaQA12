import org.testng.annotations.Test;

public class ContactsDeletionTest extends TestBase{

    @Test
    public void ContactsDeletionTest() {

        selectContact();
        initContactDeletion();
        confirmAlert();
    }
}
