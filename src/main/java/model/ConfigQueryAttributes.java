package model;

import javax.persistence.*;

/**
 * @author Tiwari Karishma (tiwarik@optymyze.com)
 */

@Entity
@Table(name = "CONFIG_QUERY_ATTRIBUTES")
public class ConfigQueryAttributes {
    @Id
    @Column(name = "CQA_QUERY_ID")
    private String metricAttrId;
    @Column(name = "CQA_QUERY_ATTRIBUTES")
    private String queryAttributes;
    @Column(name = "CQA_QUERY_ATT_DATATYPES")
    private String attributeDataType;

   /* @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="CQ_QUERY_ID")
    private ConfigQuery configQuery;*/

    public ConfigQueryAttributes() {
    }

    public ConfigQueryAttributes(String metricAttrId, String queryAttributes, String attributeDataType) {
        this.metricAttrId = metricAttrId;
        this.queryAttributes = queryAttributes;
        this.attributeDataType = attributeDataType;
        //this.configQuery = configQuery;
    }

    public String getMetricId() {
        return metricAttrId;
    }

    public void setMetricId(String metricId) {
        this.metricAttrId = metricId;
    }


    public String getMetricAttrId() {
        return metricAttrId;
    }

    public void setMetricAttrId(String metricIdAttr) {
        this.metricAttrId = metricIdAttr;
    }

    public String getQueryAttributes() {
        return queryAttributes;
    }

    public void setQueryAttributes(String queryAttributes) {
        this.queryAttributes = queryAttributes;
    }


    /*public ConfigQuery getConfigQuery() {
        return configQuery;
    }

    public void setConfigQuery(ConfigQuery configQuery) {
        this.configQuery = configQuery;
    }*/

    public String getAttributeDataType() {
        return attributeDataType;
    }

    public void setAttributeDataType(String attributeDataType) {
        this.attributeDataType = attributeDataType;
    }
}

