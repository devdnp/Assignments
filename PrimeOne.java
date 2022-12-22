public class PrimeOne {
    public static void main(String[] args) {
        int num = -12;

        if(num==0 || num==1){
            System.out.println("Neither prime nor composite.");
        }else if(num<0){
            num=num*(-1);
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                System.out.println(num+" is NOT a prime number.");
                return;
            }else{
                System.out.println(num +" is a Prime number.");
                return;
            }
        }
    }
}
