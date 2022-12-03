public class AgeGroup {
    public static void main(String[] args) {
        int age = 80;

        if (age<0) {
            System.out.println("Invalid input!");
        } else if(age>=0 && age<=3){
            System.out.println("Toddlers");
        }else if(age>=4 && age<=8){
            System.out.println("Kids");
        }else if(age>=9 && age<=12){
            System.out.println("Child");
        }else if(age>=13 && age<=18){
            System.out.println("Teens");
        }else if(age>=19 && age<=40){
            System.out.println("Adults");
        }else if(age>=41 && age<=60){
            System.out.println("MAtured Adults");
        }else if(age>=61 && age<=75){
            System.out.println("Seniors");
        }else{
            System.out.println("Super Seniors");
        }
    }
}
