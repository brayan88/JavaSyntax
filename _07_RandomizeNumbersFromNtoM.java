import java.util.Scanner;

/**
 * Created by Admin on 21.3.2016 г..
 */
public class _07_RandomizeNumbersFromNtoM {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int m = number.nextInt();





        if (n>m){


            for (int i = m; i <=n ; i++) {
                System.out.printf("%d"+" ",Math.round(Math.random()*((n-m)+1)+m));
            }

        }
        else if (m>n){
            for (int i = n; i <=m ; i++) {
                System.out.printf("%d"+" ",Math.round(Math.random()*((m-n)+1)+(n)));
            }

        }
        else {
            System.out.println(m);
        }
    }
}
