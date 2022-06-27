package hcsin.zoo;

public class Reptile extends Animal{
    public String catagory = "Reptile";

    public Reptile(String name, String environment) {
        this.name = name;
        this.environment = environment;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    @Override
    public String toString() {
        return "Reptile{" +
                "catagory='" + catagory + '\'' +
                ", name='" + name + '\'' +
                ", feedingTime='" + feedingTime + '\'' +
                ", frequentie=" + frequentie +
                ", environment='" + environment + '\'' +
                '}';
    }
}