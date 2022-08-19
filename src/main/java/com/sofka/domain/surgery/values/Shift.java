package com.sofka.domain.surgery.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.domain.facility.values.StatusE;

public class Shift implements ValueObject<ShiftE> {

    private final ShiftE value;

    public Shift(ShiftE value) {
        this.value = value;
    }

    @Override
    public ShiftE value() {
        return value;
    }

}
