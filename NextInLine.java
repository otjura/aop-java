//demo 3.5
/* write three overloaded methods for integer, float and boolean, 
taking two values and returning third, 
and work like (1 3 5) (1.2 1.5 1.8) (true false true) */

class NextInLine {
    public static void main(String[] args) {
        System.out.println(nextOf(1,3));
        System.out.println(nextOf(1.2f,1.5f));
        System.out.println(nextOf(true,false));
    }

    public static int nextOf(int a, int b) {
        return b-a+b;
    }

    public static float nextOf(float a, float b) {
        return b-a+b;
    }

    public static boolean nextOf(boolean a, boolean b) {
        if(a == b) return b;
        return a;
    }
}