package hcsin.loopsAndConditions;

public class Opdracht1_6 {
    public static void main(String[] args) {
        String dayOfTheWeek = "zaterdag";
        switch (dayOfTheWeek){
            case "maandag":
                System.out.println("Today is sunny " + dayOfTheWeek);
                break;
            case "dinsdag":
                System.out.println("Today is rainy " + dayOfTheWeek);
                break;
            case "woensdag":
                System.out.println("Today is cloudy " + dayOfTheWeek);
                break;
            case "Donderdag":
                System.out.println("Today is stormy" + dayOfTheWeek);
                break;
            case "vrijdag":
                System.out.println("It's almost weekend");
                break;
            case "zaterdag":
                System.out.println("Today is busy " + dayOfTheWeek);
                break;
            case "zondag":
                System.out.println("Today is lazy " + dayOfTheWeek);
                break;
            default:
                System.out.println("It is just a beautifull day.");
                break;
        }
    }
}
