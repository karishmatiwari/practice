/*
package app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.File;
import java.io.IOException;




*/
/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 *//*



@RunWith(PowerMockRunner.class)
@PrepareForTest(System.class)
public class AppTest {

    @Rule
    public TemporaryFolder tempFolder = new TemporaryFolder();

   // @Value("${shared-temp-folder}") protected String tempFolder;
    private App app = new App();
    File createdFile;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        //mockSystemGetEnv();
    }

    @Test
    public void propFileLoadingTest() throws IOException {
        String expected = "Optymyze_Telemetry_DW_Dev";
        String actual = app.getFile(PropertyKeys.USER_NAME.getKey());
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = Exception.class)
    public void propFileNotFoundTest() throws Exception {
        String actual = app.getFile("");

        Assert.assertSame("Property not found for ", null, actual);
    }


    private void mockSystemGetEnv() {
        PowerMockito.mockStatic(System.class);
        // Create a temporary file.
        try {
            //createdFile = tempFolder.newFile("telemetry");
            createdFile = tempFolder.newFolder("CAPFolder");
        } catch (IOException e) {
            e.printStackTrace();
        }

        String path = createdFile.getPath();
        //File file = new File(tempFolder);
        PowerMockito.when(System.getenv("client_analytics")).thenReturn(path);
    }


}


*/
