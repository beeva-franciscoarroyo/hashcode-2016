package com.beeva.hashcode.beevateam.practicePainting.figures;

import org.apache.commons.math3.linear.RealMatrix;

/**
 * Created by escabia on 09/02/16.
 */
public class Matrix {
    protected RealMatrix matrix;
    protected int rows;
    protected int columns;

    public RealMatrix getMatrix() {
        return matrix;
    }

    public void setMatrix(RealMatrix matrix) {
        this.matrix = matrix;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setColumns(int columns) {
        this.columns = columns;
    }
}
