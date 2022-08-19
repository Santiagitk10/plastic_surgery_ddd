package com.sofka.domain.shared.values;

import co.com.sofka.domain.generic.ValueObject;
import com.sofka.domain.surgery.values.ShiftE;

public class Anesthesia implements ValueObject<AnesthesiaE> {

    private final AnesthesiaE value;

    public Anesthesia(AnesthesiaE value) {
        this.value = value;
    }

    @Override
    public AnesthesiaE value() {
        return value;
    }

}
