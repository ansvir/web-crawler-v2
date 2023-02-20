package org.example.runner.impl;

import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.model.Crawler;
import org.example.crawler.model.tree.WebNode;
import org.example.runner.Runner;
import org.example.crawler.model.web.WebStateTree;
import org.example.runner.thread.CrawlerRunnable;
import org.example.runner.thread.TaskPool;

public class RunnerImpl implements Runner {

    private final Crawler<WebReportBuilder, WebNode> crawler;
    private final TaskPool crawlers;
    private final TaskPool documents;

    public RunnerImpl(Crawler<WebReportBuilder, WebNode> crawler) {
        this.crawlers = new TaskPool();
        this.documents = new TaskPool();
        this.crawler = crawler;
    }

    @Override
    public void run() {
        WebStateTree state = new WebStateTree(this.crawler.getRoot());
        for (int t = 0; t < crawler.getThreads(); t++) {
            this.crawlers.addTask(new CrawlerRunnable(this.crawler.copy(), state, documents));
        }
        for (int c = 0; c < this.crawlers.getTasks().size(); c++) {
            this.crawlers.getTasks().get(c).run();
        }
    }

}
