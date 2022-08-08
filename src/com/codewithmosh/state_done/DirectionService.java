package com.codewithmosh.state_done;

import com.codewithmosh.state_done.travelmodes.TravelMode;

public class DirectionService {
    private TravelMode travelMode;

    DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getEta() {
        return this.travelMode.getEta();
    }

    public Object getDirection() {
        return this.travelMode.getDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
