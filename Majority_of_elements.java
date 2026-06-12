import java.util.Scanner;

public class Majority_of_elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your lenght: ");

        int len = sc.nextInt();

        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            int in = sc.nextInt();

            arr[i] = in;

        }

        int fre = 0;
        int max = arr[0];

        for (int i = 0 ; i < len ; i++){
            int count = 0;

            for(int j = 0 ; j < len ; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(fre<count){
                fre = count;
                max = arr[i];
            }
        }

        System.out.println("frequency of repeating element is: " + fre);
        System.out.println("max repeating element is: " + max);

        
    }
}
