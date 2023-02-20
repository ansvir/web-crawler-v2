package org.example.runner.thread;

import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.model.Crawler;
import org.example.crawler.model.tree.Node;
import org.example.crawler.model.tree.WebNode;
import org.example.crawler.model.web.WebStateTree;
import org.jsoup.nodes.Document;


public class CrawlerRunnable implements Runnable {

    private final Crawler crawler;
    private final WebStateTree tree;
    private final TaskPool documents;
    private WebReportBuilder webReportBuilder;

    public CrawlerRunnable(Crawler crawler, WebStateTree tree, TaskPool documents) {
        this.crawler = crawler;
        this.tree = tree;
        this.documents = documents;
        this.webReportBuilder = WebReportBuilder.builder();
    }

    @Override
    public void run() {
        this.documents.getTasks().forEach(Runnable::run);
    }

    private int findMaxDepth(Node<Document> node) {
        return node.getChildren().stream()
                .findFirst()
                .map(this::findMaxDepth)
                .orElseGet(() -> ((WebNode) node).getDepth());
    }

}
