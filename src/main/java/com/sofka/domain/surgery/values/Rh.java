package com.sofka.domain.surgery.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Rh implements ValueObject<String> {

    private final String value;

    public Rh(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Rh cannot be blank");
        }
        if(this.value.length() < 2){
            throw new IllegalArgumentException("The VO Rh cannot have less than 2 letters");
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
        Rh rh = (Rh) o;
        return Objects.equals(value, rh.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
