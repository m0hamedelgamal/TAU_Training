package AddOrRemoveBtn;

import base.BaseTests;
import org.testng.annotations.Test;

public class AddorRemoveTest extends BaseTests {

    @Test
    public void addnewbtn() {
        var addBtns = homePage.OpenAddOrRemoveElement();
        addBtns.clickaddbtn();
        addBtns.clickdeletebtn();
    }


}
