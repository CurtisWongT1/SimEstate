package com.mycompany.simestate;

public class Townhouse extends ResidentialBuilding {
    private double backyardSize;

    public Townhouse(String address, String id, int numUnits, int numBathrooms, int numBedrooms, double price, int parkingSpaces,
                 int numFloors, double surfaceArea, double backyardSize) {
        super(address, id, 1, numBathrooms, numBedrooms, price, parkingSpaces, numFloors, surfaceArea);
        this.backyardSize = backyardSize;
    }
    
    public double getBackyardSize() {
        return backyardSize;
    }

    public void setBackyardSize(double backyardSize) {
        this.backyardSize = backyardSize;
    }
}
