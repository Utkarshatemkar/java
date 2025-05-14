public class ope3 {
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        // Relational operators
        System.out.println("Is age greater than 18? " + (age > 18));
        System.out.println("Is age equal to 25? " + (age == 25));

        // Logical operators
        boolean canDrive = (age >= 18) && hasLicense;
        System.out.println("Is the person eligible to drive? " + canDrive);

        boolean needsLicense = !hasLicense;
        System.out.println("Does the person need a license? " + needsLicense);
    }
}
