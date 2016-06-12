/* Demo 4.4
   Write method that receives integer array and returns array,
   where all duplicates are removed like (1 3 4 2 3 1 2) => (1 3 4 2) */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

class DuplicateRemover {
    public static void main(String[] args) {
        int[] test = [1,2,1,2,3,4,2,4,3,5,6,3,4,5,2,7,2,5,5,6];
    }

    //vitun vaikeaa, ei saisi sorttaa
    public static int[] duperaser(int[] arr) {
        //uusi arraylista johon tallennetaan luvut
        ArrayList<Integer> tmparr = new ArrayList<Integer>();
        for(int i : arr) {
            for(int j : tmparr) {
                if(i == j) {
                    break;
                }
                tmparr.add(i);
            }
        }
    }
}
