import java.util.*;

public class Strings {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.print("Please enter your name.\nFirst name: ");
        String firstName = scanner.nextLine();

        System.out.print("Middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Last name: ");
        String lastName = scanner.nextLine();

        System.out.println("Suffix: ");
        String suffix = scanner.nextLine();

        System.out.print("Full name: ");
        if (suffix.trim().equalsIgnoreCase("")){
            System.out.print(firstName.trim() + " " + middleName.trim() + " " + lastName.trim());
        }
        else if (middleName.trim().equalsIgnoreCase("")){
            System.out.print(firstName.trim() + " " + " " + lastName.trim() + ", " + suffix);}
        else if (middleName.trim().equalsIgnoreCase("") && suffix.trim().equalsIgnoreCase("")){
            System.out.print(firstName.trim() + " " + lastName.trim());}
        else {
            System.out.print(firstName.trim() + " " + middleName.trim() + " " + lastName.trim() + ", " + suffix);
        }

    }
}
