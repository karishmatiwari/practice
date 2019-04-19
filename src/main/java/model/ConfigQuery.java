package model;

import javax.persistence.*;
import java.util.List;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */


@Entity
@Table(name = "CONFIG_QUERIES")
public class ConfigQuery {

    @Id
    @Column(name = "CQ_QUERY_ID")
    private String metricId;
    @Lob
    @Column(name = "CQ_QUERY")
    private String query; //clob db
    @Column(name = "CQ_FREQUENCY")
    private String frequency;
    @Column(name = "CQ_STATUS")
    private String status;
    @Column(name = "CQ_OPTYMYZE_VERSION")
    private String optymyzeVersion;
    @Column(name = "CQ_INSERT_DATE")
    private String insertDate;
    @Column(name = "CQ_UPDATE_DATE")
    private String updateDate;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name="CQA_QUERY_ID")
    List<ConfigQueryAttributes> configQueryAttributes;

    public String getOptymyzeVersion() {
        return optymyzeVersion;
    }

    public void setOptymyzeVersion(String optymyzeVersion) {
        this.optymyzeVersion = optymyzeVersion;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    public String getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    public List<ConfigQueryAttributes> getConfigQueryAttributes() {
        return configQueryAttributes;
    }

    public void setConfigQueryAttributes(List<ConfigQueryAttributes> configQueryAttributes) {
        this.configQueryAttributes = configQueryAttributes;
    }

    public ConfigQuery(String metricId, String query, String frequency, String status, String optymyzeVersion, String insertDate, String updateDate, List<ConfigQueryAttributes> configQueryAttributes) {
        this.metricId = metricId;
        this.query = query;
        this.frequency = frequency;
        this.status = status;
        this.optymyzeVersion = optymyzeVersion;
        this.insertDate = insertDate;
        this.updateDate = updateDate;
        this.configQueryAttributes = configQueryAttributes;
    }

    public ConfigQuery() {
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMetricId() {
        return metricId;
    }

    public void setMetricId(String metricId) {
        this.metricId = metricId;
    }

    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

}

