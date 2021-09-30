public class LoopExam {
    public static void main(String[] args) {

     String str="";
        for ( int i = 1; i < 6; i++) {

            str+=i+"," ;

        }
        System.out.println(str.substring(0,str.length()-1));
    }
}
