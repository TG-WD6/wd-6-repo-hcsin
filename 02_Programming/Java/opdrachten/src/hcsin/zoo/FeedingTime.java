package hcsin.zoo;

public class FeedingTime {
    public String name;
    public int time;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public FeedingTime(String name, int time) {
        this.name = name;
        this.time = time;
    }

    @Override
    public String toString() {
        return "FeedingTime{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
