package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.Identity;

public class FacilityID extends Identity {

    public FacilityID() {

    }

    private FacilityID(String id){
        super(id);
    }

    public static FacilityID of(String id){
        return new FacilityID(id);
    }

}
