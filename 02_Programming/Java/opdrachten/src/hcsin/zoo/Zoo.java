package hcsin.zoo;

import java.util.ArrayList;
import java.util.Random;

public class Zoo {
    Random random = new Random();

    int runningDays = random.nextInt(30, 100);
    ArrayList<Animal> animalList = new ArrayList();

    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }
    public void removeAnimal(int a) {
        animalList.remove(a);
    }
    public void displayAllAnimal() {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i) + " index " + i);
        }
    }
    public void newDay(){
        runningDays++;
        System.out.println("Wij zijn al " + runningDays + " active.");
        for (int i = 0; i < animalList.size(); i++) {
            int f = animalList.get(i).frequentie;
            int r = runningDays % f;
            System.out.print(animalList.get(i).name + ", ");
            if(r == 0){
                System.out.println("moet je vandaag eten geven.");
            }else if (r == 1){
                System.out.println(r + " dag geleden heb je eten gegeven.");
            }else{
                System.out.println(r + " dagen geleden heb je eten gegeven.");
            }
        }
        System.out.println("Druk op ENTER om verder te gaan...");
        try{
            System.in.read();
        }
        catch(Exception e)
        {}
    }
}
