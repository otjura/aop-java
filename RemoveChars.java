//demo 2.3
/*give strings a and b, 
remove all chars defined in b from a, 
print changed string a*/
import java.util.Scanner;

class RemoveChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give string: ");
        String str = sc.nextLine();
        System.out.print("what to remove: ");
        String rm = sc.nextLine();
        sc.close();
        for(int i=0; i < rm.length(); i++) {
            String x = rm.charAt(i)+"";
            str = str.replace(x, "");
        }
        System.out.println(str);
    }
}