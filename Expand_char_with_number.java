
import java.util.Scanner;


public class Expand_char_with_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your stirng: ");

        String str = sc.nextLine();

        

        for(int i = 0 ; i < str.length(); i++){

            if(Character.isLetter(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else if(Character.isDigit(str.charAt(i))){

                int num = Integer.parseInt(String.valueOf(str.charAt(i)));

                for(int j = 0 ; j < num ; j++){
                    System.out.print(str.charAt(i-1));
                }

                
            }
        }

    }
}
