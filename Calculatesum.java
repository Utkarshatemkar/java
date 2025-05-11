import java.util.*;

public class Calculatesum {
    public static int calculate(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] ars) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculate(a, b);
        System.out.println("your sum is:" + sum);
    }
}