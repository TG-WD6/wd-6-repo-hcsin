package hcsin.variableAndOperators;

public class Katten {
    public static void main(String[] args) {
        int numberOfCats = 10;
        System.out.println("Ben heeft nu " + numberOfCats + " katten.");
        int moreCats = 5;
        System.out.println("en hij wil nu nog "+ moreCats+ " katten erbij.");
        System.out.println("in totaal heeft Ben " + (numberOfCats = numberOfCats + moreCats) + " katten.");
        System.out.println(numberOfCats % 4);

    }
}
