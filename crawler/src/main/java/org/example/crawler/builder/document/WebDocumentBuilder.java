package org.example.crawler.builder.document;

import org.example.crawler.builder.FeaturedBuilder;
import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.feature.impl.document.DocumentFeature;
import org.example.crawler.model.tree.WebNode;
import org.example.crawler.model.web.WebReport;

public class WebDocumentBuilder extends FeaturedBuilder<WebReportBuilder, WebNode, DocumentFeature> {

    private String parsedUrl;
    private String nextUrl;
    private float rank;
    private boolean continueCrawling;
    private long nextTimeout;

    private WebDocumentBuilder() {
    }

    public static WebDocumentBuilder builder() {
        return new WebDocumentBuilder();
    }


    public WebDocumentBuilder parsedUrl(String url) {
        this.parsedUrl = parsedUrl;
        return this;
    }

    public WebDocumentBuilder nextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
        return this;
    }

    public WebDocumentBuilder rank(float rank) {
        this.rank = rank;
        return this;
    }

    public WebDocumentBuilder continueCrawling(boolean continueCrawling) {
        this.continueCrawling = continueCrawling;
        return this;
    }

    public WebDocumentBuilder nextTimeout(long nextTimeout) {
        this.nextTimeout = nextTimeout;
        return this;
    }

    public WebReport build() {
        return new WebReport(this.parsedUrl, this.nextUrl, this.rank,
                this.continueCrawling, this.nextTimeout);
    }

}
