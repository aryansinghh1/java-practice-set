import java.util.Scanner;
public class Practice{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter input: ");

        String str = sc.nextLine();

        char ch;

        for(int i = 0 ; i < str.length(); i++){
            char current = str.charAt(i);

            if(str.indexOf(current) == -1){
                ch = current;
            }
        }

        System.out.println(ch);


    }
}