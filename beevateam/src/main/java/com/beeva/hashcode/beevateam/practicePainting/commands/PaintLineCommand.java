package com.beeva.hashcode.beevateam.practicePainting.commands;

import com.beeva.hashcode.beevateam.practicePainting.figures.Point;

/**
 * Created by escabia on 09/02/16.
 */
public class PaintLineCommand extends Command{
    private Point initialPoint;
    private Point endPoint;

    public PaintLineCommand(Point initialPoint, Point endPoint) {
        this.initialPoint = initialPoint;
        this.endPoint = endPoint;
    }

    public Point getInitialPoint() {
        return initialPoint;
    }

    public void setInitialPoint(Point initialPoint) {
        this.initialPoint = initialPoint;
    }

    public Point getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(Point endPoint) {
        this.endPoint = endPoint;
    }

    @Override
    public String toString() {
        return "PAINT_LINE " + initialPoint.getX() + " " + initialPoint.getY() + " " + endPoint.getX() + " " + endPoint.getY();
    }
}
