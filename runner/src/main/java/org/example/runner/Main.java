package org.example.runner;

import org.example.crawler.builder.crawler.WebCrawlerBuilder;
import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.model.Crawler;
import org.example.crawler.model.tree.WebNode;
import org.example.runner.impl.RunnerImpl;

public class Main {

    public static void main(String[] args) {
        Crawler<WebReportBuilder, WebNode> crawler = WebCrawlerBuilder.builder()
                .threads(10)
                .root(args[0])
                .depth(Integer.parseInt(args[1]))
                .build();
        Runner runner = new RunnerImpl(crawler);
        runner.run();
    }

}
