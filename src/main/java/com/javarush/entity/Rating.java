package com.javarush.entity;

import static java.util.Objects.isNull;

public enum Rating {
    G("G"),
    PG("PG"),
    PG13("PG13"),
    R("R"),
    NC17("NC17");
    private final String value;

    Rating(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    public static Feature getFeatureByValue(String value) {
        if (isNull(value) || value.isEmpty()) {
            return null;
        }
        Feature[] features = Feature.values();
        for (Feature feature : features) {
            if (feature.values().equals(value)) {
                return  feature;
            }
        }
        return null;
    }
}
