package dev.filipe.domain.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class News {

    private String icon;
    private String description;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
