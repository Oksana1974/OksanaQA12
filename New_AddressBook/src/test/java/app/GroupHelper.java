package app;

import model_G_C.Data_Groups;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GroupHelper extends HelperBase{

    public GroupHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToGroups() {
        click(By.linkText("group page"));
    }

    public void confirmG() {
        click(By.name("submit"));
    }

    public void fillGroup(Data_Groups data_Groups) {
        type(By.name("group_name"), data_Groups.getName());
        type(By.name("group_header"), data_Groups.getHeader());
        type(By.name("group_footer"), data_Groups.getFooter());
    }

    public void addNewGroup() {
        click(By.name("new"));
    }

    public void deleteGroups() {
        click(By.name("delete"));
    }

    public void changeGr(String name) {
        type(By.name("group_name"), name);
        click(By.name("update"));
    }

    public void editGr() {
        click(By.name("edit"));
    }

    public void chooseGroup() {
        click(By.name("selected[]"));
    }
}
