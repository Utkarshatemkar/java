import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your first number:");
        int a = sc.nextInt();
        System.out.println("enter your second number:");
        int b = sc.nextInt();
        System.out.println("enter your operation number:");
        char ope = sc.next().charAt(0);
        switch (ope) {
            case '+': {
                System.out.println(a + b);
                break;
            }
            case '-': {
                System.out.println(a - b);
                break;
            }
            case '*': {
                System.out.println(a * b);
                break;
            }
            case '/': {
                System.out.println(a / b);
            }
            default: {
                System.out.println(a % b);
            }
        }

    }
}
