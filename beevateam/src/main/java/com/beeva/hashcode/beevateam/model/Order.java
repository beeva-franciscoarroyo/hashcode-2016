package com.beeva.hashcode.beevateam.model;

import java.util.List;

/**
 * Created by escabia on 11/02/16.
 */
public class Order {

    int id;
    Point destino;
    int items;
    List<Type> listTypes;

    public Order(int id, Point destino, int items, List<Type> listTypes) {
        this.id = id;
        this.destino = destino;
        this.items = items;
        this.listTypes = listTypes;
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

    public List<Type> getListTypes() {
        return listTypes;
    }

    public void setListTypes(List<Type> listTypes) {
        this.listTypes = listTypes;
    }
}
