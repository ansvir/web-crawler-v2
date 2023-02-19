package org.example.crawler.model;

import org.example.crawler.feature.Feature;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Crawler {

    private final UUID id;
    private final Set<Feature> features;
    private final int threads;
    private final String root;
    private final int depth;

    public Crawler(int threads, String root, int depth, Set<Feature> features) {
        this.id = UUID.randomUUID();
        this.features = features;
        this.threads = threads;
        this.root = root;
        this.depth = depth;
    }

    private Crawler(UUID id, int threads, String root, int depth, Set<Feature> features) {
        this.id = id;
        this.features = features;
        this.threads = threads;
        this.root = root;
        this.depth = depth;
    }

    public UUID getId() {
        return id;
    }

    public Set<Feature> getFeatures() {
        return features;
    }

    public int getThreads() {
        return threads;
    }

    public String getRoot() {
        return root;
    }

    public int getDepth() {
        return depth;
    }

    public Crawler copy() {
        return new Crawler(this.id,
                this.threads,
                this.root,
                this.threads,
                this.features);
    }

}
