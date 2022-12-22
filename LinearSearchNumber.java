import java.util.Scanner;

public class LinearSearchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of integers: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter all the numbers : ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if(search==arr[i])
                System.out.println(search+" exists in the list of numbers. ");
        }
    }
}
