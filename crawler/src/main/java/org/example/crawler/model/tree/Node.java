package org.example.crawler.model.tree;

import java.util.Set;

public abstract class Node<T> {

    private T element;
    private Node<T> parent;
    private Set<Node<T>> children;

    public Node(T element, Node<T> parent, Set<Node<T>> children) {
        this.element = element;
        this.parent = parent;
        this.children = children;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getParent() {
        return parent;
    }

    public void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public Set<Node<T>> getChildren() {
        return children;
    }

    public void setChildren(Set<Node<T>> children) {
        this.children = children;
    }
}
