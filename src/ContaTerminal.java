import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        String clientName;
        String agency;
        int accountNumber;
        double accountBalance;

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("What is you name?");
        clientName = scanner.next();
        System.out.println("Enter the agency number: (000-0)");
        agency = scanner.next();
        System.out.println("Enter the account number: (0000)");
        accountNumber = scanner.nextInt();
        System.out.println("What is your account balance? (000.00)");
        accountBalance = scanner.nextDouble();

        System.out.println("Hello ".concat(clientName + ", thank you for creating an account with our bank, your branch is ") + agency + ", account " + accountNumber + " nd your balance of $" + accountBalance + " is now available for withdrawal.");
    }
}