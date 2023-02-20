package org.example.crawler.model;

import org.example.crawler.feature.Feature;
import org.example.crawler.feature.impl.crawl.CrawlFeature;
import org.example.crawler.feature.impl.document.DocumentFeature;
import org.example.crawler.feature.impl.request.CrawlRequestFeature;

import java.util.Set;
import java.util.UUID;

/**
 * Common configuration class that serve as a transition of crawling
 * properties to each level - {@link CrawlRequestFeature}, {@link DocumentFeature}, {@link CrawlFeature}.
 *
 * @see Feature
 * @since 1.0-SNAPSHOT
 */
public class Crawler extends Identifiable {

    private final Set<CrawlRequestFeature> features;
    private final int threads;
    private final String root;
    private final int depth;

    public Crawler(int threads, String root, int depth, Set<CrawlRequestFeature> features) {
        this.features = features;
        this.threads = threads;
        this.root = root;
        this.depth = depth;
    }

    private Crawler(UUID id, int threads, String root, int depth, Set<CrawlRequestFeature> features) {
        super(id);
        this.features = features;
        this.threads = threads;
        this.root = root;
        this.depth = depth;
    }

    public Set<CrawlRequestFeature> getFeatures() {
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
        return new Crawler(getId(),
                this.threads,
                this.root,
                this.threads,
                this.features);
    }

}
