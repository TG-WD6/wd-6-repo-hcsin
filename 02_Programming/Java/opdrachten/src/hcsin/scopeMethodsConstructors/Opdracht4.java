package hcsin.scopeMethodsConstructors;

public class Opdracht4 {
    public static void main(String[] args) {
        Car4 auto1 = new Car4("rood", "audi");
        Car4 auto2 = new Car4("blauw");
        Car4 auto3 = new Car4();
//        System.out.println(auto3);
        auto1.printColor();
        auto2.printColor();
        System.out.println(auto3.color);
        System.out.println(auto1.toString());
//        System.out.println(auto3.toString());
    }
}

class Car4 {
    public String color;
    public String name;

    public Car4(String color) {
        this.color = color;
    }
    public Car4(String color, String name) {
        this.color = color;
        this.name = name;
    }
    public Car4() {
        this.color = "red";
        this.name = name;
    }

    public void printColor(){
        System.out.println(color);
    }
    public String toString(){
        return name + " is een " + color + " auto.";
    }

}
