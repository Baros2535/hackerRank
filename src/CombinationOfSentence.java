import java.util.*;


public class CombinationOfSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enters your sentence: ");
        String str = scanner.nextLine();
        List<String> listOfSentence = combinationOfSentence(str);
        System.out.println("listOfSentence = " + listOfSentence);

    }

    private static List<String> combinationOfSentence(String str) {
        String [] words=str.split(" ");
       List<String> listOfWord=new ArrayList<>(Arrays.asList(words));
String indexOfWord="";
        for (int i = 0; i < words.length ; i++) {
            indexOfWord+=i;
        }
        List<String> strings = combinationOfWord(indexOfWord);
 String sentence="";
 List<String> listOfSentence=new ArrayList<>();

        for (int i = 0; i <strings.size() ; i++) {
            for (int j = 0; j < words.length; j++) {
              sentence+= listOfWord.get(Integer.parseInt(""+strings.get(i).charAt(j))) +" ";
            }
            if(!listOfSentence.contains(sentence)){
                listOfSentence.add(sentence);
            }
            sentence="";
        }
      return listOfSentence;
    }


    public static List<String> combinationOfWord(String str) {
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
     return words;

    }

    public static int sizeOfList(String str) {
        String s = frequencyOfChars(str);
        int result=factorial(str.length());
        for (int i = 1; i <s.length() ; i=i+2) {
            result=result/factorial(Integer.parseInt(""+s.charAt(i)));
        }
        return result;
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


    public static int factorial(int number){
        int i,fact=1;
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        return fact;

    }

}