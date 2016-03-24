import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class _02_TriangleArea {
    public static void main(String[] args) {
        Scanner points = new Scanner(System.in);
        int cooAX = points.nextInt();
        int cooAY = points.nextInt();


        int cooBX = points.nextInt();
        int cooBY = points.nextInt();


        int cooCX = points.nextInt();
        int cooCY = points.nextInt();

        int area = Math.abs(cooAX*(cooBY-cooCY)+cooBX*(cooCY-cooAY)+cooCX*(cooAY-cooBY))/2;

        System.out.println(area);






    }
}
