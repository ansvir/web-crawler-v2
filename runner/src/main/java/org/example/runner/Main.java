package org.example.runner;

import org.example.crawler.builder.crawler.CrawlRequestBuilder;
import org.example.crawler.builder.document.WebDocumentBuilder;
import org.example.crawler.model.Crawler;
import org.example.crawler.model.tree.WebNode;
import org.example.runner.thread.CrawlRunnable;

public class Main {

    public static void main(String[] args) {
        Crawler crawler = CrawlRequestBuilder.builder()
                .threads(10)
                .root(args[0])
                .depth(Integer.parseInt(args[1]))
                .build();
        CrawlRunnable crawling = new CrawlRunnable(crawler);
        crawling.run();
    }

}
