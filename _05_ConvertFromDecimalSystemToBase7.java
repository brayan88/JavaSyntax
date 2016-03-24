import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class _05_ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int number = a.nextInt();

      String base7 = Integer.toString(number,7);
        System.out.println(base7);

    }
}
