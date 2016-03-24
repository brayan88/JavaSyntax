import java.util.Scanner;

/**
 * Created by Admin on 22.3.2016 г..
 */
public class _11_GetFirstOddOrEvenElements {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String command1 = scan.nextLine();
        String get =scan.next("\\w+");
        int command2 = scan.nextInt();
        String oddOrEven =scan.next("\\w+");

        System.out.println(firstOddEvenEl(command1,command2,oddOrEven));
    }
    private static String firstOddEvenEl (String command1,Integer command2,String oddOrEven){
        String[] numbers =command1.split(" ");
        String odd ="odd";
        String even ="even";
        int digit;
        int counter=0;
        String result ="";

        for (int i = 0; i <numbers.length ; i++) {
            digit =0;
            digit = Integer.parseInt(numbers[i]);
            if (oddOrEven.equals(odd)&&digit%2!=0){
                counter++;
                if (counter<=command2) {
                    result+=Integer.toString(digit)+" ";
                }
                else {
                    break;
                }
            }
            else if (oddOrEven.equals(even) && digit % 2 == 0) {
                    counter++;
                    if (counter <= command2) {
                        result+= (Integer.toString(digit))+" ";

                    }
                    else {
                        break;
                    }
                }
            else {
                continue;
            }

        }
        return result;
    }

}
