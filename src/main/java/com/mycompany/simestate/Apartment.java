package com.mycompany.simestate;

public class Apartment extends ResidentialBuilding {
    private boolean hasPool;
    private boolean hasGym;
    private boolean hasTennisCourt;

    public Apartment(String address, String id, int numUnits, int numBathrooms, int numBedrooms, double price, int parkingSpaces,
                 int numFloors, double surfaceArea, boolean hasPool, boolean hasGym, boolean hasTennisCourt) {
        super(address, id, 1, numBathrooms, numBedrooms, price, parkingSpaces, numFloors, surfaceArea);
        
        this.hasPool = hasPool;
        this.hasGym = hasGym;
        this.hasTennisCourt = hasTennisCourt;
    }

    public boolean getHasGym() {
        return hasGym;
    }

    public void setHasGym(boolean hasGym) {
        this.hasGym = hasGym;
    }

    public boolean getHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    public boolean getHasTennisCourt() {
        return hasTennisCourt;
    }

    public void setHasTennisCourt(boolean hasTennisCourt) {
        this.hasTennisCourt = hasTennisCourt;
    }
    
}
