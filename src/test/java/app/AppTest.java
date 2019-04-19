package app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Properties;

import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;


/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */



@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    //private App app = new App();

    @Mock private Properties properties;
    @InjectMocks private App app;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        mockProperties();
    }

    @Test
    public void propFileLoadingTest() throws IOException {
        //String expected = "value";
        String expected = "Optymyze_Telemetry_DW_Dev";
        String actual = app.getFile(PropertyKeys.USER_NAME.getKey());
        Assert.assertEquals(expected,actual);
    }

    @Test(expected = Exception.class)
    public void propFileNotFoundTest() throws Exception {
        String actual = app.getFile("");

        Assert.assertSame("Property not found for ", null, actual);
    }


    private void mockProperties() {
        when(properties.getProperty(anyString())).thenReturn("value");
    }



}
