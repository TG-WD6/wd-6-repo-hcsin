package hcsin.loopsAndConditions;

public class Opdracht1_5 {
    public static void main(String[] args) {
        int amount = 27;
        int delenDoor2 = amount % 2;
        int delenDoor3 = amount % 3;
        int cijfers = 0;
        if(delenDoor2 == 0){
            cijfers += 2;
        }
        if(delenDoor3 == 0){
            cijfers += 3;
        }
        if(amount < 30){
            System.out.println("Amount is kleiner dan 30");
        }else{
            System.out.println("Amount is groter dan 30");
        }
        switch (cijfers){
            case 0:
                System.out.println("Amount is niet deelbaar door 3 en 2");
                break;
            case 2:
                System.out.println("Amount is alleen deelbaar door 2");
                break;
            case 3:
                System.out.println("Amount is alleen deelbaar door 3");
                break;
            case 5:
                System.out.println("Amount is deelbaar door 3 en 2");
                break;
            default:
                break;
        }
    }
}
