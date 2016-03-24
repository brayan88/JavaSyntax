import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class _04_CalculateExpression {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        double a = numbers.nextDouble();
        double b = numbers.nextDouble();
        double c = numbers.nextDouble();

        double formula1 = Math.pow(((Math.pow(a,2)+Math.pow(b,2))/(Math.pow(a,2)-Math.pow(b,2))),(a+b+c)/Math.sqrt(c));
        System.out.printf("%.2f",formula1);
        System.out.println();

        double formula2 = Math.pow((Math.pow(a,2)+(Math.pow(b,2)-Math.pow(c,3))),a-b);

        System.out.printf("%.2f",formula2);
        System.out.println();

        double diffence = Math.abs(findAverageOfThree(a,b,c)-findAverageOfTwo(formula1,formula2));
        System.out.printf("%.2f",diffence);


    }
    private static Double findAverageOfThree(Double a, Double b, Double c) {
        Double average = (a+b+c)/3;
        return average;

    }
    private static Double findAverageOfTwo(Double a, Double b) {
        Double average = (a+b)/2;
        return average;

    }




}
