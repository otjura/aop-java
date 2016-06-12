//demo 1.4
//parse first name and surname from whole name assuming just fname lname combo
import java.util.Scanner;

class NameParser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give whole name: ");
        String name = sc.nextLine();
        int delim = name.indexOf(' ');
        String fname = name.substring(0,delim);
        String lname = name.substring(delim+1);
        System.out.println("first name: "+fname);
        System.out.println("last name: "+lname);
        sc.close();
    }
}