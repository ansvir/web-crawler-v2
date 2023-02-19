package org.example.runner.thread;

import org.example.crawler.model.Crawler;

public class RunnerThread implements Runnable {

    private final Crawler crawler;

    public RunnerThread(Crawler crawler) {
        this.crawler = crawler;
    }

    @Override
    public void run() {

    }

}
