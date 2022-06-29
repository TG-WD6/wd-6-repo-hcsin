package Opdracht3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Opdracht03 {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        Quiz quiz = new Quiz();



        //spelers aanmaken
        System.out.println("Kies aantaal speler.");
        int aantalspelers = myInput.nextInt();
        try {
            quiz.start(aantalspelers);
        }catch (Exception e){
            System.out.println(e);
        }
        myInput.close();


        //Logbook aanmaken
        Logger logger = new Logger();
        try {
            logger.createLogbook();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Logboek is NIET aangemaakt.");
        }
    }
}
//    Maak een Question class die de vraag en een lijst met 4 goede antwoorden bijhoudt.
//    Zorg dat je Quiz class een multiple-choice vraag in de terminal kan printen.
//    Vervolgens moet de Quiz om input vragen per speler, en aan het einde van de ronde melden wie er gelijk had.
//Maak een class Logger die de namen en antwoorden van de spelers van elke Quiz bij kan houden, en sla deze na het spelen van een Quiz hiermee op in een file.
