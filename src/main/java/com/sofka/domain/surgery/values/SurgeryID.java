package com.sofka.domain.surgery.values;


import co.com.sofka.domain.generic.Identity;

public class SurgeryID extends Identity {

    public SurgeryID() {

    }

    private SurgeryID(String id){
        super(id);
    }

    public static SurgeryID of(String id){
        return new SurgeryID(id);
    }

}
