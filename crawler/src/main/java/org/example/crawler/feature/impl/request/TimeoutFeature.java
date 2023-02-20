package org.example.crawler.feature.impl.request;

import org.example.crawler.feature.type.RetryType;
import org.example.crawler.model.CrawlRequest;
import org.example.crawler.model.CrawlResponse;

public class TimeoutFeature implements CrawlRequestFeature {

    private final RetryType retryType;

    public TimeoutFeature(RetryType retryType) {
        this.retryType = retryType;
    }

    @Override
    public CrawlResponse process(CrawlRequest input) {
        return null;
    }

}
