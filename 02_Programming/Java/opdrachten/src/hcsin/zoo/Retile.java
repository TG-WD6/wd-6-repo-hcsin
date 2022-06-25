package hcsin.zoo;

public class Retile extends Animal{
    public String catagory = "Retile";

    public Retile(String name, String environment) {
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
        return "Retile{" +
                "catagory='" + catagory + '\'' +
                ", name='" + name + '\'' +
                ", feedingTime='" + feedingTime + '\'' +
                ", frequentie=" + frequentie +
                ", environment='" + environment + '\'' +
                '}';
    }
}