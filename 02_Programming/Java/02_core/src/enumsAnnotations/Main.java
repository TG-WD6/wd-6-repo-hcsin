package enumsAnnotations;

public class Main {
    public static enum Weekday{
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY;

        boolean isWorkday;
    }

    public static void main(String[] args) {
        for (int i = 0; i < Weekday.values().length; i++) {
            if(i < 5){
                System.out.println("It's " + Weekday.values()[i] + " Go to work.");
            }else{
                System.out.println("It's " + Weekday.values()[i] + " Stay at home and play with your cat.");
            }
        }
    }
}
