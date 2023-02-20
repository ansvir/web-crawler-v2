package org.example.runner.validator.impl;

import org.example.runner.validator.Validator;

import java.util.function.Predicate;

public class IntegerValidator implements Validator {

    private final int underTest;
    private final Policy choosenPolicy;

    public IntegerValidator(int underTest, Policy policy) {
        this.underTest = underTest;
        this.choosenPolicy = policy;
    }

    @Override
    public boolean validate() {
        return this.choosenPolicy.condition().test(this.underTest);
    }

    public enum Policy {
        DEPTH(i -> i >= 0);

        private Predicate<Integer> predicate;

        Policy(Predicate<Integer> predicate) {
            this.predicate = predicate;
        }

        public Predicate<Integer> condition() {
            return predicate;
        }

    }

}
