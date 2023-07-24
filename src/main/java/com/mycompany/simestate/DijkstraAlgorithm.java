package com.mycompany.simestate;

import java.util.*; 

class DijkstraAlgorithm{
    private Map<Place, List<Road>> adjacencyList;

  public DijkstraAlgorithm(Map<Place, List<Road>> adjacencyList) {
        this.adjacencyList = adjacencyList;
    }

    public Map<Place, Integer> shortestPaths(Place source) {
        Map<Place, Integer> distanceMap = new HashMap<>();
        for (Place place : adjacencyList.keySet()) {
            distanceMap.put(place, Integer.MAX_VALUE);
        }

        distanceMap.put(source, 0);
        PriorityQueue<Place> minHeap = new PriorityQueue<>(Comparator.comparingInt(distanceMap::get));
        minHeap.offer(source);

        while (!minHeap.isEmpty()) {
            Place current = minHeap.poll();
            for (Road road : adjacencyList.get(current)) {
                Place neighbor = road.getEnd();
                int newDistance = distanceMap.get(current) + road.getDistance();

                if (newDistance < distanceMap.get(neighbor)) {
                    distanceMap.put(neighbor, newDistance);
                    minHeap.offer(neighbor);
                }
            }
        }

        return distanceMap;
    }
}