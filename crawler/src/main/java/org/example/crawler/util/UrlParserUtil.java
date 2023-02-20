package org.example.crawler.util;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlParserUtil {

    public static URL parseUrl(String string) {
        try {
            return new URL(string);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Passed string cannot be converted to URL");
        }
    }

}
