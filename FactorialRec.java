public class FactorialRec {
    public static void main(String[] args) {
        int num = 7, fact=1;
        if(num==0 || num==1){
            fact = 1;
        }else if(num<0){
            fact = -1;
        }
        else{fact = factNum(num);}
        System.out.println(fact);
    }
    static int factNum(int n){
        int factorial = 1;
            do{
            factorial = factorial*n;
            n--;
            }while(n>1);
        return factorial;
    }
}
