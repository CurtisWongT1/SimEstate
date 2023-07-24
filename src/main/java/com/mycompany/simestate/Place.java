package com.mycompany.simestate;

public abstract class Place {
    private String address;
    private String id;
    private String name;

    public Place(String address, String id, String name) {
        this.address = address;
        this.id = id; 
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
