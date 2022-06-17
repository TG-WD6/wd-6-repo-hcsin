package hcsin.javaObjectOriented;

public class Animal  {
    public String name;
    public String type;
    public String feedingTime;
    public int frequentie;
    //environment

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

    public Animal(String name, String type, String feedingTime, int frequentie) {
        this.name = name;
        this.type = type;
        this.feedingTime = feedingTime;
        this.frequentie = frequentie;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", feedingTime='" + feedingTime + '\'' +
                ", frequentie=" + frequentie +
                '}';
    }
}
