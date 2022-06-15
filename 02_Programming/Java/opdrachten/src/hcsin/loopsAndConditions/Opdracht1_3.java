package hcsin.loopsAndConditions;

public class Opdracht1_3 {
    public static void main(String[] args) {
        int amount = 27;
        if(((amount % 3) == 0) && ((amount % 2) == 0)){
            System.out.println("Amount is deelbaar door 3 en 2");
        }else{
            if (amount < 30){
                System.out.println("Amount is kleiner dan 30");
            }
            System.out.println("Amount is niet deelbaar door 3 en 2");
        }

    }
}
