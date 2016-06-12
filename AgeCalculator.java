/* Demo 1.2
   Prints user age in year 2013 */
  
import java.util.Scanner;

class AgeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give birthyear: ");
        int byear = sc.nextInt();
        System.out.println("you are "+(2013-byear)+" years old");
        sc.close();       
    }
}