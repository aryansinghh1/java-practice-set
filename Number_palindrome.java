import java.util.Scanner;

public class Number_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number: ");

        int num = sc.nextInt();

        int num1 = num;

        int digit = String.valueOf(num1).length();
        int pal = 0;

        for (int i = 0; i < digit; i++) {
            pal *=10;
            int temp = num % 10;
            pal += temp;
            num = num / 10;
        }
        
        if (num1 == pal) {
            System.out.print("palindrome");
        } else {
            System.out.print("not palindrome");
        }
    }
}
