//demo 2.1 
//prints stylized multiplication table of ints n and m
import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number to multiply: ");
        int n = sc.nextInt();
        System.out.print("multiply until: ");
        int m = sc.nextInt();
        sc.close();
        for(int i=1; i <= m; i++) {
            System.out.println(i+" x "+n+" = "+(i*n));
        }
    }
}