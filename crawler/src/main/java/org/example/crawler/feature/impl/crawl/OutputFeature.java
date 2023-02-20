package org.example.crawler.feature.impl.crawl;

import org.example.crawler.feature.type.OutputType;
import org.example.crawler.model.CrawlInput;
import org.example.crawler.model.CrawlOutput;

public class OutputFeature implements CrawlFeature {

    private final OutputType outputType;

    public OutputFeature(OutputType outputType) {
        this.outputType = outputType;
    }

    @Override
    public CrawlInput process(CrawlOutput input) {
        return null;
    }
}
