import java.util.ArrayList;

public class YvzSol {
    public static void main(String[] args) {

        String word = "adem";
        String word1 = "";
        ArrayList<String> box = new ArrayList<>();

        for (int i = 0; i < word.length(); i++) {

            for (int j = 0; j < word.length(); j++) {
                if (!word1.contains(word.substring(j,j+1)))
                    word1+=word.substring(j,j+1);
                if (word1.length()==word.length() && !box.contains(word1)){
                    box.add(word1);
                    System.out.println(word1);
                    if (!box.contains(reverse(word1))){
                        box.add(reverse(word1));
                        System.out.println(reverse(word1));
                    }word1="";
                }
                if (box.contains(word1)){
                    word1="";
                }
                for (int k = 0; k < word.length(); k++) {
                    if (!word1.contains(word.substring(k,k+1))){
                        word1+=word.substring(k,k+1);}
                    if (word1.length()==word.length() && !box.contains(word1)){
                        box.add(word1);
                        System.out.println(word1);
                        if (!box.contains(reverse(word1))){
                            box.add(reverse(word1));
                            System.out.println(reverse(word1));
                        }word1="";
                    }if (box.contains(word1)){
                        word1="";
                    }

                }

            }

        }

    }
    public static String reverse(String str){
        String reversWord = "";

        for (int x = 0; x < str.length(); x++) {
            reversWord += str.substring(str.length() - (x + 1), str.length() - (x));
        }
        return reversWord;
    }
}
