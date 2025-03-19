package dev.filipe.domain.model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Card {

    private String number;
    private String limit;
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
