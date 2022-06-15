package hcsin.loopsAndConditions;

public class Opdracht3_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            if(i == 3){
                continue;
            }
            System.out.println(i + " = i ------------------");
            for (int j = 1; j <= 10; j++) {
                System.out.println(i * j);
            }
        }
    }
}
