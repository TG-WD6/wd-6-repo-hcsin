package hcsin.zoo;

public class Cat {
    public String catagory = "Cat";
    public String name;
    public String type;
    public String feedingTime = "days";
    public int frequentie = 2;
    public String environment;


    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFeedingTime() {
        return feedingTime;
    }

    public void setFeedingTime(String feedingTime) {
        this.feedingTime = feedingTime;
    }

    public int getFrequentie() {
        return frequentie;
    }

    public void setFrequentie(int frequentie) {
        this.frequentie = frequentie;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public Cat(String name, String type, String environment) {
        this.name = name;
        this.type = type;
        this.environment = environment;
    }
    @Override
    public String toString() {
        return "Cat{" +
                "catagory='" + catagory + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", feedingTime='" + feedingTime + '\'' +
                ", frequentie=" + frequentie +
                ", environment='" + environment + '\'' +
                '}';
    }


}
