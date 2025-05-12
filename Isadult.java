import java.util.*;

/*A conditional statement is a programming construct that allows a program to make decisions based on certain conditions. 
It executes different blocks of code depending on whether a condition is true or false.
Common types:
if statement – Executes code if a condition is true.
if-else statement – Executes one block if the condition is true, another if false.
if-else if-else ladder – Tests multiple conditions in sequence.
switch-case – Selects code to execute from many options based on a variable’s value. */
public class Isadult {
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