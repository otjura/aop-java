//demo 2.4
/*modify user-given string like this: word >> -w-o-r-d- */
import java.util.Scanner;

class WordDash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give a word: ");
        String str = sc.nextLine();
        String mod = "";
        for(int i=0; i < str.length(); i++) {
            mod += "-"+str.charAt(i);
        }
        mod += "-";
        System.out.println(mod);
    }
}