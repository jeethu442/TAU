package dropdown;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.DropdownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTests extends BaseTests {

    @Test
    public void testSelectOption(){

        DropdownPage dropdownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.selectDropdownOption(option);
        List<String> selectedOptions = dropdownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,"Incorrect number of selections");
        assertTrue(selectedOptions.contains(option),"Required option is not selected");
    }
}


/*

selectByVisibleText — that's the text that we actually see in the dropdown options
selectByIndex and selectByValue

deselectAll
deselectByIndex — so I can say deselect the first or the second ones and this index is zero based, meaning that the first element is 0
deselectByValue

getFirstSelectedOption — which will give you a WebElement
getAllSelectedOptions

getOptions — which would be a list of WebElements

getWrappedElement

isMultiple

*/