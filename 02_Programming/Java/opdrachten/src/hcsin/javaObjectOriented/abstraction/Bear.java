package hcsin.javaObjectOriented.abstraction;

public class Bear extends ForestAnimal {
//Beren zijn natuurlijk niet zoals normale bosdieren - ze komen in 2 soorten (black of grizzly), eten soms andere bosdieren en houden soms een winterslaap.
    String type;

    public Bear(String type) {
        this.type = type;
//        super.sleep(4);
        sleep(4);
    }
    public void sleep(int hours){
        System.out.println(this.type + " Sleep " + hours + " hours!");
    }

    @Override
    public void sleep() {

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void printType(){
        System.out.print(this.type + " ");
        System.out.println(super.getType());
    }
}
