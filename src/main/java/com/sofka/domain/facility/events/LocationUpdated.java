package com.sofka.domain.facility.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.domain.facility.values.Location;

public class LocationUpdated extends DomainEvent {

    private final Location location;

    public LocationUpdated(Location location) {
        super("sofka.domain.facility.LocationUpdated");
        this.location = location;
    }


    public Location getLocation() {
        return location;
    }
}
