//demo 4.1
/* write method that gets two 2D-matrices as parameters,
and return a new matrix that has larger numbers of the two in it */

import java.util.Random;
import java.util.Arrays;

class LargerComboMatrix {
    public static void main(String[] args) {
        int[][] a = generateMatrix();
        int[][] b = generateMatrix();
        System.out.println("Matrix one:\n"
            +Arrays.deepToString(a));
        System.out.println("Matrix two:\n"
            +Arrays.deepToString(b));
        System.out.println("Combined matrix with larger of each in it:\n"
            +Arrays.deepToString(mergeMatrix(a,b)));
    }

    public static int[][] generateMatrix() {
        Random rnd = new Random();
        int [][] m = new int[5][5];
        for(int i = 0; i < m.length; i++) {
            for(int j=0; j < m[i].length; j++) {
                m[i][j] = rnd.nextInt(9)+1;    
            }
        }
        return m;
    }

    public static int[][] mergeMatrix(int[][] a, int[][] b) { //int[i][j]
        int[][] c;
        if(a.length >= b.length) {
            c = new int[a.length][a[0].length];    
        } else {
            c = new int[b.length][b[0].length];
        }
        for(int i=0; i < c.length; i++) {
            for(int j=0; j < c[i].length; j++) {
                c[i][j] = (a[i][j] > b[i][j]) ? a[i][j] : b[i][j];
            }
        }
        return c;
    }
}