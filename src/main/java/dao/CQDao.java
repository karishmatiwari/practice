package dao;

import model.ConfigQuery;

import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */
public interface CQDao {

    void save(ConfigQuery configQuery);

    void saveAll(List<ConfigQuery> configQueryList);

    void update(ConfigQuery configQuery);

    void delete(String metricId);

    ConfigQuery get(String metricId);

    List<ConfigQuery> getAll();

}
