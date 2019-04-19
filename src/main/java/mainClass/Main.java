package mainClass;


import applicationContext.ApplicationContextUtils;
import model.ConfigQuery;
import model.ConfigQueryAttributes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ConfigQueryService;
import service.ConfigQueryServiceImpl;

import java.util.Arrays;


/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

public class Main {

    public String getValueFromContext(String name) {
        ApplicationContext applicationContext = ApplicationContextUtils.getApplicationContext();

        String strFromContext = (String) applicationContext.getBean("");

        return strFromContext;
    }

    public static void main(String[] args) {
        String metric_name = "";

        ConfigQueryAttributes configQueryAttributes = new ConfigQueryAttributes(metric_name, "metric_query_attribute","String");
        ConfigQuery configQuery = new ConfigQuery(metric_name, "query", "daily", "enabled","19.3.0.288","16-MAR-19","16-MAR-19",Arrays.asList(configQueryAttributes));


        ApplicationContext appCntx = new ClassPathXmlApplicationContext("META-INF/spring-context.xml");

        ConfigQueryService strFromContext = (ConfigQueryService) appCntx.getBean("configQueryService");

        strFromContext.save(configQuery);

    }


}

