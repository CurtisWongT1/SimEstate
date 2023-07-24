package com.mycompany.simestate;

import java.util.*;

public abstract class ResidentialBuilding extends Place {
    // Quick sort algorithm for sorting the ArrayList<Double> in ascending order
    public void quickSort(ArrayList<Double> arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition method for the quickSort algorithm
    public int partition(ArrayList<Double> arr, int low, int high) {
        // Choose the pivot element (last element in the array)
        double pivot = arr.get(high);
        int i = low - 1;
        // Iterate through the array to find elements smaller than the pivot
        for (int j = low; j < high; j++) {
            if (arr.get(j) < pivot) {
                // Increment the index of the smaller element
                i++;
                // Swap arr[i] and arr[j]
                double temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
            }
        }
        // Swap arr[i + 1] and arr[high] to place the pivot in its correct position
        double temp = arr.get(i + 1);
        arr.set(i + 1, arr.get(high));
        arr.set(high, temp);
        return i + 1;
    }

    // Method to sort the ArrayLists for each category in ascending order
    public void sortDistances() {
        quickSort(hospitals, 0, hospitals.size() - 1);
        quickSort(communityCentres, 0, communityCentres.size() - 1);
        quickSort(emergencyServiceStations, 0, emergencyServiceStations.size() - 1);
        quickSort(schools, 0, schools.size() - 1);
        quickSort(malls, 0, malls.size() - 1);
        quickSort(groceryStores, 0, groceryStores.size() - 1);
        quickSort(parks, 0, parks.size() - 1);
        quickSort(busStops, 0, busStops.size() - 1);
        quickSort(subwayStations, 0, subwayStations.size() - 1);
    }

    // Properties of the ResidentialBuilding class
    private int numUnits;
    private int numBathrooms;
    private int numBedrooms;
    private double price; 
    private int parkingSpaces;
    private int numFloors;
    private double surfaceArea;

    // ArrayLists to store distances to various places
    private ArrayList<Double> hospitals = new ArrayList<>();
    private ArrayList<Double> communityCentres = new ArrayList<>();
    private ArrayList<Double> emergencyServiceStations = new ArrayList<>();
    private ArrayList<Double> schools = new ArrayList<>();
    private ArrayList<Double> malls = new ArrayList<>();
    private ArrayList<Double> groceryStores = new ArrayList<>();
    private ArrayList<Double> parks = new ArrayList<>();
    private ArrayList<Double> busStops = new ArrayList<>();
    private ArrayList<Double> subwayStations = new ArrayList<>();

    // Constructor for ResidentialBuilding
    public ResidentialBuilding(String address, String id, int numUnits, int numBathrooms, int numBedrooms, double price, int parkingSpaces, int numFloors, double surfaceArea) {
        // Call the constructor of the superclass (Place)
        super(address, id, "");
        // Initialize the properties of the ResidentialBuilding
        this.numUnits = numUnits;
        this.numBathrooms = numBathrooms;
        this.numBedrooms = numBedrooms;
        this.price = price;
        this.parkingSpaces = parkingSpaces;
        this.numFloors = numFloors;
        this.surfaceArea = surfaceArea;
      
        // Calculate distances from this ResidentialBuilding to all other places
        //Main.calculateAllDistancesForAHouse(this);
        // Sort distances to various places in ascending order
        //this.sortDistances();
    }

    // Getters and setters for the properties of ResidentialBuilding

    public int getNumUnits() {
        return numUnits;
    }

    public void setNumUnits(int numUnits) {
        this.numUnits = numUnits;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(int parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }

    public int getNumFloors() {
        return numFloors;
    }

    public void setNumFloors(int numFloors) {
        this.numFloors = numFloors;
    }

    public int getSurfaceArea() {
        return numFloors;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    // Adding distances to the respective ArrayLists

    // Setter method to add a new double value to the hospitals ArrayList
    public void addHospitalDistance(double distance) {
        hospitals.add(distance);
    }
    
    // Setter method to add a new double value to the communityCentres ArrayList
    public void addCommunityCentreDistance(double distance) {
        communityCentres.add(distance);
    }
    
    // Setter method to add a new double value to the emergencyServiceStations ArrayList
    public void addEmergencyServiceStationDistance(double distance) {
        emergencyServiceStations.add(distance);
    }
    
    // Setter method to add a new double value to the schools ArrayList
    public void addSchoolDistance(double distance) {
        schools.add(distance);
    }
    
    // Setter method to add a new double value to the malls ArrayList
    public void addMallDistance(double distance) {
        malls.add(distance);
    }
    
    // Setter method to add a new double value to the groceryStores ArrayList
    public void addGroceryStoreDistance(double distance) {
        groceryStores.add(distance);
    }
    
    // Setter method to add a new double value to the parks ArrayList
    public void addParkDistance(double distance) {
        parks.add(distance);
    }
    
    // Setter method to add a new double value to the busStops ArrayList
    public void addBusStopDistance(double distance) {
        busStops.add(distance);
    }
    
    // Setter method to add a new double value to the subwayStations ArrayList
    public void addSubwayStationDistance(double distance) {
        subwayStations.add(distance);
    }
}
