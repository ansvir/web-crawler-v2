package org.example.crawler.builder;

import org.example.crawler.feature.Feature;

import java.util.HashSet;
import java.util.Set;

public abstract class FeaturedBuilder<T ,R> {

    private final Set<Feature<T, R>> features;

    public FeaturedBuilder() {
        this.features = new HashSet<>();
    }

    protected void addFeature(Feature<T, R> feature) {
        this.features.add(feature);
    }

    protected Set<Feature<T ,R>> getFeatures() {
        return features;
    }

}
