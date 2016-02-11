package com.beeva.hashcode.beevateam.drone.operations;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class OuputOperationWriter {

    public static void writeOperations(List<Operation> operations) throws IOException {
        File output = new File("output.txt");
        FileWriter fileWriter = new FileWriter(output, false);

        fileWriter.write(operations.size() + "");
        for (Operation operation : operations) {
            fileWriter.write("\n");
            fileWriter.write(operation.getOperation());
        }

        fileWriter.flush();
        fileWriter.close();
    }

    public static void main(String args[]) throws IOException {
        writeOperations(Arrays.asList(
                new Deliver(0,0,0,0),
                new Load(1,1,6,2),
                new Wait(1,4),
                new UnLoad(4,1,5,2))
        );
    }

}
