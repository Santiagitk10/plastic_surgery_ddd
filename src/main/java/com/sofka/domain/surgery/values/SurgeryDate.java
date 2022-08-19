package com.sofka.domain.surgery.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class SurgeryDate implements ValueObject<String> {

    private final String value;

    public SurgeryDate(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO SurgeryDate cannot be blank");
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
        SurgeryDate surgeryDate = (SurgeryDate) o;
        return Objects.equals(value, surgeryDate.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
