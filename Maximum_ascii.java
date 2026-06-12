import java.util.Scanner;

public class Maximum_ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String: ");
        String str = sc.nextLine();

        char max = str.charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) > max){
                max = str.charAt(i);
            }
        }

        System.out.print("max ascii: " + max);
    }
}
