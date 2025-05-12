import java.util.*;

public class Votelegebility {
    public static void eligibleage(int age) {
        if (age > 18) {
            System.out.print("you are eligible to vote");
        } else {
            System.out.print("you are not eligible to vote");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        eligibleage(age);
    }
}