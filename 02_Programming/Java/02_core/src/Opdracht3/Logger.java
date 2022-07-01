package Opdracht3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Logger {
    public ArrayList<String> logbook = new ArrayList<>();

    public void addIntoLogbook(String logInfo){
        logbook.add(logInfo);
    }

    public void createLogbook() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("logbook.txt"));
        System.out.println("Logboek is aangemaakt.");
        bw.write(logbook.size());
        for (int i = 0; i < logbook.size(); i++) {
            bw.write(logbook.get(i));
            bw.newLine();
        }
        bw.close();
    }
}
