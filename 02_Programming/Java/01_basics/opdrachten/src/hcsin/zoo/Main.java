package hcsin.zoo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] data;
        Scanner myInput = new Scanner(System.in);

        Zoo zoo = new Zoo();
        Bird vogeltje = new Bird("Jantje", "Bos");
        vogeltje.frequentie = 2;
        Cat kat = new Cat("Mini", "Indoor");
        kat.frequentie = 1;
        Reptile slang = new Reptile("Flash", "Bergen");
        slang.frequentie = 5;
        zoo.addAnimal(vogeltje);
        zoo.addAnimal(kat);
        zoo.addAnimal(slang);

        System.out.println("Welkom in TG-Dierentuin.");

        while (true){
            System.out.println("-----------------------");
            System.out.println("Kies een nummer van de menu: ");
            System.out.println("1.een vogel toevoegen \n2.een reptile toevoegen\n3.een kat toevoegen\n4.lijst van dieren/deleten\n5.eten geven");
            int choose = myInput.nextInt();
            switch (choose){
                case 1:
                    data = information();
                    Bird vogel = new Bird(data[0], data[1]);
                    vogel.frequentie = 2;
                    zoo.addAnimal(vogel);
                    break;
                case 2:
                    data = information();
                    Reptile reptile = new Reptile(data[0], data[1]);
                    reptile.frequentie = 7;
                    zoo.addAnimal(reptile);
                    break;
                case 3:
                    data = information();
                    Cat cat = new Cat(data[0], data[1]);
                    cat.frequentie = 1;
                    zoo.addAnimal(cat);
                    break;
                case 4:
                    zoo.displayAllAnimal();
                    System.out.print("Wil je een dier verwijderen? ja/nee ");
                    String deleAnimalAnt = myInput.next();
                    if((deleAnimalAnt.charAt(0) == 'j') || (deleAnimalAnt.charAt(0) == 'J')){
                        System.out.print("Kies een index nummer van de dier: ");
                        int deleteAnimalNum = myInput.nextInt();
                        zoo.removeAnimal(deleteAnimalNum);
                    }
                    break;
                case 5:{
                    zoo.newDay();
                }
                default:
                    break;
            }
        }
    }
    public static String[] information(){
        Scanner myInput = new Scanner(System.in);
        System.out.print("Wat is de naam: ");
        String aName = myInput.nextLine();
        System.out.print("In welke omgeving leven ze: ");
        String aEvi = myInput.nextLine();
        String[] a = {aName, aEvi};
        return a;
    }
}
