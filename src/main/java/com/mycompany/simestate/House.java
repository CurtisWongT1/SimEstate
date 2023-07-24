package com.mycompany.simestate;

public class House extends ResidentialBuilding {
    private double backyardSize;

    public House(String address, String id, double backyardSize, int numBathrooms, int numBedrooms, double price, int parkingSpaces, int numFloors, double surfaceArea) {   
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