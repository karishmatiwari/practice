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

        ApplicationContext applicationContext = ApplicationContextUtils.getApplicationContext();

        ApplicationContext appCntx = new ClassPathXmlApplicationContext("META-INF/spring-context.xml");



        ConfigQueryService strFromContext = (ConfigQueryService) applicationContext.getBean("ConfigQueryService");

    }


}

