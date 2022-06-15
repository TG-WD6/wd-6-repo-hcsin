package hcsin.loopsAndConditions;

public class Opdracht2 {
    public static void main(String[] args) {
        int b = 6;
        int a = 3;

        boolean sum1 = !(a == 7 && (b >= a || a != a));
        System.out.println(sum1);
        boolean sum2 = a == b || !( b > 3 );
        System.out.println(sum2);
        boolean sum3 = !(b <= a && b != a +b);
        System.out.println(sum3);

    }
}
