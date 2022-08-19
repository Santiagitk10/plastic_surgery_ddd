package com.sofka.domain.surgery.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class ReasonForSurgery implements ValueObject<String> {

    private final String value;

    public ReasonForSurgery(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO ReasonForSurgery cannot be blank");
        }
        if(this.value.length() < 10){
            throw new IllegalArgumentException("The VO ReasonForSurgery cannot have less than 20 letters");
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
        ReasonForSurgery reasonForSurgery = (ReasonForSurgery) o;
        return Objects.equals(value, reasonForSurgery.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
