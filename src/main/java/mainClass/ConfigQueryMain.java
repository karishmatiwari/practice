package mainClass;

import dao.ConfigDaoSpring;
import dao.ConfigQueryDAO;
import model.ConfigQuery;
import model.ConfigQueryAttributes;
import org.springframework.stereotype.Component;
import validator.MetricAttributeSpecifiedValidator;
import validator.MetricNameLowerCaseValidator;
import validator.MetricUniquenessValidator;
import validator.api.Validator;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */
@Component
public class ConfigQueryMain {


   public static void main(String[] args) {

       //------------------------------------------------------------------------------------------



       ConfigQueryDAO configQueryDAO = new ConfigQueryDAO();

       ConfigDaoSpring configDaoSpring = new ConfigDaoSpring();

       String metric_name = "new metric to delete";

       Validator<String> validator = new MetricUniquenessValidator();
       //validator.validate(Arrays.asList(metric_name));

       System.out.println("passed for metric uniqueness validator");

       Validator<String> validator1 = new MetricNameLowerCaseValidator();
       //validator1.validate(Arrays.asList(metric_name));

       System.out.println("passed for metric lower case validator");


        ConfigQueryAttributes configQueryAttributes = new ConfigQueryAttributes(metric_name, "metric_query_attribute","String");
        ConfigQuery configQuery = new ConfigQuery(metric_name, "query", "daily", "enabled","19.3.0.288","16-MAR-19","16-MAR-19",Arrays.asList(configQueryAttributes));

        configQueryDAO.insert(configQuery);

       //configQueryDAO.delete(metric_name);
       //ConfigQuery daoConfigQuery = configQueryDAO.getConfigQuery("metric name");

       configDaoSpring.delete(metric_name);

       Validator<String> validator2 = new MetricAttributeSpecifiedValidator();
       //validator2.validate(Arrays.asList(metric_name));

       System.out.println("passed for at least one metric attribute present");

       //System.out.println(daoConfigQuery.getMetricId());

       //configQueryDAO.update(new ConfigQuery(metric_name, "query", "daily", "disabled","19.3.0.288","16-MAR-19","16-MAR-19",Collections.singletonList(configQueryAttributes)));

       //ConfigQuery metric_name_config_query = configQueryDAO.getConfigQuery(metric_name);
       //ConfigQueryAttributes metric_name_congig_query_attr = configQueryDAO.getConfigQueryAttr(metric_name);


   }

}
