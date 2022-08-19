package com.sofka.domain.surgery.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class YearsOfResidency implements ValueObject<Integer> {

    private final Integer value;

    public YearsOfResidency(Integer value) {
        this.value = Objects.requireNonNull(value);
    }

    @Override
    public Integer value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YearsOfResidency yearsOfResidency = (YearsOfResidency) o;
        return Objects.equals(value, yearsOfResidency.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
