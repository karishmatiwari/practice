package app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

@Service
public class ConfigQueryServiceImplHib implements ConfigQueryService{

    @Autowired
    private ConfigQueryDAO configQueryDAO;

    @Override
    public void save(ConfigQuery configQuery) {
        configQueryDAO.insert(configQuery);
    }

    @Override
    //@Transactional
    public void saveAll(List<ConfigQuery> configQueryList) {
        for (ConfigQuery configQuery : configQueryList) {
            configQueryDAO.insert(configQuery);//todo
        }
    }

    @Override
    public void update(ConfigQuery configQuery) {
        configQueryDAO.update(configQuery);
    }

    @Override
    public ConfigQuery getConfigQuery(String metricId) {
        return configQueryDAO.getConfigQuery(metricId);
    }

    @Override
    public void delete(String metricId) {
        configQueryDAO.delete(metricId);
    }

    public ConfigQueryDAO getConfigQueryDao() {
        return configQueryDAO;
    }

    public void setConfigQueryDao(ConfigQueryDAO ConfigQueryDAO) {
        this.configQueryDAO = ConfigQueryDAO;
    }
}
