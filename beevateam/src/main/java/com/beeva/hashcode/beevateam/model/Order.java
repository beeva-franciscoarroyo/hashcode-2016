package com.beeva.hashcode.beevateam.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by escabia on 11/02/16.
 */
public class Order {

    int id;
    Point destino;
    int items;
    Map<Integer, Integer> mapTypeProductItems = new HashMap<>();

    public Order(int id, Point destino) {
        this.id = id;
        this.destino = destino;
    }

    public Order(int id, Point destino, int items, Map<Integer, Integer> mapTypeProductItems) {
        this.id = id;
        this.destino = destino;
        this.items = items;
        this.mapTypeProductItems = mapTypeProductItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Point getDestino() {
        return destino;
    }

    public void setDestino(Point destino) {
        this.destino = destino;
    }

    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public Map<Integer, Integer> getMapTypeProductItems() {
        return mapTypeProductItems;
    }

    public void setMapTypeProductItems(Map<Integer, Integer> mapTypeProductItems) {
        this.mapTypeProductItems = mapTypeProductItems;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", destino=" + destino +
                ", items=" + items +
                ", mapTypeProductItems=" + mapTypeProductItems +
                '}';
    }
}
