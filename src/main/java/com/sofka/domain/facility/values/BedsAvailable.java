package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class BedsAvailable implements ValueObject<Integer> {

    private final Integer value;

    public BedsAvailable(Integer value) {
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
        BedsAvailable bedsAvailable = (BedsAvailable) o;
        return Objects.equals(value, bedsAvailable.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
