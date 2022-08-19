package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.Identity;

public class OperatingRoomID extends Identity {

    public OperatingRoomID() {

    }

    private OperatingRoomID(String id){
        super(id);
    }

    public static OperatingRoomID of(String id){
        return new OperatingRoomID(id);
    }

}
