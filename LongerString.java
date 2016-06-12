//demo 1.1
//prints longer string of two cli args

class LongerString {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("need two args, gave "+args.length);
        } else if(args[0].length() > args[1].length()) {
            System.out.println(args[0]);
        } else if(args[1].length() > args[0].length()) {
            System.out.println(args[1]);
        } else {
            System.out.println(args[0]+" is as long as "+args[1]);
        }
    }
}