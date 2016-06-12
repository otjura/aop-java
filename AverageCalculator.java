/* Demo 1.3
   Print average of two doubles and one integer from cli */

class AverageCalculator {
    public static void main(String[] args) {
        if(args.length != 3) {
            System.out.println("need three args");
        } else {
            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);
            double c = Double.parseDouble(args[2]);
            //int c = Integer.parseDouble(args[2]);
            System.out.println((a+b+c)/3);
        }
    }
}
