package hcsin.loopsAndConditions;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Opdracht4 {
    void bubblesort(int cijfers[]){
        int n = cijfers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(cijfers[j] > cijfers[j + 1]){
                    int temp = cijfers[j];
                    cijfers[j] = cijfers[j + 1];
                    cijfers[j + 1 ] = temp;
                }
            }
        }
    }

    void printArr(int cijfers[]){
        int n = cijfers.length;
        for (int i = 0; i < n; i++) {
            System.out.println(cijfers[i]);
        }
    }
    public static void main(String[] args) {
        Opdracht4 opdracht4 = new Opdracht4();
        int cijfers[] = {2, 7, 5, 10, 4, 9, 3, 1, 8, 6};
        opdracht4.bubblesort(cijfers);
        opdracht4.printArr(cijfers);

    }
}
