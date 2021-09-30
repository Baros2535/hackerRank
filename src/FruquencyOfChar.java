import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FruquencyOfChar {
    public static void main(String[] args) {
      String  input="Aaaaabbbbcccddd";

      fruqencyOfchars(input);
    }

    public static void fruqencyOfchars(String input) {
        String[] split = input.toLowerCase().split("");

        Map<String,Integer> fruq=new LinkedHashMap<>();
        Map<String,Integer> fruqMethod=new LinkedHashMap<>();

        for (String s : split) {

            fruq.put(s.toLowerCase(), Collections.frequency(Arrays.asList(split),s));
        }

        for (String s : split) {
            fruqMethod.put(s.toLowerCase(), fruqency(s,split));
        }
        System.out.println("fruq = " + fruq);
        System.out.println("fruqMethod = " + fruqMethod);


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
