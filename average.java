
import java.util.*;

public class Average {
    public static int avg(int a, int b, int c) {
        int sum = a + b + c;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = avg(a, b, c);
        System.out.print(sum / 3);
    }
}