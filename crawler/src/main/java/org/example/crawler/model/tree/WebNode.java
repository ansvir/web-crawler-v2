package org.example.crawler.model.tree;

import org.jsoup.nodes.Document;

import java.util.Set;

public class WebNode extends Node<Document> {

    private String url;
    private int depth;

    public WebNode(String url, int depth, Document element, Node<Document> parent, Set<Node<Document>> children) {
        super(element, parent, children);
        this.url = url;
        this.depth = depth;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

}
