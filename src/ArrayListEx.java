import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>(Arrays.asList("Barış","Ali","Ali","barış"));
        System.out.println("list.size() = " + list.size());
        System.out.println("list.stream().distinct().count() = " + list.stream().distinct().count());

    }
}
