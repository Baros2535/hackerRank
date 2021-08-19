import java.util.*;

public class InterviewSolution {
    public static void main(String[] args) {
        String str = "aga";
        String word = " ";
        List<String> words = new ArrayList<>(Arrays.asList(str));
        Random random=new Random();
        List<Integer> index=new ArrayList<>();
        int x=0;
        while (words.size()!=factorial(str.length())) {
            word="";
            while (word.length()!=str.length()) {
                int b=random.nextInt(str.length());
            if (!index.contains(new Integer(b)))
            {
                word += ""+ str.charAt(b);
                index.add(new Integer(b));
            }
            }

           index.removeIf(p-> p<str.length());

         if (!words.contains(word)){
             words.add(word);
         }
        }
        System.out.println(words);

    }
    public static int factorial(int number){
    int i,fact=1;
    for(i=1;i<=number;i++){
        fact=fact*i;
 }
   return fact;

    }
}
