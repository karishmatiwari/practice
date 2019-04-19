package app;

import model.ConfigQuery;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Properties;


/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */


public class Util {

    public static EntityManager getEntityManager() {
            try {

                Configuration configuration = new Configuration();

                Properties settings = new Properties();
                settings.put(Environment.URL, new App().getFile("url"));
                //settings.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
                settings.put(Environment.USER, "Optymyze_Telemetry_DW_Dev");
                settings.put(Environment.PASS, "adept");

                configuration.setProperties(settings);

                //add all entity classes
                configuration.addAnnotatedClass(ConfigQuery.class);
                //configuration.addAnnotatedClass(ConfigQueryAttributes.class);//package instance

                EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("CA", settings);
                return entityManagerFactory.createEntityManager();


            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
    }

}
