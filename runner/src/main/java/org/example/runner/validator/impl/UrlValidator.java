package org.example.runner.validator.impl;

import org.example.runner.exception.ValidationException;
import org.example.runner.validator.Validator;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlValidator implements Validator {

    private String url;

    public UrlValidator(String url) {
        this.url = url;
    }

    @Override
    public boolean validate() {
        try {
            URL parsed = new URL(this.url);
            return true;
        } catch (MalformedURLException e) {
            throw new ValidationException("Not valid URL");
        }
    }
}
