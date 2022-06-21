package hcsin.javaObjectOriented.inheritancePolymorphism;

public class Main {
    public static void main(String[] args) {
        ForestAnimal carebear = new Bear("Grizzly");
        Bear bigBear = new Bear("Black");
        bigBear.printType();

        ForestAnimal[] forestAnimals = {carebear, bigBear};
    }
}
