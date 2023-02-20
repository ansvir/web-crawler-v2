package org.example.crawler.feature;

public interface Feature<T, R> {

    T process(R input);

}
