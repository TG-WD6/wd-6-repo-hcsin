package hcsin.zoo;

public class Cat extends Animal{
    public String catagory = "Cat";

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public Cat(String name, String environment) {
        this.name = name;
        this.environment = environment;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "catagory='" + catagory + '\'' +
                ", name='" + name + '\'' +
                ", feedingTime='" + feedingTime + '\'' +
                ", frequentie=" + frequentie +
                ", environment='" + environment + '\'' +
                '}';
    }
}