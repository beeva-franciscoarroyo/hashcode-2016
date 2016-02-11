package com.beeva.hashcode.beevateam.model;

import java.util.List;

/**
 * Created by escabia on 11/02/16.
 */
public class Warehouse {

    int id;
    Point location;

    public Warehouse(int id, Point location) {
        this.id = id;
        this.location = location;
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


}
