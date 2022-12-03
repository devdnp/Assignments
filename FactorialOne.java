public class FactorialOne {
    public static void main(String[] args) {
        int num = 5, fact = 1;

        if (num==0) {
            fact = 1;
        }else if (num<0) {
            System.out.println("Invlid input");
            return;
        }else{
            for (int i = 1; i <= 5; i++) {
            fact = fact*i;
        }
    }
        
        System.out.println(fact);
    }
}
