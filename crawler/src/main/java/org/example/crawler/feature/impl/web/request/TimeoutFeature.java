package org.example.crawler.feature.impl.web.request;

import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.feature.Feature;
import org.example.crawler.feature.type.RetryType;
import org.example.crawler.model.CrawlRequest;
import org.example.crawler.model.tree.Node;
import org.jsoup.nodes.Document;

public class TimeoutFeature implements Feature<CrawlRequest> {

    private final RetryType retryType;

    public TimeoutFeature(RetryType retryType) {
        this.retryType = retryType;
    }

    @Override
    public WebReportBuilder process(Node<Document> node) {

    }

}
