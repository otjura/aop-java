/* Demo 4.2
   Write method that returns new int array from parametre array,
   where primitives are sorted from largest to smallest,
   write sorter self without using inbuilt methods. */

import java.util.Random;
import java.util.Arrays;

class ArraySorter {
    public static void main(String[] args) {
        int[] a = randomArray();
        System.out.println("Array: "+Arrays.toString(a));
        System.out.println("Sorted: "+Arrays.toString(bubblesort(a)));
    }

    public static int[] bubblesort(int[] a) {
        int[] arr = new int[a.length];
        for(int i=0; i < arr.length; i++) {
            arr[i] = a[i];
        }

        int tmp = 0;
        for(int i=0; i < arr.length-1; i++) {
            for(int j=1; j < arr.length-i; j++) {
                if(arr[j-1] < arr[j]) {
                    tmp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        return arr;
    }

    public static int[] randomArray() {
        Random rnd = new Random();
        int[] arr = new int[10];
        for(int i=0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(19)+1;
        }
        return arr;
    }
}