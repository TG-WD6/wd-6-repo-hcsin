package hcsin.loopsAndConditions;

public class Opdracht1 {
    public static void main(String[] args) {
        int amount = 27;
        if((amount % 3) == 0){
            System.out.println("Amount is deelbaar door 3");
            if((amount % 2) == 0){
                System.out.println("Amount is ook deelbaar door 2");
            }else{
                System.out.println("Maar Amount is niet deelbaar door 2");
            }
        }
    }
}
