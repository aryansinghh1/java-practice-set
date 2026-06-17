import java.util.Scanner;

public class Char_repeat_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string: ");

        String str = sc.nextLine().toLowerCase();

        // System.out.print(str);

        int[] arr = new int[26];

        for (int i = 0; i < str.length(); i++) {
            arr[str.charAt(i) - 'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {

                System.out.print((char) (i + 'a') + "" + arr[i]);
            }
        }

    }
}
