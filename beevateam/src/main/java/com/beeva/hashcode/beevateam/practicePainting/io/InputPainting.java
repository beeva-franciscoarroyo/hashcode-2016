package com.beeva.hashcode.beevateam.practicePainting.io;

import com.beeva.hashcode.beevateam.practicePainting.figures.Matrix;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;
import org.apache.commons.math3.linear.RealMatrix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by escabia on 09/02/16.
 */
public class InputPainting extends Matrix {

    public InputPainting(String pathFileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathFileName)))
        {

            String firstLine = br.readLine();
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
            matrix = new Array2DRowRealMatrix(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
