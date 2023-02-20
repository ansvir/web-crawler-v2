package org.example.crawler.feature.impl.web.request;

import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.feature.Feature;
import org.example.crawler.model.tree.Node;
import org.jsoup.nodes.Document;

public class CachingFeature implements Feature<Document> {

    @Override
    public WebReportBuilder process(Node<Document> node) {

    }

}
