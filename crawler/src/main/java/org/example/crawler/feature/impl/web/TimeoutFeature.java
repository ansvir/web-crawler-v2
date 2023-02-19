package org.example.crawler.feature.impl.web;

import org.example.crawler.feature.Feature;
import org.example.crawler.feature.type.RetryType;

public class TimeoutFeature implements Feature {

    private final RetryType retryType;

    public TimeoutFeature(RetryType retryType) {
        this.retryType = retryType;
    }

    @Override
    public void process() {

    }

}
