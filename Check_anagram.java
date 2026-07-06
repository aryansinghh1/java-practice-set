
import java.util.Arrays;

public class Check_anagram {
    public static void anagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr2);

        if (arr1.length != arr2.length) {
            System.out.print("Its not anagram");
        } else {

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    System.out.println("Its not anagram");
                    break;
                }

            }
            System.out.println("Its anagram");
        }

    }

    public static void main(String[] args) {

        anagram("aryan", "nayar");
    }
}
