/* Demo 2.6
   print fibonacci series of length of given integer */
import java.util.Scanner;

class FibonacciFun {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int a = 1;
        int b = 0;
        int c = 0;
        for(int i = 0; i < x; i++) {
            System.out.println(a);
            b = a; 
            a = b + c;      
            c = b;
        }
    }
}