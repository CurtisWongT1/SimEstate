package com.mycompany.simestate;

public class SubwayStation extends Place { 
  private int busyRating;

    public SubwayStation(String address, String id, String name, int busyRating) {
        super(address, id, name);

        this.busyRating = busyRating;
    }

    
    public int getBusyRating() {
        return busyRating;
    }

    public void setBusyRating(int busyRating) {
        this.busyRating = busyRating;
    }
}

