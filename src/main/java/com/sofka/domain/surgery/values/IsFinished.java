package com.sofka.domain.surgery.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class IsFinished implements ValueObject<Boolean> {

    private final Boolean value;

    public IsFinished(Boolean value) {
        this.value = value;
    }


    @Override
    public Boolean value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IsFinished isFinished = (IsFinished) o;
        return Objects.equals(value, isFinished.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
