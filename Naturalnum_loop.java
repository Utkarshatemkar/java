import java.util.*;

public class Naturalnum_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        int num = sc.nextInt();
        for (int b = 1; b < 11; b++) {
            System.out.println(num * b);
        }

    }
}
