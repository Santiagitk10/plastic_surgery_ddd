package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Status implements ValueObject<StatusE> {

    private final StatusE value;

    public Status(StatusE value) {
        this.value = value;
    }

    @Override
    public StatusE value() {
        return value;
    }

}
