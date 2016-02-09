package com.beeva.hashcode.beevateam.practicePainting.painting;

import com.beeva.hashcode.beevateam.practicePainting.figures.Matrix;
import com.beeva.hashcode.beevateam.practicePainting.io.InputPainting;
import org.apache.commons.math3.linear.Array2DRowRealMatrix;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by escabia on 09/02/16.
 */
public class ValidationPainting {

    private InputPainting inputPainting;
    private String fileNameCommands;

    private Matrix commandsToMatrix(String pathFileCommands, int rows, int columns){
        Matrix matrix = new Matrix();
        try (BufferedReader br = new BufferedReader(new FileReader(pathFileCommands)))
        {

            String firstLine = br.readLine();
            int commands = Integer.valueOf(firstLine);

            String sCurrentLine;
            double [][]data = new double[rows][columns];

            int lineas = 0;
            while ((sCurrentLine = br.readLine()) != null) {
                String []splitLine = sCurrentLine.split(" ");
                if(splitLine[0].equals("PAINT_SQUARE")){
                    int row = Integer.valueOf(splitLine[1]);
                    int column = Integer.valueOf(splitLine[2]);
                    int side = Integer.valueOf(splitLine[3]);
                    for(int i = row - side; i<row + side; i++){
                        for(int j = column - side; j < column + side; j++){
                            System.out.println("entra");
                            data[i][j] = new Double(1d);
                        }
                    }
                }
                else if(splitLine[0].equals("PAINT_LINE")){
                    int rowstart = Integer.valueOf(splitLine[1]);
                    int columnstart = Integer.valueOf(splitLine[2]);
                    int rowend = Integer.valueOf(splitLine[3]);
                    int columnend = Integer.valueOf(splitLine[4]);

                    for(int i = rowstart; i <= rowend ; i++){
                        for(int j = columnstart; j <= columnend; j++){
                            data[i][j] = new Double(1d);
                        }
                    }
                }
                else if(splitLine[0].equals("ERASE_CELL")){
                    int row = Integer.valueOf(splitLine[1]);
                    int column = Integer.valueOf(splitLine[2]);
                    data[row][column] = new Double(0d);
                }
                else{
                    throw new Exception();
                }
                lineas++;

            }
            if(commands == lineas) {
                matrix.setMatrix(new Array2DRowRealMatrix(data));
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        return matrix;
    }

    public ValidationPainting(InputPainting inputPainting, String fileNameCommands) {
        this.inputPainting = inputPainting;
        this.fileNameCommands = fileNameCommands;
    }

    public boolean isValid(){
        return Arrays.deepEquals(this.inputPainting.getMatrix().getData(), commandsToMatrix(fileNameCommands,this.inputPainting.getRows(), this.inputPainting.getColumns()).getMatrix().getData());
    }
}
