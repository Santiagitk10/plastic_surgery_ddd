package com.sofka.domain.facility.values;

import co.com.sofka.domain.generic.Identity;

public class RecoveryAreaID extends Identity {

    public RecoveryAreaID() {

    }

    private RecoveryAreaID(String id){
        super(id);
    }

    public static RecoveryAreaID of(String id){
        return new RecoveryAreaID(id);
    }

}
