package org.example.runner.thread;

import org.example.crawler.builder.document.WebDocumentBuilder;
import org.example.crawler.model.Crawler;
import org.example.crawler.model.tree.WebNode;
import org.example.runner.model.Task;

public class DocumentRunnable extends Task {

    private final WebNode node;
    private final Crawler crawler;

    public DocumentRunnable(WebNode node, Crawler crawler) {
        super(() -> {
            WebDocumentBuilder builder = WebDocumentBuilder.builder();
            crawler.getFeatures()
                    .forEach(f -> {
                    });
        });
        this.node = node;
        this.crawler = crawler;
    }

}
