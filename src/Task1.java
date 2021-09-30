import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task1 {

        // Function to find the smallest positive missing integer
        static int findSmallestPositiveMissingInteger(int[] A){
            Arrays.sort(A);
            int i,j = 1;
            for(i = 0; i<A.length; i++){
                if(A[i] == j){
                    j++;
                }
            }

            return j;
        }



        // Function to read input and display the output
        public static void main(String[] args) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int size;
            System.out.println("Enter the size of the array");
            try {
                size = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("Invalid Input");
                return;
            }
            int[] array = new int[size];
            System.out.println("Enter array elements");
            int i;
            for (i = 0; i < array.length; i++) {
                try {
                    array[i] = Integer.parseInt(br.readLine());
                } catch (Exception e) {
                    System.out.println("An error occurred");
                    return;
                }
            }
            int missing = findSmallestPositiveMissingInteger(array);
            System.out.println("The smallest positive missing integer is " + missing);
        }
    }