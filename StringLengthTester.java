//demo 1.6
//ask string, print first middle last chars if odd length, print first last if even length
import java.util.Scanner;

class StringLengthTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("write a word: ");
        String s = sc.nextLine();
        sc.close();
        int x = s.length();
        if(x % 2 == 0) {
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(x-1));
        } else {
            System.out.println(s.charAt(0));
            System.out.println(s.charAt(x/2));
            System.out.println(s.charAt(x-1));
        }
    }

}
