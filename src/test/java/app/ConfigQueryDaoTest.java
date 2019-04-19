/*

package app;

import app.ConfigQuery;
import app.ConfigQueryAttributes;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.sql.DataSource;
import java.util.Arrays;


*/
/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 *//*



@RunWith(MockitoJUnitRunner.class)
public class ConfigQueryDaoTest {

    @Autowired private ConfigQueryDAO configQueryDAO;

    EntityManager entityManager = Util.getEntityManager();

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void cleanUp() {
        entityManager.createQuery("DELETE FROM " +ConfigQueryAttributes.class.getName()+" where metricId = 'test metric name'").executeUpdate();
        entityManager.createQuery("DELETE FROM " +ConfigQuery.class.getName() +" where metricId = 'test metric name'").executeUpdate();
    }


    @Test
    public void insertTest() {
        //configQueryDAO.insert(mockConfigQuery());

       // Assert.assertEquals("test metric name",queryCheck("test metric name").getMetricId());
    }

    private ConfigQuery queryCheck(String metricId) {
        String query = "FROM "+ ConfigQuery.class.getName() + " where metricId = :metricId";
        ConfigQuery configQuery = entityManager.createQuery(query, ConfigQuery.class)
                .setParameter("metricId", metricId).getSingleResult();
        return configQuery;
    }

    private ConfigQuery mockConfigQuery() {

        ConfigQueryAttributes configQueryAttribute1 = new ConfigQueryAttributes();
        configQueryAttribute1.setAttributeDataType("varchar");
        configQueryAttribute1.setMetricAttrId("test metric name");
        configQueryAttribute1.setQueryAttributes("pr name");

        ConfigQueryAttributes configQueryAttribute2 = new ConfigQueryAttributes();
        configQueryAttribute2.setAttributeDataType("varchar");
        configQueryAttribute2.setMetricAttrId("test metric name");
        configQueryAttribute2.setQueryAttributes("pr value");

        ConfigQueryAttributes configQueryAttribute3 = new ConfigQueryAttributes();
        configQueryAttribute3.setAttributeDataType("int");
        configQueryAttribute3.setMetricAttrId("test metric name");
        configQueryAttribute3.setQueryAttributes("fld-id");

        ConfigQuery configQuery = new ConfigQuery();
        configQuery.setMetricId("test metric name");
        configQuery.setStatus("enabled");
        configQuery.setFrequency("DAILY");
        configQuery.setInsertDate("17-APR-19");
        configQuery.setUpdateDate("17-APR-19");
        configQuery.setOptymyzeVersion("19.7.0.288");
        configQuery.setConfigQueryAttributes(Arrays.asList(configQueryAttribute1,configQueryAttribute2,configQueryAttribute3));

        return configQuery;
    }


}

*/
