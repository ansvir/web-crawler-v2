package org.example.crawler.feature.impl;

import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.feature.Feature;
import org.example.crawler.feature.type.OutputType;
import org.example.crawler.model.tree.Node;
import org.example.crawler.model.web.WebReport;
import org.jsoup.nodes.Document;

public class OutputFeature implements Feature<String, WebReport> {

    private final OutputType outputType;

    public OutputFeature(OutputType outputType) {
        this.outputType = outputType;
    }

    @Override
    public String process(WebReport report) {

    }
}
