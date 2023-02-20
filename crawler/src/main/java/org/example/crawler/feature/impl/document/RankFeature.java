package org.example.crawler.feature.impl.document;

import org.example.crawler.builder.report.WebReportBuilder;
import org.example.crawler.model.tree.WebNode;
import org.example.crawler.util.UrlParserUtil;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class RankFeature implements DocumentFeature {

    @Override
    public WebReportBuilder process(WebNode node) {
        Document doc = node.getElement();
        Element body = doc.body();
        URL sourceUrl = UrlParserUtil.parseUrl(node.getUrl());
        int totalEqualUrls = 0;
        List<String> urls = new ArrayList<>();
        writeUrls(body, urls);
        for (String s : urls) {
            URL url = UrlParserUtil.parseUrl(s);
            if (url.getHost().equals(sourceUrl.getHost())) {
                totalEqualUrls++;
            }
        }
        float rank;
        if (totalEqualUrls == 0) {
            rank = 0.0f;
        } else {
            rank = ((float) totalEqualUrls) / ((float) urls.size());
        }
        return WebReportBuilder.builder().rank(rank);
    }

    private void writeUrls(Element element, List<String> urls) {
        if (element.is("a")) {
            if (urls == null) {
                urls = new ArrayList<>();
            }
            urls.add(element.attr("href"));
        }
        Elements els = element.getAllElements();
        for (Element el : els) {
            writeUrls(el, urls);
        }
    }

}
