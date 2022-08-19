package com.sofka.domain.surgery.values;

import co.com.sofka.domain.generic.Identity;

public class NurseID extends Identity {

    public NurseID() {

    }

    private NurseID(String id){
        super(id);
    }

    public static NurseID of(String id){
        return new NurseID(id);
    }

}
