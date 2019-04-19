package service;

import dao.CQDao;
import dao.ConfigDaoSpring;
import dao.ConfigQueryDAO;
import model.ConfigQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

@Service("ConfigQueryService")
@Transactional
public class ConfigQueryServiceImpl implements ConfigQueryService {

    @Autowired private CQDao configQueryDAO; //configDaoSpring
    //private ConfigQueryDAO configQueryDAO;

    @Override
    public void save(ConfigQuery configQuery) {
        configQueryDAO.save(configQuery);
    }

    @Override
    //@Transactional
    public void saveAll(List<ConfigQuery> configQueryList) {
       /* for (ConfigQuery configQuery : configQueryList) {
            configQueryDAO.save(configQuery);//todo
        }*/
       configQueryDAO.saveAll(configQueryList);
    }

    @Override
    public void update(ConfigQuery configQuery) {
        configQueryDAO.update(configQuery);
    }

    @Override
    public ConfigQuery getConfigQuery(String metricId) {
        return configQueryDAO.get(metricId);
    }

    @Override
    public void delete(String metricId) {
        configQueryDAO.delete(metricId);
    }



    /*public ConfigQueryDAO getConfigQueryDao() {
        return configQueryDAO;
    }

    public void setConfigQueryDao(ConfigQueryDAO ConfigQueryDAO) {
        this.configQueryDAO = ConfigQueryDAO;
    }*/


}
