package org.example.runner.thread;

import org.example.crawler.builder.document.WebDocumentBuilder;
import org.example.crawler.model.Crawler;
import org.example.crawler.model.tree.Node;
import org.example.crawler.model.tree.WebNode;
import org.example.crawler.model.web.WebStateTree;
import org.example.runner.model.Task;
import org.jsoup.nodes.Document;


public class CrawlRequestRunnable extends Task {

    private final Crawler crawler;
    private final WebStateTree tree;
    private final TaskPool documents;
    private WebDocumentBuilder webDocumentBuilder;

    public CrawlRequestRunnable(Crawler crawler, WebStateTree tree, TaskPool documents) {
        super(() -> documents.getTasks().forEach(t -> {
            documents.removeTask(t);
            t.run();
        }));
        this.crawler = crawler;
        this.tree = tree;
        this.documents = documents;
        this.webDocumentBuilder = WebDocumentBuilder.builder();
    }

    private int findMaxDepth(Node<Document> node) {
        return node.getChildren().stream()
                .findFirst()
                .map(this::findMaxDepth)
                .orElseGet(() -> ((WebNode) node).getDepth());
    }

}
