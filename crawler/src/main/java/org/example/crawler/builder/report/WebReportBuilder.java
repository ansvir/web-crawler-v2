package org.example.crawler.builder.report;

import org.example.crawler.model.web.WebReport;

public class WebReportBuilder {

    private String parsedUrl;
    private String nextUrl;
    private float rank;
    private boolean continueCrawling;
    private long nextTimeout;

    private WebReportBuilder() {
    }

    public static WebReportBuilder builder() {
        return new WebReportBuilder();
    }


    public WebReportBuilder parsedUrl(String url) {
        this.parsedUrl = parsedUrl;
        return this;
    }

    public WebReportBuilder nextUrl(String nextUrl) {
        this.nextUrl = nextUrl;
        return this;
    }

    public WebReportBuilder rank(float rank) {
        this.rank = rank;
        return this;
    }

    public WebReportBuilder continueCrawling(boolean continueCrawling) {
        this.continueCrawling = continueCrawling;
        return this;
    }

    public WebReportBuilder nextTimeout(long nextTimeout) {
        this.nextTimeout = nextTimeout;
        return this;
    }

    public WebReport build() {
        return new WebReport(this.parsedUrl, this.nextUrl, this.rank,
                this.continueCrawling, this.nextTimeout);
    }

}
