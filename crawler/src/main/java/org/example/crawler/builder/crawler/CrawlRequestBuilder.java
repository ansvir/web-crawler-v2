package org.example.crawler.builder.crawler;

import org.example.crawler.builder.FeaturedBuilder;
import org.example.crawler.feature.impl.request.CrawlRequestFeature;
import org.example.crawler.model.CrawlRequest;
import org.example.crawler.model.CrawlResponse;
import org.example.crawler.model.Crawler;

public class CrawlRequestBuilder extends FeaturedBuilder<CrawlResponse, CrawlRequest, CrawlRequestFeature> {

    private int threads;
    private String root;
    private int depth;

    private CrawlRequestBuilder() {
    }

    public static CrawlRequestBuilder builder() {
        return new CrawlRequestBuilder();
    }

    public CrawlRequestBuilder threads(int threads) {
        this.threads = threads;
        return this;
    }

    public CrawlRequestBuilder root(String root) {
        this.root = root;
        return this;
    }

    public CrawlRequestBuilder depth(int depth) {
        this.depth = depth;
        return this;
    }

    public Crawler build() {
        return new Crawler(this.threads, this.root, this.depth, getFeatures());
    }

}
