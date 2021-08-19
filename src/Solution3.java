import java.util.Scanner;

public class Solution3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            for (int j = s1.length(); j <15 ; j++) {
                s1+=" ";
            }
            if (x<=9){
                System.out.println(s1+"00"+x);
            }
              else{
                if (x<100&&x>9)
                    System.out.println(s1+"0"+x);
                else
                    System.out.println(s1+""+x);

            }


        }
        System.out.println("================================");

    }
}