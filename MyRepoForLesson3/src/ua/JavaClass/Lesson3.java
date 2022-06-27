package ua.JavaClass;
import java.util.Arrays;

public class Lesson3 {
    public static void main(String[] args) {
        int[] array = new int[100];

        System.out.println("First Task: " + Arrays.toString(straightOrder(array)));
        System.out.println("Second Task: " + Arrays.toString(reversOrder(array)));
       jaggedArray();
    }

    public static int[] straightOrder(int[] arr) {
        int[] a = new int[arr.length]; //initializing the array
        for (int i = 0; i < a.length; i++) {  //filling the array in a straight order
            a[i] = i;
        }
        return a;
    }

    public static int[] reversOrder(int[] arr) {
        int[] a = new int[arr.length]; //initializing the array
        for (int i = arr.length - 1, j = 0; i > 0; i--, j++) { //filling the array in a revers order
            a[j] = i;
        }
        return a;
    }

    public static int[][] jaggedArray() {
        int [][] a = new int[5][];
        for(int i = 0; i < a.length; i++) { //creating +1 element in a row
            a[i] = new int[i + 1];
        }
        int value = 1; //initializing the array
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = value++;
            }
            }
        System.out.println("Third Task: "); //Printing the array
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j <a[i].length; j++){
                System.out.print(String.format("%4s", a[i][j]));
            }
            System.out.println();
        }
        return a;
    }
}
