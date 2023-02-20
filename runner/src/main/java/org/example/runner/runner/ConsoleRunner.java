package org.example.runner.runner;

import org.example.crawler.builder.crawler.CrawlRequestBuilder;
import org.example.crawler.model.Crawler;
import org.example.runner.exception.ValidationException;
import org.example.runner.thread.CrawlRunnable;
import org.example.runner.validator.Validator;
import org.example.runner.validator.ValidatorFactory;

public class ConsoleRunner implements Runner {

    private final String root;
    private final int depth;

    public ConsoleRunner(String root, int depth) {
        ValidatorFactory validators = new ValidatorFactory(root, depth);
        if (validators.testBatch()) {
            this.root = root;
            this.depth = depth;
        } else {
            throw new ValidationException("Some of the values are invalid");
        }
    }

    @Override
    public void startCrawling() {
        Crawler crawler = CrawlRequestBuilder.builder()
                .threads(10)
                .root(this.root)
                .depth(this.depth)
                .build();
        CrawlRunnable crawling = new CrawlRunnable(crawler);
        crawling.run();
    }

}
