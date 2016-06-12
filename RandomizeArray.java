//demo 4.3
/* write method that randomizes positions of integer array elements,
without returning new array. don't use inbuilt methods. */

import java.util.Random;
import java.util.Arrays;

class RandomizeArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
	System.out.println(Arrays.toString(arr));
        scramble(arr);
	System.out.println(Arrays.toString(arr));
    }

    //do not return new array, scramble in place
    //Fisher-Yates shuffle
    public static void scramble(int arr[]) {
	Random rnd = new Random();
        int random, tmp;
	for(int i = arr.length-1; i > 0; i--) {
	    random = rnd.nextInt(i+1);
	    tmp = arr[random];
            arr[random] = arr[i];
            arr[i] = tmp;
        }
    }
}
