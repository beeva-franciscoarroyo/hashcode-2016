package com.beeva.hashcode.beevateam.delivery.io;

import com.beeva.hashcode.beevateam.model.Order;
import com.beeva.hashcode.beevateam.model.Point;
import com.beeva.hashcode.beevateam.model.Warehouse;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by escabia on 11/02/16.
 */
public class InputScenary {

    int rows;
    int columns;
    int numeroDrones;
    int turns;
    int maxWeigh;

    int numOrders;
    List<Order> listOrders;

    int numWarehouses;
    List<Warehouse> listWarehouses;

    int numTypeProducts;
    Map<Integer, Integer> mapTypeProductWeigh;


    public InputScenary(String pathFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathFileName)))
        {

            //Primera linea
            String firstLine = br.readLine();
            String[] parametersSimulation = firstLine.split(" ");

            this.rows = Integer.valueOf(parametersSimulation[0]);
            this.columns = Integer.valueOf(parametersSimulation[1]);
            this.numeroDrones = Integer.valueOf(parametersSimulation[2]);
            this.turns = Integer.valueOf(parametersSimulation[3]);
            this.maxWeigh = Integer.valueOf(parametersSimulation[4]);

            // Segunda linea
            String secondLine = br.readLine();
            this.numTypeProducts = Integer.valueOf(secondLine);

            // Tercera linea
            mapTypeProductWeigh = new HashMap<>();
            String thirdLine = br.readLine();
            String[] types = thirdLine.split(" ");
            for(int i=0; i<numTypeProducts; i++){
                mapTypeProductWeigh.put(i,Integer.valueOf(types[i]));
            }

            // Warehouses
            String fourthLine = br.readLine();
            this.numWarehouses = Integer.valueOf(fourthLine);

            listWarehouses = new ArrayList<>();
            for(int i=0; i<numWarehouses;i++){
                String line = br.readLine();
                String[] locationsWarehouse = line.split(" ");
                Warehouse w = new Warehouse(i, new Point(Integer.valueOf(locationsWarehouse[0]),Integer.valueOf(locationsWarehouse[1])));
                listWarehouses.add(w);

                String line2 = br.readLine();
                String[] storeProductsinWarehouse = line2.split(" ");
                for(int j=0; j<numTypeProducts; j++){
                    listWarehouses.get(i).getMapTypeProductItems().put(j,Integer.valueOf(storeProductsinWarehouse[j]));
                }

            }

            // Orders
            String fithLine = br.readLine();
            this.numOrders = Integer.valueOf(fithLine);

            listOrders = new ArrayList<>();

            for(int i=0; i<numOrders;i++){
                String line = br.readLine();
                String[] locationsOrders = line.split(" ");
                Order o = new Order(i, new Point(Integer.valueOf(locationsOrders[0]),Integer.valueOf(locationsOrders[1])));
                listOrders.add(o);


                String line2 = br.readLine();
                o.setItems(Integer.valueOf(line2));

                String line3 = br.readLine();
                String[] storeProductsOrder = line3.split(" ");
                for(int j=0; j<o.getItems(); j++){
                    listOrders.get(i).getMapTypeProductItems().put(j,Integer.valueOf(storeProductsOrder[j]));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    @Override
    public String toString() {
        return "InputScenary{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", numeroDrones=" + numeroDrones +
                ", turns=" + turns +
                ", maxWeigh=" + maxWeigh +
                ", numOrders=" + numOrders +
                ", listOrders=" + listOrders +
                ", numWarehouses=" + numWarehouses +
                ", listWarehouses=" + listWarehouses +
                ", numTypeProducts=" + numTypeProducts +
                ", mapTypeProductWeigh=" + mapTypeProductWeigh +
                '}';
    }
}
