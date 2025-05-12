
/*A loop is a control structure used to execute a block of code repeatedly as long as a 
given condition is true. It helps in performing repetitive tasks efficiently, reducing the 
need to write the same code multiple times.
Types of Loops:
for loop – Used when the number of iterations is known.
while loop – Used when the number of iterations is not known in advance, and depends on a condition.
do-while loop – Similar to a while loop, but guarantees at least one execution of the code block. */
import java.util.*;

public class Evenloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
