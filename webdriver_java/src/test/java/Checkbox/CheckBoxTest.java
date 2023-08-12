package Checkbox;

import base.BaseTests;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTests {

    @Test
    public void verifyTheCheckboxs() {
        var checkboxverification = homePage.OpenCheckboxPage();
        checkboxverification.checkAndUncheck();

    }

}
