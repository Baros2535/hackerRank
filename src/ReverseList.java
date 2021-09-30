import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {

    public static void main(String[] args) {
        List<String> list= Arrays.asList("barış","ali","veli","erhan");
       //Collections.reverse(list);
        System.out.println("list = " + list);
        List<String > re=  reverse(list);
        System.out.println("re = " + re);

    }

    private static List<String> reverse(List<String> list) {
       List<String> dumy=new ArrayList<>();

       for (int i = list.size() -1; i >=0; i--) {
             dumy.add(list.get(i));

        }
       return dumy;
    }
}
