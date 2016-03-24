import java.util.Scanner;

/**
 * Created by Admin on 22.3.2016 г..
 */
public class _09_HitTheTarget {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int n = scnr.nextInt();
        int counter = 1;
        int result = 0;
        for (int o = 1; o <=20 ; o++) {
            for (int p =1 ; p <=20; p++) {
                result = 0;
                result = counter+p;
                if (result ==n){
                    System.out.printf("%d + %d = %d",counter,p,n);
                    System.out.println();
                 }
            }
            counter++;
        }
        counter=1;
        for (int i = 1; i <=20 ; i++) {

            for (int j = n+1; j <=20 ; j++) {
                result=0;
                result = j-counter;
                if (result==n){
                    System.out.printf("%d - %d = %d",j,counter,n);
                    System.out.println();
                }
                counter++;

            }
        }
    }
}
