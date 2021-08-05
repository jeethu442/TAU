package hover;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {

    @Test
    public void testHoverUser1(){
      var hoversPage= homePage.clickHovers();
      var figureCaption = hoversPage.hoverOverFigure(1);
      assertTrue(figureCaption.isCaptionDisplayed(),"Caption is not displayed");
      assertEquals(figureCaption.getHeader(),"name: user1","Header incorrect");
      assertTrue(figureCaption.getLink().endsWith("/users/1"),"Incorrect link");
      assertEquals(figureCaption.getLinkText(),"View profile","Incorrect link text");
    }
}
