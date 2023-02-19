package org.example.runner.impl;

import org.example.crawler.builder.impl.WebCrawlerBuilder;
import org.example.crawler.model.Crawler;
import org.example.runner.Runner;
import org.example.runner.thread.RunnerThread;

public class RunnerImpl implements Runner  {

    private final Crawler crawler;

    public RunnerImpl(Crawler crawler) {
        this.crawler = crawler;
    }

    @Override
    public void run() {
        for (int t = 0; t < crawler.getThreads(); t++) {
            RunnerThread thread = new RunnerThread(this.crawler.copy());
            thread.run();
        }
    }

}
