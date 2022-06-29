package Opdracht3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Logger {
    public ArrayList<String> logbook = new ArrayList<>();

    public void addIntoLogbook(String logInfo, int num){
        logbook.add(logInfo);
        System.out.println("writing..");
        System.out.println(logbook.get(num));
    }

    public void createLogbook() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("logbook.txt"));
        System.out.println("Logboek is aangemaakt.");
        System.out.println(logbook.size());
        bw.write(logbook.size());
        for (int i = 0; i < logbook.size(); i++) {
            System.out.println(logbook.get(i) + " writing...");
            bw.write(logbook.get(i));
//            System.out.println(logbook.get(i));
            bw.newLine();
        }
        bw.close();
    }
}
