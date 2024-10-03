import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    static Scanner scanner = new Scanner(System.in);
    public static void main (String[] args) {
        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();


        System.out.println("What date will you be coming (MM/dd/yyyy): ");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(scanner.nextLine(), formatter);

        System.out.println("How many tickets would you like?");
        int tickets = scanner.nextInt();

        String[] names = fullName.split(" ");

        if (tickets < 2){
            System.out.println(tickets + "ticket reserved for date " + date + " under " + names[1] + ", " + names[0] + ".");
        }
        else {
            System.out.println(tickets + " tickets reserved for date " + date + " under " + names[1] + ", " + names[0] + ".");
        }

    }
}
