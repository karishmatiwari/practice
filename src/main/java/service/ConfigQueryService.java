package service;

import model.ConfigQuery;

import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */
public interface ConfigQueryService {

    void save(ConfigQuery configQuery);

    void saveAll(List<ConfigQuery> configQueryList);

    void update(ConfigQuery configQuery);


    ConfigQuery getConfigQuery(String metricId);

    //List<ConfigQueryAttributes> getAllConfigQueryAttributes();

    void delete(String metricId);

}
