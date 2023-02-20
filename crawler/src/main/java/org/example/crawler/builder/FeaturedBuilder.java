package org.example.crawler.builder;

import org.example.crawler.feature.Feature;

import java.util.HashSet;
import java.util.Set;

public abstract class FeaturedBuilder<T, R, F extends Feature<T, R>> {

    private final Set<F> features;

    public FeaturedBuilder() {
        this.features = new HashSet<>();
    }

    protected void addFeature(F feature) {
        this.features.add(feature);
    }

    protected Set<F> getFeatures() {
        return features;
    }

}
