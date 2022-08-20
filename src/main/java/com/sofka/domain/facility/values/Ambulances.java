package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Ambulances implements ValueObject<Integer> {

    private final Integer value;

    public Ambulances(Integer value) {
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
        Ambulances ambulances = (Ambulances) o;
        return Objects.equals(value, ambulances.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

}
