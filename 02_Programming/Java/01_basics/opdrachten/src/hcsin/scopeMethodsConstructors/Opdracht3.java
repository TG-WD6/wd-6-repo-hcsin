package hcsin.scopeMethodsConstructors;

public class Opdracht3 {
    public static void main(String[] args) {
        Car3 auto1 = new Car3("rood");
        Car3 auto2 = new Car3("blauw");
//        System.out.println(auto3);
        auto1.printColor();
//        System.out.println(auto3.toString());
    }
}

class Car3 {
    public String color;

    public Car3(String color) {
        this.color = color;
//        printColor();
    }

    public void printColor(){
        System.out.println(color);
    }

}
