package com.sofka.domain.facility.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.domain.facility.values.FacilityID;
import com.sofka.domain.facility.values.Location;


public class UpdateLocation extends Command {

    private final FacilityID facilityID;
    private final Location location;

    public UpdateLocation(FacilityID facilityID, Location location) {
        this.facilityID = facilityID;
        this.location = location;
    }

    public FacilityID getFacilityID() {
        return facilityID;
    }

    public Location getLocation() {
        return location;
    }
}
