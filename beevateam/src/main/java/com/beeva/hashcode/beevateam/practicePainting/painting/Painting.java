package com.beeva.hashcode.beevateam.practicePainting.painting;

import com.beeva.hashcode.beevateam.practicePainting.commands.Command;
import com.beeva.hashcode.beevateam.practicePainting.io.InputPainting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 * Created by escabia on 09/02/16.
 */
public class Painting {
    protected InputPainting inputPainting;
    protected List<Command> commandList;

    public void output(String path){
        try {

            String content = "This is the content to write into file";

            File file = new File(path);

            // if file doesnt exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(commandList.size() + "\n");
            for(Command command : this.commandList){
                bw.write(command.toString() + "\n");
            }
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
