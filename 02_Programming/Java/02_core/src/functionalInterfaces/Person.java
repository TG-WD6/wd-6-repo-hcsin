package functionalInterfaces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
    String name;
    int yearOfBirth;
    List<String> sport = new ArrayList<>();

    public static String[] hobbies = new String[]{"voetbal", "handbal", "volleybal", "gymnastiek", "turnen", "hardlopen", "atletiek", "zwemmen", "badminton", "golf"};
    public static String[] names = new String[]{"Emma", "Julia", "Tess", "Sophie", "Zoe", "Sara", "Nora", "Yara", "Eva", "Liv"};

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        for (int i = 0; i < 3; i++) {
            int x = (int) (Math.random() * 10);
            sport.add(hobbies[x]);
        }
        this.sport = sport;
    }

    @Override
    public String toString() {
        return "Main{" +
                "name='" + name + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                ", sport=" + sport +
                '}';
    }

    public static int calNum(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Person p1 = new Person(names[Person.calNum(0, 10)], Person.calNum(18, 65));
            personList.add(p1);
        }
        try{
            personList.stream()
                    .filter(p -> p.yearOfBirth > 50)
                    .map(p -> p.name + " is " + p.yearOfBirth + " jaar oud")
                    .forEach(System.out ::println);
            System.out.println(personList.stream()
                    .filter(p -> p.yearOfBirth > 50)
                    .count() + " mensen zijn ouder dan 50 jaar");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}