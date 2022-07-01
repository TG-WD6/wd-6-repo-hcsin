package errorsExceptions.Opdracht3;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        Quiz quiz = new Quiz();
        Question question = new Question();

        //spelers aanmaken
        System.out.print("Kies aantal speler : ");
        int aantalspelers = myInput.nextInt();
        try {
            quiz.start(aantalspelers);
        }catch (Exception e){
            System.out.println(e);
        }

        //vragen
        int answerInt = 0;
        String name = "";
        String nextCapture = "-------------------------";
        System.out.println(nextCapture);
        System.out.println("Beantwoord de volgende vragen.");
        quiz.logger.addIntoLogbook("Vraag 1.");
        question.QuestionOne();
        for (int i = 0; i < aantalspelers; i++) {
            name = quiz.spelerName.get(i);
            System.out.print(name + " jou antwoord is : ");
            answerInt = myInput.nextInt();
            question.QuestionOneAnswer(i, answerInt);
            quiz.logger.addIntoLogbook(name + question.answerStr);
            if(i + 1 == aantalspelers){
                System.out.println(nextCapture);
                quiz.logger.addIntoLogbook(nextCapture);
            }
        }

        //resultaten
        for (int i = 0; i < aantalspelers; i++) {
            name = quiz.spelerName.get(i);
            int num = question.scores[i];
            String resultPr = name + " heeft een score van " + num + " punten";
            System.out.println(resultPr);
            quiz.logger.addIntoLogbook(resultPr);
            if(i + 1 == aantalspelers){
                System.out.println(nextCapture);
                quiz.logger.addIntoLogbook(nextCapture);
            }
        }


        myInput.close();
        quiz.inputName.close();
        //Logbook aanmaken
        try {
            quiz.logger.createLogbook();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Logboek is NIET aangemaakt.");
        }
    }
}