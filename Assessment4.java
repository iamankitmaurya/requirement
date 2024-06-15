
import java.util.HashMap;
import java.util.Scanner;

public class Assessment4 {
    public static void main(String[] args) {
        // Create a Scanner object for taking input from the user
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> map = new HashMap<>();

        System.out.print("Enter the number of key-value pairs you want to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key " + (i + 1) + ": ");
            String key = scanner.nextLine();

            System.out.print("Enter value " + (i + 1) + ": ");
            String value = scanner.nextLine();

            map.put(key, value);
        }

        System.out.println("The HashMap contains:");
        for (HashMap.Entry<String, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        scanner.close();
    }
}
