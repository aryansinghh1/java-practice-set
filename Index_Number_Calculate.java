
import java.util.Scanner;

public class Index_Number_Calculate {
    public static void main(String [] args){

        //indexNumber_Calculate
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your input: ");
        
        String str = sc.nextLine();
        
        
        System.out.print("Enter your input: ");

        char ch = sc.next().charAt(0);

        int index = -1;

        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i) == ch){
                index = i;
                break;
            }
            
        }

        if(index != -1){
            System.out.println(index);
        }
        else{
            System.out.println("NA");
        }
       
        
    }
}
