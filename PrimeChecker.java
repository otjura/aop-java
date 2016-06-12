//demo 3.1
/* write public static method that returns true if parametre is prime */

class PrimeChecker {
    public static void main(String[] args) {
        System.out.println(isPrime(7));
        System.out.println(isPrime(8));
    }

    public static boolean isPrime(int x) {
        boolean prime = true;
        for(int i=2; i < x; i++) {
            if(x % i == 0) {
                prime = false;
            }
        }
        return prime;
    }
}