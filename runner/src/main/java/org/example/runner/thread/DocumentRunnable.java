package org.example.runner.thread;

import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.model.Crawler;
import org.example.crawler.model.tree.Node;
import org.example.crawler.model.tree.WebNode;
import org.jsoup.nodes.Document;

public class DocumentRunnable implements Runnable {

    private final WebNode node;
    private final Crawler crawler;

    public DocumentRunnable(WebNode node, Crawler crawler) {
        this.node = node;
        this.crawler = crawler;
    }

    @Override
    public void run() {
        WebReportBuilder builder = WebReportBuilder.builder();
        this.crawler.getFeatures()
                .forEach(f -> {
                });
    }

}
