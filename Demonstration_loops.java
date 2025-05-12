import java.util.*;

public class Demonstration_loops {
    public static void main(String[] args) {

        System.out.println("For Loop:");
        for (int counter = 0; counter < 11; counter++) {
            System.out.print(counter + " ");
        }

        System.out.println("\n\nFor Loop (second):");
        for (int i = 0; i < 11; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhile Loop:");
        int a = 0;
        while (a < 11) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println("\n\nDo-While Loop:");
        int num = 0;
        do {
            System.out.print(num + " ");
            num++;
        } while (num < 4);
    }
}
