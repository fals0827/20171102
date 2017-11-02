import java.util.Scanner;

public class t2 {
    //平年閏年判斷
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a =scn.nextInt();
        if (a%4==0){
            if (a%100==0){
                if (a%400==0){
                    System.out.println("Bissextile Year");
                }else{
                    System.out.println("Common Year");
                }
            }else {
                System.out.println("Bissextile Year");
            }
        }else {
            System.out.println("Common Year");
        }
    }

}
