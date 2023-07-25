package com.mycompany.simestate;

import java.util.*;

public abstract class ResidentialBuilding extends Place {
    // Properties of the ResidentialBuilding class
    private int numUnits;
    private int numBathrooms;
    private int numBedrooms;
    protected double price; 
    private int parkingSpaces;
    private int numFloors;
    private double surfaceArea;
    private boolean bonus;

    // ArrayLists to store distances to various places
    private ArrayList<Double> hospitals = new ArrayList<>();
    private ArrayList<Double> communityCentres = new ArrayList<>();
    private ArrayList<Double> emergencyServiceStations = new ArrayList<>();
    private ArrayList<Double> elementary = new ArrayList<>();
    private ArrayList<Double> secondary = new ArrayList<>();
    private ArrayList<Double> postSecondary = new ArrayList<>();
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
        this.bonus = true; // default true unless set afterwards
    }
    
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
        quickSort(elementary, 0, elementary.size() - 1);
        quickSort(secondary, 0, secondary.size() - 1);
        quickSort(postSecondary, 0, postSecondary.size() - 1);
        quickSort(malls, 0, malls.size() - 1);
        quickSort(groceryStores, 0, groceryStores.size() - 1);
        quickSort(parks, 0, parks.size() - 1);
        quickSort(busStops, 0, busStops.size() - 1);
        quickSort(subwayStations, 0, subwayStations.size() - 1);
    }
    
    //Method to print out the nearest locations
    public void displayNearestDistances(){
      System.out.println("The nearest hospital is " + hospitals.get(0) + " km away.");
      System.out.println("The nearest community centre is " + communityCentres.get(0) + " km away.");
      System.out.println("The nearest emergency service station is " + emergencyServiceStations.get(0) + " km away.");
      System.out.println("The nearest elementary schools is " + elementary.get(0) + " km away.");
      System.out.println("The nearest secondary schools is " + secondary.get(0) + " km away.");
      System.out.println("The nearest post-secondary schools is " + postSecondary.get(0) + " km away.");
      System.out.println("The nearest mall is " + malls.get(0) + " km away.");
      System.out.println("The nearest grocery store is " + groceryStores.get(0) + " km away.");
      System.out.println("The nearest park is " + parks.get(0) + " km away.");
      System.out.println("The nearest bus stops is " + busStops.get(0) + " km away.");
      System.out.println("The nearest subway station is " + subwayStations.get(0) + " km away.");
    }
    
    public String[] getNearestDistances(){
        return new String[] {String.valueOf(hospitals.get(0)), String.valueOf(communityCentres.get(0)), String.valueOf(emergencyServiceStations.get(0)), String.valueOf(elementary.get(0)), String.valueOf(secondary.get(0)), 
            String.valueOf(postSecondary.get(0)), String.valueOf(malls.get(0)), String.valueOf(groceryStores.get(0)), String.valueOf(parks.get(0)), String.valueOf(busStops.get(0)), String.valueOf(subwayStations.get(0))};
    }
    
    public void clearLists() {
        hospitals.clear();
        emergencyServiceStations.clear();
        elementary.clear();
        secondary.clear();
        postSecondary.clear();
        malls.clear();
        groceryStores.clear();
        parks.clear();
        busStops.clear();
        subwayStations.clear();
        
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

    public void addPrice(double add) {
        this.price += add;
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

    public double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public boolean isBonus() {
        return bonus;
    }

    public void setBonus(boolean bonus) {
        this.bonus = bonus;
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
    public void addElementaryDistance(double distance) {
        elementary.add(distance);
    }

    // Setter method to add a new double value to the schools ArrayList
    public void addSecondaryDistance(double distance) {
        secondary.add(distance);
    }
  
    // Setter method to add a new double value to the schools ArrayList
    public void addPostSecondaryDistance(double distance) {
        postSecondary.add(distance);
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
