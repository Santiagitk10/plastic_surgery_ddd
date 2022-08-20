package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Location implements ValueObject<String> {

    private final String value;

    public Location(String value) {
        this.value = Objects.requireNonNull(value);
        if(this.value.isBlank()){
            throw new IllegalArgumentException("The VO Location cannot be blank");
        }
        if(this.value.length() < 5){
            throw new IllegalArgumentException("The VO Location cannot have less than 5 letters");
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
        Location location = (Location) o;
        return Objects.equals(value, location.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
