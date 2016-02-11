package com.beeva.hashcode.beevateam.model;

import java.util.List;

/**
 * Created by escabia on 11/02/16.
 */
public class Warehouse {

    Point location;
    List<Type> listTypes;

    public Warehouse(Point location, List<Type> listTypes) {
        this.location = location;
        this.listTypes = listTypes;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public List<Type> getListTypes() {
        return listTypes;
    }

    public void setListTypes(List<Type> listTypes) {
        this.listTypes = listTypes;
    }
}
