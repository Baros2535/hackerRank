public class InterviewTask2 {

    /**
     * abcb
     * ccb
     * ca
     * b
     * 1
     *
     * ababcc
     * cabcc
     * bbcc
     * bac
     * cc
     * 2
     *
     *
     *
     * */

    public static void main(String[] args) {
        String str="ccccc";
        String a=compare(str);
        System.out.println(a);
    }

    private static String compare(String str) {
        String str2="";
           if(checkString(str)){
               return str.length()+"";
           }
        for (int i = 0; i < str.length()-2; i++) {

            if ((str.charAt(i)=='a'&str.charAt(i+1)=='b')||(str.charAt(i)=='b'&str.charAt(i+1)=='a')){
                str2="c"+str.substring(i+2);
                compare(str2);

            }
            else if ((str.charAt(i)=='a'&str.charAt(i+1)=='c')||(str.charAt(i)=='c'&str.charAt(i+1)=='a')){
                str2="b"+str.substring(i+2);

                compare(str2);
            }
           else if ((str.charAt(i)=='c'&str.charAt(i+1)=='b')||(str.charAt(i)=='b'&str.charAt(i+1)=='c')){
                str2="a"+str.substring(i+2);

                 compare(str2);
            }

        }

        return str2.length()-1 +"";

    }


    public static boolean checkString(String  str){
       Boolean flag=false;
        for (int i = 0; i < str.length()-1; i++) {
            if (str.charAt(i)==str.charAt(i+1)){
                flag= true;
            } else
            {
                flag= false;
            }

        }
        return flag;
    }
    /**
     * ccba
     * caa
     * ba
     * c
     *
     * */


}
