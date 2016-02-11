package com.beeva.hashcode.beevateam.delivery.io;

import com.beeva.hashcode.beevateam.model.Order;
import com.beeva.hashcode.beevateam.model.Type;
import com.beeva.hashcode.beevateam.model.Warehouse;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Created by escabia on 11/02/16.
 */
public class InputScenary {

    int rows;
    int columns;
    int numeroDrones;
    int turns;
    int maxWeigh;
    List<Order> listOrders;
    List<Warehouse> listWarehouses;

    public InputScenary(String pathFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathFileName)))
        {
            String firstLine = br.readLine();
            String[] parametersSimulation = firstLine.split(" ");

            //Primera linea
            this.rows = Integer.valueOf(parametersSimulation[0]);
            this.columns = Integer.valueOf(parametersSimulation[1]);
            this.turns = Integer.valueOf(parametersSimulation[2]);;
            this.maxWeigh = Integer.valueOf(parametersSimulation[3]);




            /*String firstLine = br.readLine();
            String[] dimensiones = firstLine.split(" ");
            rows = Integer.valueOf(dimensiones[0]);
            columns = Integer.valueOf(dimensiones[1]);

            String sCurrentLine;
            double [][]data = new double[rows][columns];

            int linea = 0;
            while ((sCurrentLine = br.readLine()) != null) {
                for(int j=0; j<sCurrentLine.length(); j++){
                    data[linea][j] = sCurrentLine.charAt(j) == '#' ? 1 : 0;
                }
                linea++;
            }
            matrix = new Array2DRowRealMatrix(data);*/

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
