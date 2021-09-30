import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class SameLetters {


    /**
     * Write a return method that check if a string is build out of the same letters as another string.
     * Ex:  same("abc",  "cab"); -> true 
     * same("abc",  "abb"); -> false:
     */

    public static void main(String[] args) {
        System.out.println("same(\"abc\", \"caa\") = " + same("abc", "caa"));
        System.out.println("same(\"abs\",\"sba\") = " + same("abs", "sba"));
        System.out.println("same(\"Aab\",\"bAA\") = " + same("Aab", "bAA"));

    }

    private static boolean same(String string1, String string2) {
        fruqencyOfchars(string1);
        fruqencyOfchars(string2);
        if (fruqencyOfchars(string1).equals(fruqencyOfchars(string2))){
            return true;
        }
        else {
            return false;
        }

    }

    public static  Map<String,Integer>fruqencyOfchars(String input) {
        String[] split = input.toLowerCase().split("");

        Map<String,Integer> fruq=new LinkedHashMap<>();
        Map<String,Integer> fruqMethod=new LinkedHashMap<>();

        for (String s : split) {

            fruq.put(s.toLowerCase(), Collections.frequency(Arrays.asList(split),s));
        }

        for (String s : split) {
            fruqMethod.put(s.toLowerCase(), fruqency(s,split));
        }

       return fruqMethod;

    }

    public static int fruqency(String s,String[] array){
        int count=0;
        for (String a:array){
            if (a.equalsIgnoreCase(s)){
                count++;
            }

        }
        return count;



    }
}