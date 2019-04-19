package app;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

@Repository
public class ConfigDaoSpring {

    EntityManager em = Util.getEntityManager();

    @Transactional
    public void save(ConfigQuery configQuery) {
        em.persist(configQuery);
    }

    @Transactional
    public void saveAll(List<ConfigQuery> configQueryList) {
        for (ConfigQuery configQuery : configQueryList) {
            em.persist(configQuery);
        }
    }

    @Transactional
    public void update(ConfigQuery configQuery) {

    }

    @Transactional
    public void get(String metricId) {
        ConfigQuery configQuery = em.find(ConfigQuery.class, metricId);
        em.remove(configQuery);
    }






}
