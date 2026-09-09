public class Practice {
    public static void main(String[] args) {

        // Rotate elements by k

        int[] arr = { 5, 3, 4, 2, 1 };
        int k = 0;
        int n = 4;

        while(k<n){
        int temp = arr[k];
        arr[k] = arr[n];
        arr[n] = temp;
        k++;
        n--;
        }

        for(int i = 0 ; i < arr.length ; i++){
        System.out.print(arr[i] + " ");
        }
    }
}
