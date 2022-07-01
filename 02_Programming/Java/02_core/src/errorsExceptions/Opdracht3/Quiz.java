package errorsExceptions.Opdracht3;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    Scanner inputName = new Scanner(System.in);
    public ArrayList<String> spelerName = new ArrayList<>();

    Logger logger = new Logger();

    public void start(int aantalspelers) throws IllegalArgumentsException{
        if(aantalspelers > 5){
            throw new IllegalArgumentsException("Maximaal 5 spelers.");
        }else {
            System.out.println(aantalspelers + " mensen gaat de spel spelen.");
            for (int i = 0; i < aantalspelers; i++) {
                System.out.print("wat is de naam van speler " + (i +1) + " :");
                String name = inputName.nextLine();
                spelerName.add(name);
                String inputLog = "Speler " + (i +1) + " is " + name;
                logger.addIntoLogbook(inputLog);
            }
            logger.addIntoLogbook("--------------------");
        }
//        inputName.close();
    }
}
