import java.util.Scanner;

public class Largest_Word_In_a_Sentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Sentence: ");
        String str = sc.nextLine();

        String[] arr = str.split(" ");

        String large = " ";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > large.length()) {
                large = arr[i];
                
                
            }
        }
        System.out.println(large);


    }
}
