import java.util.Scanner;

public class getCharIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scan.next();
        System.out.println("Enter the character to find in the string: ");
        char ch1 = scan.next().charAt(0);
        boolean flag = false;

        if(str.length()==0 || str==null) {
            System.out.println("Enter something...");
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            if(ch1==(str.charAt(i))){
                System.out.println("Position of "+ch1+" is: "+(i+1)+" from left & "+(str.length()-i)+" from right.");
                flag=true;
            }
        }
        if(flag==false)
            System.out.println("Enter valid character !!");
    }
}
