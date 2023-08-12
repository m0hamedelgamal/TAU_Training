package exercises.chapter7.contextmenu;

import base.BaseTests;
import org.testng.annotations.Test;

public class ContextMenuTest2 extends BaseTests {
    @Test
    public void validettheContextmenu() {

        var checkcontextmenu = homePage.OpenContextMenupage();
        checkcontextmenu.clickTheContextmenu();
        checkcontextmenu.validateTheAlert();
    }

}
