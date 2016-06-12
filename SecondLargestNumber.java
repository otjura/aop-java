//demo 1.5
//ask three numbers and print the second largest
import java.util.Scanner;

class SecondLargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give first number: ");
        int a = sc.nextInt();
        System.out.print("give sencond number: ");
        int b = sc.nextInt();
        System.out.print("give third number: ");
        int c = sc.nextInt();
        sc.close();
        if(a == b && b == c) {
            System.out.println("all same");
        }
        if(a == b || b == c || a == c) {
            System.out.println("two sames");
        }
        if((b < a && a < c) || (c < a && a < b)) {
            System.out.println(a);
        }
        if((a < b && b < c) || (c < b && b < a)) {
            System.out.println(b);
        }
        if((a < c && c < b) || (b < c && c < a)) {
            System.out.println(c);
        }
    }
}