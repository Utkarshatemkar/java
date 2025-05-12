import java.util.*;

public class Findevenodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("you are adult now");
        } else {
            System.out.println("you are not adult");
        }
        // check odd or even
        int x = sc.nextInt();
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("a is equal to b");
        } else if (a > b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("a is less than b");
        }
    }
}