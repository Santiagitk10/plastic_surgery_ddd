package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.Identity;

public class InstrumentationID extends Identity {

    public InstrumentationID() {

    }

    private InstrumentationID(String id){
        super(id);
    }

    public static InstrumentationID of(String id){
        return new InstrumentationID(id);
    }

}
