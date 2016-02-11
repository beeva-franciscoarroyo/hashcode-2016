package com.beeva.hashcode.beevateam.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by escabia on 11/02/16.
 */
public class Warehouse {

    int id;
    Point location;
    Map<Integer, Integer> mapTypeProductItems = new HashMap<>();

    public Warehouse(int id, Point location) {
        this.id = id;
        this.location = location;
    }

    public Warehouse(int id, Point location, Map<Integer, Integer> mapTypeProductItems) {
        this.id = id;
        this.location = location;
        this.mapTypeProductItems = mapTypeProductItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Map<Integer, Integer> getMapTypeProductItems() {
        return mapTypeProductItems;
    }

    public void setMapTypeProductItems(Map<Integer, Integer> mapTypeProductItems) {
        this.mapTypeProductItems = mapTypeProductItems;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", location=" + location +
                ", mapTypeProductItems=" + mapTypeProductItems +
                '}';
    }
}
