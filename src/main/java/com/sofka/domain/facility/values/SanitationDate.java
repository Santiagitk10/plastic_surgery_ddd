package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SanitationDate implements ValueObject<String> {

    private final String value;

    public SanitationDate(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO SanitationDate cannot be blank");
        }
    }


    @Override
    public String value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SanitationDate sanitationDate = (SanitationDate) o;
        return Objects.equals(value, sanitationDate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
