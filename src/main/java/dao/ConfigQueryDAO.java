package dao;

import app.Util;
import model.ConfigQuery;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

@Transactional
public class ConfigQueryDAO {

    EntityManager em = Util.getEntityManager();


    public void insert(ConfigQuery configQuery) {

        try {
            em.getTransaction().begin();
            em.persist(configQuery);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update(ConfigQuery configQuery){

        try {
            em.getTransaction().begin();
            em.merge(configQuery);
            em.getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ConfigQuery getConfigQuery(String metricId){

        ConfigQuery configQuery = null;
        try{
            configQuery = em.find(ConfigQuery.class, metricId);
        }catch(Exception e){
            e.printStackTrace();
        }
        return configQuery;
    }


    public void delete(String metricId){

        try {
            em.getTransaction().begin();
            ConfigQuery configQuery = em.find(ConfigQuery.class, metricId);
            //ConfigQueryAttributes configQueryAttributes = em.find(ConfigQueryAttributes.class, metricId);
            //em.remove(configQuery);
            em.remove(configQuery);
            em.getTransaction().commit();

        }catch (Exception e){
            e.printStackTrace();
        }
    }



/*
    public List<String> getMetricName() {
        List<String> names = new ArrayList<>();
        try {

            em.getTransaction().begin();
             names = em.createNativeQuery(
                    "select CQA_QUERY_ID from CONFIG_QUERY_ATTRIBUTES ",String.class)
                    .getResultList();

        }catch (Exception e){
            e.printStackTrace();
        }
        return names;

    }*/
}




















//em.createQuery("delete from ConfigQuery where metricId=:metricId")
//                    .setParameter("metricId", metricId).executeUpdate();