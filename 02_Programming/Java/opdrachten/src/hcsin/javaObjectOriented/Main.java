package hcsin.javaObjectOriented;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Animal> aList = new ArrayList<>();

        Animal bird1 = new Animal("pietje", "papagaai", "daily", 2);
        Animal reptile1 = new Animal("jantje", "snake", "weekly", 1);
        Animal cat1 = new Animal("mietje", "longhair", "daily", 1);
//        var x = bird1.toString();
        aList.add(bird1);
//        var y = reptile1.toString();
        aList.add(reptile1);
//        var z = cat1.toString();
        aList.add(cat1);

        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i) + " index: " + i);
        }
        for (Animal a : aList){
            System.out.println(a.getFrequentie());
            System.out.println(a.getName());
        }

//        System.out.println(aList.get(2));

//        public static void processCar(ArrayList<Car> car){
//            for(Car c : car){
//                System.out.println (c.getPrice());
//            }
//        }


//        String[] actions = {" kinapped by ", " escapes ", " dropped "};
//
//        Random cijfers = new Random();
//        int r = cijfers.nextInt(0, actions.length);
//
//        Scanner myInput = new Scanner(System.in);
//
//        System.out.println("Typ een naam in");
//        String hoofdrol = myInput.nextLine();
//        System.out.println("Typ de tweede naam in");
//        String siderol = myInput.nextLine();
//
//        System.out.println(hoofdrol + actions[r] + siderol);
    }
}
