import java.util.Scanner;

public class First_non_repeated_char {

    public static void main(String[] args) {
        //find the first non repeated character in a given string

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter input: ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (str.indexOf(current) == str.lastIndexOf(current)) {
                System.out.println("First non repeated character: " + current);
                break;
            }
        }
    }
}