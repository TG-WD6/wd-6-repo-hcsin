package hcsin.zoo;

public class Bird extends Animal{
    public String catagory = "Bird";

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public Bird(String name, String environment) {
        this.name = name;
        this.environment = environment;
    }
    @Override
    public String toString() {
        return "Bird{" +
                "catagory='" + catagory + '\'' +
                ", name='" + name + '\'' +
                ", feedingTime='" + feedingTime + '\'' +
                ", frequentie=" + frequentie +
                ", environment='" + environment + '\'' +
                '}';
    }
}
