package org.example.runner.validator;

import org.example.runner.validator.impl.IntegerValidator;
import org.example.runner.validator.impl.UrlValidator;

/**
 * Factory for all validators.
 * Used to test batch of data in one place as provides
 * constructor with parameters according all validators
 * inputs.
 *
 * @since 1.0-SNAPSHOT
 */
public class ValidatorFactory {

    private final Validator urlValidator;
    private final Validator inetegrValidator;

    public ValidatorFactory(String url, int depth) {
        this.urlValidator = new UrlValidator(url);
        this.inetegrValidator = new IntegerValidator(depth, IntegerValidator.Policy.DEPTH);
    }

    /**
     * Batch validation
     *
     * @return result of all existing validators test
     * @since 1.0-SNAPSHOT
     */
    public boolean testBatch() {
        return this.urlValidator.validate()
                && this.inetegrValidator.validate();
    }

}
