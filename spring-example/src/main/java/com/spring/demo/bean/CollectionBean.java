package com.spring.demo.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * jh
 * 2019年05月17日  15：51
 */
public class CollectionBean {
    private List<String> demoList;
    private Set<String> demoSet;
    private Map<String,String> demoMap;
    private Properties properties ;


    public List<String> getDemoList() {
        return demoList;
    }

    public void setDemoList(List<String> demoList) {
        this.demoList = demoList;
    }

    public Set<String> getDemoSet() {
        return demoSet;
    }

    public void setDemoSet(Set<String> demoSet) {
        this.demoSet = demoSet;
    }

    public Map<String, String> getDemoMap() {
        return demoMap;
    }

    public void setDemoMap(Map<String, String> demoMap) {
        this.demoMap = demoMap;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}