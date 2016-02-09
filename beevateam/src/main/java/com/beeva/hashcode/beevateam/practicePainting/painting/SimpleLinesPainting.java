package com.beeva.hashcode.beevateam.practicePainting.painting;

import com.beeva.hashcode.beevateam.practicePainting.commands.PaintLineCommand;
import com.beeva.hashcode.beevateam.practicePainting.figures.Point;
import com.beeva.hashcode.beevateam.practicePainting.io.InputPainting;

import java.util.ArrayList;

/**
 * Created by escabia on 09/02/16.
 */
public class SimpleLinesPainting extends Painting{

    public SimpleLinesPainting(InputPainting inputPainting) {
        this.inputPainting = inputPainting;
        commandList = new ArrayList<>();

        for(int i = 0; i<this.inputPainting.getRows(); i++) {
            int indIzq = -1;
            for (int j = 0; j < this.inputPainting.getColumns(); j++) {
                if (Double.compare(this.inputPainting.getMatrix().getEntry(i, j), 1) == 0 && indIzq == -1)
                    indIzq = j;
                else if (Double.compare(this.inputPainting.getMatrix().getEntry(i, j), 0) == 0 && indIzq > -1) {
                    commandList.add(new PaintLineCommand(new Point(i, indIzq), new Point(i, j - 1)));
                    indIzq = -1;
                }

            }
            if (indIzq > -1) {
                commandList.add(new PaintLineCommand(new Point(i, indIzq), new Point(i, this.inputPainting.getColumns() - 1)));
            }
        }
    }
}
