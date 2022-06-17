package hcsin.zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int runningDays = 1;
        String x = "";
        String[] data;
        Scanner myInput = new Scanner(System.in);

        ArrayList<String> aList = new ArrayList<>();
        ArrayList<FeedingTime> fList = new ArrayList<>();

        while (true){
            System.out.println("-----------------------");
            System.out.println("Welkom in TG-Dierentuin. " + runningDays + " dagen zijn wij actief geweest.");
            System.out.println("Kies een catagory: 1. Vogel, 2. Retile, 3. Kat, 4.lijst van dieren/deleten, 5.lijst eten geven");
            int choose = myInput.nextInt();
            switch (choose){
                case 1:
                    data = information();
                    Bird vogel = new Bird(data[0], data[1],data[2]);
                    x = vogel.toString();
                    aList.add(x);
                    FeedingTime feedTime = new FeedingTime(data[0], vogel.getFrequentie());
                    fList.add(feedTime);
                    break;
                case 2:
                    data = information();
                    Retile retile = new Retile(data[0], data[1],data[2]);
                    x = retile.toString();
                    aList.add(x);
                    feedTime = new FeedingTime(data[0], retile.getFrequentie());
                    fList.add(feedTime);
                    break;
                case 3:
                    data = information();
                    Cat cat = new Cat(data[0], data[1],data[2]);
                    x = cat.toString();
                    aList.add(x);
                    feedTime = new FeedingTime(data[0], cat.getFrequentie());
                    fList.add(feedTime);
                    break;
                case 4:
                    for (int i = 0; i < aList.size(); i++) {
                        System.out.println(aList.get(i) + " index: " + i);
                    }
                    System.out.print("Wil je een dier verwijderen? ja/nee ");
                    String deleAni = myInput.next();
                    if(deleAni.charAt(0) == 'j'){
                        System.out.print("Kies een index nummer:");
                        int indexAnimals = myInput.nextInt();
                        aList.remove(indexAnimals);
                    }
                    break;
                case 5:{
                    for (int i = 0; i < fList.size(); i++) {
                        int f = fList.get(i).time;
                        System.out.print(fList.get(i).time + fList.get(i).name + ", ");
                        if(runningDays % f == 0){
                            System.out.println("moet vandaag eten geven.");
                        }else {
                            System.out.println("over " + f + " dagen kan je eten geven.");
                        }
                    }
                }
                default:
                    break;
            }
            runningDays++;
        }
    }
    public static String[] information(){
        Scanner myInput = new Scanner(System.in);
        System.out.print("Wat is de naam:");
        String aName = myInput.nextLine();
        System.out.print("Wat is de type:");
        String aType = myInput.nextLine();
        System.out.print("In welke omgeving leven ze:");
        String aEvi = myInput.nextLine();
        String[] a = {aName, aType, aEvi};
        return a;
    }
}
