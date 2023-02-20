package org.example.crawler.model;

import org.example.crawler.feature.Feature;
import org.jsoup.nodes.Document;

import java.util.Set;
import java.util.UUID;

public class Crawler<T, R> extends Identifiable {

    private final Set<Feature<T, R>> features;
    private final int threads;
    private final String root;
    private final int depth;

    public Crawler(int threads, String root, int depth, Set<Feature<T, R>> features) {
        this.features = features;
        this.threads = threads;
        this.root = root;
        this.depth = depth;
    }

    private Crawler(UUID id, int threads, String root, int depth, Set<Feature<T, R>> features) {
        super(id);
        this.features = features;
        this.threads = threads;
        this.root = root;
        this.depth = depth;
    }

    public Set<Feature<T, R>> getFeatures() {
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

    public Crawler<T ,R> copy() {
        return new Crawler<>(getId(),
                this.threads,
                this.root,
                this.threads,
                this.features);
    }

}
