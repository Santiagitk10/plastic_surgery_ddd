package com.sofka.domain.surgery.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Allergy implements ValueObject<String> {

    private final String value;

    public Allergy(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Allergy cannot be blank");
        }
        if(this.value.length() < 5){
            throw new IllegalArgumentException("The VO Allergy cannot have less than 5 letters");
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
        Allergy allergy = (Allergy) o;
        return Objects.equals(value, allergy.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
