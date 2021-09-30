import java.util.Arrays;

public class Solution {
    public  int solution (int [] A){
int countEven=0;
int countOdd=0;
        for (int a:A) {
            if (a%2==0){
                countEven ++;
            }
            if (a%2!=0){
                countOdd ++;
            }

        }

        if (countEven==A.length|| countOdd==A.length){
            Arrays.sort(A);
            return A[A.length-1];
        }


        int maxOdd=Integer.MIN_VALUE;
        int maxEven=Integer.MIN_VALUE;


        for (int i = 0; i < A.length; i++) {
           if (A[i]%2==0){

               if (A[i]>maxEven){

                   maxEven=A[i];
               }


           }

           else{
               if(A[i]>maxOdd){
                   maxOdd=A[i];
               }

           }

        }


        return (maxEven+maxOdd);


    }


    public static void main(String[] args) {
        int [] A={2,6,4,6};

        System.out.println("new Solution().solution(A) = " + new Solution().solution(A));

    }

}
