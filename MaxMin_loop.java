
import java.util.*;

public class MaxMin_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numb[] = new int[size];

        // input
        for (int i = 0; i < size; i++) {
            numb[i] = sc.nextInt();
        }

        // output
        // for(int i=0; i<names.length; i++) {
        // System.out.println("name " + (i+1) +" is : " + names[i]);
        // }
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < numb.length; i++) {
            if (numb[i] < min) {
                min = numb[i];
            }
            if (numb[i] > max) {
                max = numb[i];
            }
            System.out.println("Largest number is : " + max);
            System.out.println("Smallest number is : " + min);

        }
    }
}
