import java.util.Scanner;

public class First_Longest_nonrepeated_Substring {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input: ");

        String str = sc.nextLine();

        String str1 = "";

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (str1.indexOf(current) == -1) {
                break;
            }
            str1 = str1 + current;

        }

        System.out.println(str1);
    }
}
