import java.util.Scanner;

/**
 * Created by Admin on 22.3.2016 г..
 */
public class _10_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstStr = scnr.next("\\w+");
        String secondStr = scnr.next("\\w+");


        System.out.printf(characterMultiplier(firstStr,secondStr));

        
    }
    private static String characterMultiplier (String str1,String str2){
        int sum=0;
        if (str1.length()==str2.length()) {

            for (int i = 0; i <str1.length(); i++) {
                 sum += (str1.charAt(i)*str2.charAt(i));

            }
        }
        else if (str1.length()>str2.length()){

                for (int i = 0; i <str1.length() ; i++) {

                    if (i<str2.length()){
                        sum += (str1.charAt(i)*str2.charAt(i));
                    }
                    else {
                        sum+=str1.charAt(i);
                    }

                }

        }
        else{
            for (int i = 0; i <str2.length() ; i++) {

                if (i<str1.length()){
                    sum += (str1.charAt(i)*str2.charAt(i));
                }
                else {
                    sum+=str2.charAt(i);
                }

            }
        }
        String result = Integer.toString(sum);
        return result;
    }
}
