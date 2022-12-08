import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class AscndDcscnd {
    public static void main(String[] args) throws IOException {
        int[] arr = {9,5,11,3,7,4,0,1,21,16,8,0};

//        System.out.print("Enter 1 for ascending OR 2 for descending : ");
        System.out.print("Enter 'ascending' or 'descending' as per desired output: ");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
//        int sort = Integer.parseInt(input.readLine());
        String sort = input.readLine();
        switch (sort){
            case "ascending":
//            case 1:
            ascending(arr);
            break;
            case "descending":
//            case 2:
            descending(arr);
            default:
                System.out.println("Try again using valid input.");
        }

    }
    static void ascending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
            System.out.println(Arrays.toString(arr));
    }
    static void descending(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
