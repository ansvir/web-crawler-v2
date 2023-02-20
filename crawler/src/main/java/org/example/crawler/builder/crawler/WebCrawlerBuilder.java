package org.example.crawler.builder.crawler;

import org.example.crawler.builder.FeaturedBuilder;
import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.model.Crawler;
import org.example.crawler.model.tree.WebNode;

public class WebCrawlerBuilder extends FeaturedBuilder<WebReportBuilder, WebNode> {

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

    public Crawler<WebReportBuilder, WebNode> build() {
        return new Crawler<>(this.threads, this.root, this.depth, getFeatures());
    }

}
