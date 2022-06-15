package hcsin.listsAndArrays;

import java.util.ArrayList;

public class Opdracht1 {
    public static void main(String[] args) {
        String[] cats = {"Kwik", "kwek", "kwak", "kwok"};
        String[][] sortedCats = {{"Kwik", "binnen"}, {"Kwek", "buiten"}, {"Kwak", "buiten"}, {"Kwuk", "buiten"}};
//        System.out.println(sortedCats.length);

        ArrayList<String> kittys = new ArrayList<>(4);
        kittys.add("Kwik");
        System.out.println(kittys.size());
    }
}
