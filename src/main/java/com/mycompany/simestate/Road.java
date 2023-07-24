package com.mycompany.simestate;

class Road {
    private Place start;
    private Place end;
    private int distance;

    public Road(Place start, Place end, int distance) {
        this.start = start;
        this.end = end;
        this.distance = distance;
    }

    public Place getStart() {
        return start;
    }

    public Place getEnd() {
        return end;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return start.getId() + " " + end.getAddress() + " " + distance; 
    }
    
    
}
