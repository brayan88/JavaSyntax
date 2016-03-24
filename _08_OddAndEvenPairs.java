import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class _08_OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String read =  scan.nextLine();
        String [] numbers = read.split(" ");
        int counter =0;

       if (numbers.length%2==0){

           for (int i = 0; i < (numbers.length+1)/2; i++) {
               int sum =0;
               int digit=0;

               for (int j = 0; j <2 ; j++) {

                    digit=Integer.parseInt(numbers[counter+j]);
                    sum+=digit;

                   if (j<1) {

                       System.out.printf("%d" + ",", digit);
                   }
                   else {
                       System.out.printf("%d", digit);
                   }
               }
               counter+=2;
               if (sum%2==0){
                   if (digit%2==0){
                       System.out.print(" -> both are even");
                   }
                   else {
                       System.out.print(" -> both are odd");
                   }
               }
               else {
                   System.out.print(" -> different");
               }
               System.out.println();
           }
       }
        else {
           System.out.print("Invalid lenght");
       }
    }
}
