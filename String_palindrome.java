import java.util.Scanner;

public class String_palindrome {
    public static void main(String[] args) {
        //String palindrome

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your String: ");
        
        String str = sc.nextLine();
        
        String pal = "";

        for (int i = str.length() -1 ; i>=0 ; i--){
            pal += str.charAt(i);
        }

        if(str.equals(pal)){
            System.out.println("Palindrome");
            
        }else{
            System.out.println("NOT Palindrome");

        }



    }
}
