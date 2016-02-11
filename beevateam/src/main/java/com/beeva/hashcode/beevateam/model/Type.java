package com.beeva.hashcode.beevateam.model;

/**
 * Created by escabia on 11/02/16.
 */
public class Type {

    int id;
    int weigh;
    int items;

    public Type(int id, int weigh, int items) {
        this.id = id;
        this.weigh = weigh;
        this.items = items;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }
}
