package com.beeva.hashcode.beevateam.model;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by escabia on 11/02/16.
 */
public class Product {

    int id;
    int weigh;
    //int items;
    Map<Integer, Integer> mapWareHouses = new HashMap<>();
    Map<Integer, Integer> mapOrders = new HashMap<>();

    public Product(int id, int weigh) {
        this.weigh = weigh;
        this.id = id;
    }

    public Product(int id, int weigh, Map<Integer, Integer> mapWareHouses, Map<Integer, Integer> mapOrders) {
        this.id = id;
        this.weigh = weigh;
        this.mapWareHouses = mapWareHouses;
        this.mapOrders = mapOrders;
    }

    public void updateMapWH(int w, int number){
        mapWareHouses.put(w, number);
    }

    public void updateMapOrders(int o, int number){
        mapOrders.put(o, number);
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

    public Map<Integer, Integer> getMapWareHouses() {
        return mapWareHouses;
    }

    public void setMapWareHouses(Map<Integer, Integer> mapWareHouses) {
        this.mapWareHouses = mapWareHouses;
    }

    public Map<Integer, Integer> getMapOrders() {
        return mapOrders;
    }

    public void setMapOrders(Map<Integer, Integer> mapOrders) {
        this.mapOrders = mapOrders;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", weigh=" + weigh +
                ", mapWareHouses=" + mapWareHouses +
                ", mapOrders=" + mapOrders +
                '}';
    }
}
