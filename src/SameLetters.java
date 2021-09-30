import java.util.*;

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

        removeDup("AAABBBCCC");
        System.out.println("reverse(\"ABCD\") = " + reverse("ABCD"));
        System.out.println("unique(\"AAABBBCCCDEF\") = " + unique("AAABBBCCCDEF"));

    }

    //string reverse eden kod
    private static String reverse(String string) {
       //Collection kullanarak reverse
        List<String> strings = Arrays.asList(string.split(""));
        Collections.reverse(strings);

        System.out.println("string = " + strings);
        String dummy="";
        for (int i = 0; i < string.length(); i++) {
            dummy+=string.charAt(string.length()-i-1);
        }

return dummy;
    }

    //unıque değerleri bulan method
    private static String unique(String string1) {
        String result="";
        Map<String, Integer> stringIntegerMap = fruqencyOfchars(string1);
        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
            if (entry.getValue()==1){
                result+=entry.getKey()+" ";
            }

        }
return result;
    }

    //tekrar eden karekterleri atan kod
    private static void removeDup(String string1) {
        System.out.println("fruqencyOfchars(string1) = " + fruqencyOfchars(string1));
        System.out.println("fruqencyOfchars(string1).keySet() = " + fruqencyOfchars(string1).keySet());
    }

    // stringin aynı harflerden oluşup oluşmadığını kontrol eden kod
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
// harflerin ne kadar sıklıkta kullandığını bulan kod
    public static  Map<String,Integer>fruqencyOfchars(String input) {
        String[] split = input.toLowerCase().split("");

        Map<String,Integer> fruq=new LinkedHashMap<>();
        Map<String,Integer> fruqMethod=new LinkedHashMap<>();

        for (String s : split) {
        // Collections interface ine ait kod parçacığı
            fruq.put(s.toLowerCase(), Collections.frequency(Arrays.asList(split),s));
        }

        for (String s : split) {
            fruqMethod.put(s.toLowerCase(), fruqency(s,split));
        }

       return fruqMethod;

    }


    //dizideki harflerin frekansını bulan method
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