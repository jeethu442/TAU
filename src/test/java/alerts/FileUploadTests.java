package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploads();
        uploadPage.uploadFile("/Users/jeethu/IdeaProjects/TAU/resources/chromedriver");
        assertEquals(uploadPage.getUploadedFileName(),"chromedriver","Incorrect file uploaded");
    }
}
