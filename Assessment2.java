import java.util.Scanner;

public class Assessment2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String upperCaseString = inputString.toUpperCase();

        System.out.println("The string in uppercase is: " + upperCaseString);

        scanner.close();
    }
}
