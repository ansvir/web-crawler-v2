package org.example.crawler.feature.impl;

import org.example.crawler.feature.Feature;
import org.example.crawler.feature.type.OutputType;

public class OutputFeature implements Feature {

    private final OutputType outputType;

    public OutputFeature(OutputType outputType) {
        this.outputType = outputType;
    }

    @Override
    public void process() {

    }
}
