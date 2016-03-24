import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class _06_ConvertFromBase7toDecimal {
    public static void main(String[] args) {
        Scanner base7 = new Scanner(System.in);
        String number = base7.next();

        int baseToDecimal = Integer.valueOf(number, 7);

        System.out.println(baseToDecimal);
    }
}
