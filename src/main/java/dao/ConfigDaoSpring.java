package dao;

import app.Util;
import model.ConfigQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.Arrays;
import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

@Repository("CQDao")
public class ConfigDaoSpring implements CQDao {

    EntityManager em = Util.getEntityManager();

    @Transactional//todo
    public void save(ConfigQuery configQuery) {
        em.persist(configQuery);
    }

    @Transactional
    public void saveAll(List<ConfigQuery> configQueryList) {
        for (ConfigQuery configQuery : configQueryList) {
            em.persist(configQuery);//todo
        }
    }

    @Transactional
    public void update(ConfigQuery configQuery) {
        em.merge(configQuery);
    }

    @Transactional
    public void delete(String metricId) {
        //ConfigQuery configQuery = em.find(ConfigQuery.class, metricId);
        em.createQuery("DELETE from " + ConfigQuery.class.getName() + " where metricId = :metricId")
                .setParameter("metricId", metricId).executeUpdate();
       // em.remove(configQuery); // todo : try query
    }

    @Transactional
    public ConfigQuery get(String metricId) {
        ConfigQuery configQuery = em.find(ConfigQuery.class, metricId);
        return configQuery;
    }


    public List<ConfigQuery> getAll() {
        return Arrays.asList();
    }





}
