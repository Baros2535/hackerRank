import java.util.Scanner;

public class InterviewTask1 {
    /*
    * palindrom string
    * abba
    *
    * abdfba
    * df
    *
    * not poosible
    *
    *
    *
    * */


    public static String reverse(String str){
        String reverseStr="";
        for (int i = str.length()-1; i >=0 ; i--) {

            reverseStr+=str.charAt(i);
        }
        return reverseStr;
    }

    public static boolean isPalindrom(String str) {
        if (str.equals(reverse(str))){
            return true;
        }else{
            return false;
        }
    }

    public static String challengingStrig(String str){
        String filteredStringStr="";
        if (isPalindrom(str)){
            return "palindrome";
        }else{
            filteredStringStr= filteredString(str);
        }
        if (filteredStringStr.equals(str)){
            return "not possible";
        }else
        {
            return filteredStringStr;
        }

    }
    public static String filteredString(String str) {
        String garbage="";
        String filtred="";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==str.charAt(str.length()-(i+1))){
             filtred+=str.charAt(i);
            }else{
                garbage+=str.charAt(i);
            }
        }
        if (isPalindrom(filtred)){
            return garbage;
        }else{
            return "not possible";
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println(challengingStrig(scanner.next()));

    }

}
/**
 * asa
 *
 * asdfsa
 *
 *
 * abfb
 * d
 *
 *
 *
 *
 *
 *
 */
