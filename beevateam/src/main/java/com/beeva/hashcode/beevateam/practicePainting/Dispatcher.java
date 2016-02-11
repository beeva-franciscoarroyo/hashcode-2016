package com.beeva.hashcode.beevateam.practicePainting;

import com.beeva.hashcode.beevateam.delivery.io.InputScenary;
import com.beeva.hashcode.beevateam.model.Drone;
import com.beeva.hashcode.beevateam.model.Order;
import com.beeva.hashcode.beevateam.model.Warehouse;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {

    private int numeroDrones;
    private int dronePayload;

    public Dispatcher(InputScenary inputScenary) {
        List<Boolean> drones = new ArrayList<>();
        for (int i = 0; i < inputScenary.getNumeroDrones(); i++) {
            drones.add(false);
        }

        numeroDrones = inputScenary.getNumeroDrones();
        dronePayload = inputScenary.getMaxWeigh();
        List<Order> orders = new ArrayList<>();
        orders.addAll(inputScenary.getListOrders());
    }

    private void calculate(int droneActual, int orderActual, List<Order> orders, List<Warehouse> listWarehouses) {




    }


}
