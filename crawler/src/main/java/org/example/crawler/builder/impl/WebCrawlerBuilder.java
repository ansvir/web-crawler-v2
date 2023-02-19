package org.example.crawler.builder.impl;

import org.example.crawler.feature.impl.OutputFeature;
import org.example.crawler.feature.impl.ThreadFeature;
import org.example.crawler.feature.impl.web.DepthFeature;
import org.example.crawler.feature.impl.web.RootFeature;
import org.example.crawler.feature.type.OutputType;
import org.example.crawler.model.Crawler;

public class WebCrawlerBuilder extends CrawlerBuilder {

    private int threads;
    private String root;
    private int depth;

    private WebCrawlerBuilder() {
    }

    public static WebCrawlerBuilder builder() {
        return new WebCrawlerBuilder();
    }

    public WebCrawlerBuilder threads(int threads) {
        this.threads = threads;
        return this;
    }

    public WebCrawlerBuilder root(String root) {
        this.root = root;
        return this;
    }

    public WebCrawlerBuilder depth(int depth) {
        this.depth = depth;
        return this;
    }

    public WebCrawlerBuilder output(OutputType outputType) {
        this.addFeature(new OutputFeature(outputType));
        return this;
    }

    @Override
    public Crawler build() {
        return new Crawler(this.threads, this.root, this.depth, getFeatures());
    }

}
