// import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int a = 5;//scan.nextInt();
        
        if(a>0){
            System.out.println(a+" is a positive number.");
        }else if(a<0){
            System.out.println(a+" is a negative number.");
        }else{
            System.out.println(a+" is neither positive nor negative.");
        }
    }
}