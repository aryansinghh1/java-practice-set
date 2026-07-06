import java.util.Scanner;

public class Second_highest_element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter arr size");

        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("enter elements:");

        for (int i = 0; i < size; i++) {
            int in = sc.nextInt();
            arr[i] = in;
        }

        int lar = arr[0];
        int sclar = 0;

        for (int i = 0; i < size; i++) {
            if (lar < arr[i]) {
                sclar = lar;
                lar = arr[i];
            }
        }

        System.out.print("output is: " + sclar);

    }
}