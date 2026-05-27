
import java.util.Scanner;

public class Last_Char_Of_each_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String: ");
        String str = sc.nextLine();

        String[] arr = str.split("\\s+");

        String last = "";
        for (int i = 0; i < arr.length; i++) {
            last += arr[i].charAt(arr[i].length() - 1);
        }

        System.out.println(last);

    }
}
