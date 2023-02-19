package org.example.runner;

import org.example.crawler.builder.impl.WebCrawlerBuilder;
import org.example.crawler.model.Crawler;
import org.example.runner.impl.RunnerImpl;

public class Main {

    public static void main(String[] args) {
        Crawler crawler = WebCrawlerBuilder.builder()
                .threads(10)
                .root(args[0])
                .depth(Integer.parseInt(args[1]))
                .build();
        Runner runner = new RunnerImpl(crawler);
        runner.run();
    }

}
