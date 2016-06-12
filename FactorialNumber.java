/* Demo 3.6
   Write method that returns factorial of integer argument,
   for example if argument is 120 return 5 because 5! = 120,
   if number is not factorial of any integer return -1 */

class FactorialNumber {

    public static void main(String[] args) {
        System.out.println("Is "+factorialOf(120));
    }

    public static int factorialOf(int a) {
        int x = 1;
        int y = 1;
        int f = -1;
        if(a == 1) {
            f = 1;
        } else {
            do {
                y += y * x;
                x++;
                if((a/y == 1) && (a%y == 0)) {
                    f = x;
                    break;
                }
            } while(a/y >= 1);
        }
        return f;
    }
}