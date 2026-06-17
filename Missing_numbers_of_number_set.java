import java.util.Scanner;

public class Missing_numbers_of_number_set {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your lenght: ");

        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter Your elements: ");

        for (int i = 0; i < len; i++) {
            int in = sc.nextInt();

            arr[i] = in;

        }

        System.out.print("Missing elements are: ");

        for (int i = 0; i < arr.length - 1; i++) {
            int current = arr[i];

            while (current + 1 < arr[i + 1]) {
                System.out.print((current + 1) + " ");
                current++;
            }
        }

    }
}
