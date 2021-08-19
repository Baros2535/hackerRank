import java.util.*;

public class InterviewSolution2 {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.print("Enters your word: ");
        String str = scanner.nextLine();
        combinationOfWord(str);
         }

    public static void combinationOfWord(String str) {
        String word = " ";
        List<String> words = new ArrayList<>(Arrays.asList(str));
        Random random=new Random();
        List<Integer> index=new ArrayList<>();
        int x=0;
        int sizeOfList = sizeOfList(str);
        while (words.size()!=sizeOfList) {
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
        System.out.println("combination of letter in  " + str );
        System.out.println(words);
        System.out.println(words.size());

    }

    private static int sizeOfList(String str) {
        String s = frequencyOfChars(str); //s=a2d1m1   5!/(2!*1!*1!)
       int result=factorial(str.length());
        for (int i = 1; i <s.length() ; i=i+2) {
            result=result/factorial(Integer.parseInt(""+s.charAt(i)));
        }
    return result;
    }

    public static int factorial(int number){
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;

    }

    public static String removeDuplicates(String str) {

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (!result.contains("" + str.charAt(i))) {
                result += str.charAt(i);
            }
        }

        return result;
    }

    public static int frequency(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    public static String frequencyOfChars(String str) {
        String nonDup = removeDuplicates(str);

        String result = "";

        for (int i = 0; i < nonDup.length(); i++) {
            int count = frequency(str, nonDup.charAt(i));
            result += nonDup.charAt(i) + "" + count;
        }
        return result;
    }


}
