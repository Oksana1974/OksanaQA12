import org.testng.annotations.Test;

public class GroupsCreationTest extends TestBase{

    @Test
    public void GroupsCreationTest() {
        goToGroupsPage();
        initGroupCreation();
        fillGroupForm("g", "h", "f");
        submitGroupCreation();
        returnToGroupsPage();
    }

}
