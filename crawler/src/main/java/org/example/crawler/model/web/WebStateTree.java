package org.example.crawler.model.web;

import org.example.crawler.model.Identifiable;
import org.example.crawler.model.tree.Node;
import org.example.crawler.model.tree.WebNode;
import org.jsoup.nodes.Document;

import java.util.HashSet;

/**
 * Tree of parsed documents
 *
 * @since 1.0-SNAPSHOT
 */
public class WebStateTree extends Identifiable {

    private WebNode tree;

    public WebStateTree(String root) {
        this.tree = new WebNode(root, 1, null,
                null, new HashSet<>());
    }

    public WebNode getTree() {
        return tree;
    }

    public void setTree(WebNode tree) {
        this.tree = tree;
    }

}
