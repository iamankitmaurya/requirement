import java.util.Arrays;
import java.util.Scanner;

public class Assessment3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        System.out.println("The sorted array is: " + Arrays.toString(array));

        scanner.close();
    }
}
