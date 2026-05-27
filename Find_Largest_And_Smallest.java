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

        // Arrays.sort(arr);

        int max = arr[0];
        int min = arr[0];

        for(int i = 1 ; i<size; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        for(int i = 1 ; i<size; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Smallest element is: ");
        System.out.println(min);
        System.out.println("\nlargest element is: ");
        System.out.println(max);
    }
}
