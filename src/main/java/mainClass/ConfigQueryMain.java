package mainClass;

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
       /*String metric_name = "new_metric";

       ConfigQueryServiceImpl configQueryServiceImplHib = new ConfigQueryServiceImpl();

       ConfigQueryDAO configQueryDAO = new ConfigQueryDAO();
       configQueryServiceImplHib.setConfigQueryDao(configQueryDAO);

       ConfigQueryAttributes configQueryAttributes = new ConfigQueryAttributes(metric_name, "metric_query_attribute","String");
       ConfigQuery configQuery = new ConfigQuery(metric_name, "query", "daily", "enabled","19.3.0.288","16-MAR-19","16-MAR-19",Arrays.asList(configQueryAttributes));

       Validator<String> validator = new MetricUniquenessValidator();
       //validator.validate(Arrays.asList(metric_name));

       System.out.println("passed for metric uniqueness validator");

       Validator<String> validator1 = new MetricNameLowerCaseValidator();
       validator1.validate(Arrays.asList(metric_name));

       System.out.println("passed for metric lower case validator");

      // configQueryServiceImplHib.save(configQuery);

       //configQueryServiceImplHib.update();

       ConfigQuery new_metric = configQueryServiceImplHib.getConfigQuery("new_metric");
       System.out.println(new_metric.getMetricId());


       configQueryServiceImplHib.delete("new_metric");

*/


       //------------------------------------------------------------------------------------------



       ConfigQueryDAO configQueryDAO = new ConfigQueryDAO();

       String metric_name = "new metric name";

       Validator<String> validator = new MetricUniquenessValidator();
       validator.validate(Arrays.asList(metric_name));

       System.out.println("passed for metric uniqueness validator");

       Validator<String> validator1 = new MetricNameLowerCaseValidator();
       validator1.validate(Arrays.asList(metric_name));

       System.out.println("passed for metric lower case validator");


        ConfigQueryAttributes configQueryAttributes = new ConfigQueryAttributes(metric_name, "metric_query_attribute","String");
        ConfigQuery configQuery = new ConfigQuery(metric_name, "query", "daily", "enabled","19.3.0.288","16-MAR-19","16-MAR-19",Arrays.asList(configQueryAttributes));

        //configQueryDAO.insert(configQuery);

       configQueryDAO.delete(metric_name);

       Validator<String> validator2 = new MetricAttributeSpecifiedValidator();
       validator2.validate(Arrays.asList(metric_name));

       System.out.println("passed for at least one metric attribute present");

       ConfigQuery daoConfigQuery = configQueryDAO.getConfigQuery("metric name");
       System.out.println(daoConfigQuery.getMetricId());

       configQueryDAO.update(new ConfigQuery(metric_name, "query", "daily", "diabled","19.3.0.288","16-MAR-19","16-MAR-19",Collections.singletonList(configQueryAttributes)));

       //ConfigQuery metric_name_config_query = configQueryDAO.getConfigQuery(metric_name);
       //ConfigQueryAttributes metric_name_congig_query_attr = configQueryDAO.getConfigQueryAttr(metric_name);


   }

}
