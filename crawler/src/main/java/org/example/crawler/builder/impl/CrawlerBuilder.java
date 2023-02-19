package org.example.crawler.builder.impl;

import org.example.crawler.builder.Builder;
import org.example.crawler.feature.Feature;

import java.util.HashSet;
import java.util.Set;

public abstract class CrawlerBuilder implements Builder {

    private final Set<Feature> features;

    public CrawlerBuilder() {
        this.features = new HashSet<>();
    }

    protected void addFeature(Feature feature) {
        this.features.add(feature);
    }

    protected Set<Feature> getFeatures() {
        return features;
    }

}
