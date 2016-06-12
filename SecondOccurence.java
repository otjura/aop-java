//demo 2.2
/*print index of second occurence of first arg in second arg, 
if not found print error*/

class SecondOccurence {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("needs two args");
        } else {
            int first = args[0].length()+args[1].indexOf(args[0]);
            int second = args[1].indexOf(args[0], first); //-1 on fail to find
            if(second == -1) {
                System.out.println("no second occurence, but first one was at "
                    +first);
            } else {
                System.out.println(second);
            } 
        }
    }
}
           