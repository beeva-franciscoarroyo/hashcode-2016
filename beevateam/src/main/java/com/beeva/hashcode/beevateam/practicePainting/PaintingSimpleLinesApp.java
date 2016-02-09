package com.beeva.hashcode.beevateam.practicePainting;

import com.beeva.hashcode.beevateam.practicePainting.io.InputPainting;
import com.beeva.hashcode.beevateam.practicePainting.painting.SimpleLinesPainting;
import com.beeva.hashcode.beevateam.practicePainting.painting.ValidationPainting;

/**
 * Created by escabia on 09/02/16.
 */
public class PaintingSimpleLinesApp {
    public static void main( String[] args ){
        String pathStaticFiles = "src/static/paintings/";
        String pathinputFileNamePainting = pathStaticFiles + "logo.in";
        String pathoutputFileNameCommands = pathStaticFiles + "logo.cm";

        SimpleLinesPainting simpleLinesPainting = new SimpleLinesPainting(new InputPainting(pathinputFileNamePainting));
        simpleLinesPainting.output(pathoutputFileNameCommands);
        ValidationPainting validationPainting = new ValidationPainting(new InputPainting(pathinputFileNamePainting), pathoutputFileNameCommands);
        if(validationPainting.isValid()){
            System.out.println("Todo va genial");
        }
    }
}
