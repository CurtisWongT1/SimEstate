package com.mycompany.simestate;

public class House extends ResidentialBuilding {

    private static final double PRICE_PER_SQ_FT = 393; // Price per square foot, averaged b/w a fully detached and semi detached home
    private static final double BATHROOM_PRICE = 20000.0; // Additional price per bathroom 
    private static final double BEDROOM_PRICE = 20000.0; // Additional price per bedroom
    private static final double GARAGE_PRICE = 40000.0; // Additional price for having a garage
    private static final double BACKYARD_PRICE_PER_SQ_FT = 100; // Price per square foot for the backyard 
    private double backyardSize;

    //Constructor
    public House(String address, String id, double backyardSize, int numBathrooms, int numBedrooms, double price, int parkingSpaces, int numFloors, double surfaceArea) {
        super(address, id, 1, numBathrooms, numBedrooms, price, parkingSpaces, numFloors, surfaceArea);
        double newPrice = calculateHousePrice(surfaceArea, numBathrooms, numBedrooms, parkingSpaces, backyardSize);
        this.setPrice(newPrice);
        this.backyardSize = backyardSize;

    }

    public double getBackyardSize() {
        return backyardSize;
    }

    public void setBackyardSize(double backyardSize) {
        this.backyardSize = backyardSize;
    }

    public static double calculateHousePrice(double surfaceArea, int numBathrooms, int numBedrooms, int numParkingSpaces, double backyardSize) {
        double basePrice = surfaceArea * PRICE_PER_SQ_FT;

        // Add additional fees for bathrooms and bedrooms
        double bathroomFees = numBathrooms * BATHROOM_PRICE;
        double bedroomFees = numBedrooms * BEDROOM_PRICE;
        double garageFees = (numParkingSpaces >= 2) ? GARAGE_PRICE : 0.0;
        double backyardFees = backyardSize * BACKYARD_PRICE_PER_SQ_FT;

        double totalPrice = basePrice + bathroomFees + bedroomFees + garageFees + backyardFees;
        System.out.println("initial price: " + totalPrice);
        return totalPrice;
    }

}
