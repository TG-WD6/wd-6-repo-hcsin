package Opdracht3;

public class Question {
    int[] scores = new int[]{0, 0, 0, 0, 0};
    String answerStr = "";

    public void QuestionOne(){
        System.out.println("Wat is de laatste ding wat Jens altijd wil doen bij afsluiten van de dag?");
        System.out.println("1. Getter handelen");
        System.out.println("2. Setter handelen");
        System.out.println("3. Pushen");
        System.out.println("4. Diner suggecties vragen");
    }
    public void QuestionOneAnswer(int index, int num){
        switch (num){
            case 1:
                answerStr = " antwoord bij vraag 1: Getter handelen";
                break;
            case 2:
                answerStr = " antwoord bij vraag 1: Setter handelen";
                break;
            case 3:
                scores[index] += 1;
                answerStr = " antwoord bij vraag 1: pushen";
                break;
            case 4:
                answerStr = " antwoord bij vraag 1: Diner suggecties";
                break;
        }
    }
    public void QuestionTwo(){
        System.out.println("Wie is de beste coach van Techgrounds?");
        System.out.println("1. Jens");
        System.out.println("2. Jens en Aljfijah");
        System.out.println("3. Jens, Aljfijah en Kim Sing");
        System.out.println("4. er is geen goeie coach binnen Techgrounds.");
    }
}