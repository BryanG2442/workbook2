import java.util.Scanner;


public class AddressBuilder {
    static Scanner scanner = new Scanner(System.in);

    static public void main (String[] args) {
        System.out.println("Please provide the following information: ");
        System.out.print("Full Name: ");
        String name = scanner.nextLine();

        System.out.print("\nBilling Street: ");
        StringBuilder billingAddressLine1 = new StringBuilder();
        billingAddressLine1.append(scanner.nextLine());

        System.out.print("Billing City: ");
        billingAddressLine1.append("\n").append(scanner.nextLine());

        System.out.print("Billing State: ");
        billingAddressLine1.append(" ").append(scanner.nextLine());

        System.out.print("Billing ZIP Code: ");
        billingAddressLine1.append(", ").append(scanner.nextLine());

        ////
        System.out.print("\nShipping Street: ");
        StringBuilder shippingAddressLine1 = new StringBuilder();
        shippingAddressLine1.append(scanner.nextLine());

        System.out.print("Shipping City: ");
        shippingAddressLine1.append("\n").append(scanner.nextLine());

        System.out.print("Shipping State: ");
        shippingAddressLine1.append(" ").append(scanner.nextLine());

        System.out.print("Shipping ZIP Code: ");
        shippingAddressLine1.append(", ").append(scanner.nextLine());


        System.out.println(name + "\n\nBilling Address:\n" + billingAddressLine1.toString() + "\n\nShipping Address:\n" + shippingAddressLine1.toString());


    }
}
