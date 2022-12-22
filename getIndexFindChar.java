import java.util.Scanner;

public class getIndexFindChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.next();
        System.out.println("Enter the index for character: ");
        int index = scan.nextInt();
        boolean flag = false;

        for (int i = 0; i < str.length(); i++) {
            if (index==i){
                System.out.println("Element at position "+index+" is: "+str.charAt(i));
                flag=true;
            }
        }
        if (flag==false){
            System.out.println("Enter valid index number !!");
        }
    }
}
