package org.example.crawler.model.web;

import org.example.crawler.feature.Feature;
import org.example.crawler.feature.impl.crawl.CrawlFeature;
import org.example.crawler.feature.impl.document.DocumentFeature;

/** The result of middle processing step - processing {@link DocumentFeature}s
 * Contains all necessary data to prepare for last step - processing of {@link CrawlFeature}s
 * over ready documents
 *
 * @see Feature
 * @since 1.0-SNAPSHOT
 */
public class WebReport {

    private final String parsedUrl;
    private final String nextUrl;
    private final float rank;
    private final boolean continueCrawling;
    private final long nextTimeout;

    public WebReport(String parsedUrl, String nextUrl, float rank,
             boolean continueCrawling, long nextTimeout) {
        this.parsedUrl = parsedUrl;
        this.nextUrl = nextUrl;
        this.rank = rank;
        this.continueCrawling = continueCrawling;
        this.nextTimeout = nextTimeout;
    }

    public String getParsedUrl() {
        return parsedUrl;
    }

    public String getNextUrl() {
        return nextUrl;
    }

    public float getRank() {
        return rank;
    }

    public boolean isContinueCrawling() {
        return continueCrawling;
    }

    public long getNextTimeout() {
        return nextTimeout;
    }
}
