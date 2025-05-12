
import java.util.*;

public class FindMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("january");
        } else if (a == 2) {
            System.out.println("february");
        } else if (a == 3) {
            System.out.println("march");
        } else if (a == 4) {
            System.out.println("september");
        } else {
            System.out.println("december");
        }
    }

}
