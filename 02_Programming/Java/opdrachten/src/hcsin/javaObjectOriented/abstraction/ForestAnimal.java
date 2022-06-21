package hcsin.javaObjectOriented.abstraction;

public abstract class ForestAnimal {
    boolean wounded = false;
    boolean dead = false;
    String type = "critter";
    int energy;

    public void enteredField(){
        System.out.println("An animal has entered the forest.");
    }
    public void feed() {}
    public void fight(ForestAnimal enemy) {}
    public abstract void sleep();
//    public void sleep(){
//        System.out.println("Sleep 8 hours!");
//    }


    public boolean isWounded() {
        return wounded;
    }

    public void setWounded(boolean wounded) {
        this.wounded = wounded;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
