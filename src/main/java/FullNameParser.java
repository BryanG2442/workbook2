import java.util.Scanner;

public class FullNameParser {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.print("Please input your full name: ");
        String fullname = scanner.nextLine();

        String[] names = fullname.split(" ");
        if (names.length == 3) {
            System.out.println("First name: " + names[0] + "\nMiddle Name: " + names[1] + "\n Last Name: " + names[2]);
        }

        else {
            System.out.println("First name: " + names[0] + "\nMiddle Name: (None)"  + "\nLast Name: " + names[1]);
        }

    }
}
