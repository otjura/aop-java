//demo 3.3
/* write method syt(x,y) that returns largest common nominator of x, y */

class LargestNominator {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        if(x < y) {
            System.out.println(syt(x, y));
        }
        if(x > y) {
            System.out.println(syt(y, x));
        }
    }

    public static int syt(int x, int y) { // assumes x < y
        int lcn = 1;
        for(int i = x; i > 0; i--) {
            if((y % i == 0) && (x % i == 0)) {
                lcn = i;
                break;
            }
        }
        return lcn;
    }
}