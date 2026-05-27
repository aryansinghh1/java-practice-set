import java.util.*;

public class Find_Largest_And_Smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array; \n");
        int size = sc.nextInt();

        System.out.print("Enter your elements: \n");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();

            arr[i] = num;
        }

        Arrays.sort(arr);

        System.out.println("Smallest element is: ");
        System.out.println(arr[0]);
        System.out.println("\nlargest element is: ");
        System.out.println(arr[size -1]);
    }
}
