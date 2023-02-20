package org.example.runner.thread;

import org.example.crawler.model.Crawler;
import org.example.crawler.model.web.WebStateTree;

public class CrawlRunnable implements Runnable {

    private final Crawler crawler;
    private final TaskPool crawlers;
    private final TaskPool documents;

    public CrawlRunnable(Crawler crawler) {
        this.crawlers = new TaskPool();
        this.documents = new TaskPool();
        this.crawler = crawler;
    }

    @Override
    public void run() {
        WebStateTree state = new WebStateTree(this.crawler.getRoot());
        this.documents.addTask(new DocumentRunnable(state.getTree(), this.crawler.copy()));
        for (int t = 0; t < crawler.getThreads(); t++) {
            this.crawlers.addTask(new CrawlRequestRunnable(this.crawler.copy(), state, documents));
        }
        for (int c = 0; c < this.crawlers.getTasks().size(); c++) {
            this.crawlers.getTasks().get(c).run();
        }
    }

}
