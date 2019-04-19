/*
package app;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Arrays;

*/
/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 *//*

public class Main {


    private static ConfigQuery getData() {
        String metric_name = "zz";

        ConfigQueryAttributes configQueryAttributes = new ConfigQueryAttributes(metric_name, "metric_query_attribute", "String");
        ConfigQuery configQuery = new ConfigQuery(metric_name, "query", "daily",
                "enabled","19.3.0.288","16-MAR-19","16-MAR-19",Arrays.asList(configQueryAttributes);
        return configQuery;
    }

    private static ConfigQuery getUpdatedData() {
        String metric_name = "";
        ConfigQueryAttributes configQueryAttributes = new ConfigQueryAttributes(metric_name, "metric_query_attribute_new", "String");
        ConfigQuery configQuery = new ConfigQuery(metric_name, "query_new", "daily",
                "disabled","19.3.0.288","16-MAR-19","16-MAR-19",Arrays.asList(configQueryAttributes));
        return configQuery;
    }


    public static void main(String[] args) {
        ConfigQueryServiceImplHib configQueryServiceImplHib = new ConfigQueryServiceImplHib();
        configQueryServiceImplHib.save(getData());
        configQueryServiceImplHib.update(getUpdatedData());

    }

}
*/
