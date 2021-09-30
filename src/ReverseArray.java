import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
        System.out.println("Arrays.toString(myArray) = " + Arrays.toString(myArray));

        String [] dumy=new String[myArray.length];

        for (int i = 0; i < myArray.length ; i++) {
            dumy[i]=myArray[myArray.length-i-1];
        }
        System.out.println("dumy = " + Arrays.toString(dumy));

        for (int i = 0,j=myArray.length-1; i < myArray.length/2; i++,j--) {

            if (i<j){
             String temp=myArray[i];
                myArray[i]=myArray[j];
                myArray[j]=temp;
            }


        }
        System.out.println("myArray = " + Arrays.toString(myArray));

    }
}
