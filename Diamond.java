/* Demo 2.5
   Make a diamond on terminal. Get height as arg, check it's odd to proceed*/  

class Diamond {
    public static void main(String[] args) {
        if(args.length != 1) {
            System.out.println("need one arg");
        } else {
            int height = 0;
            try {
                height = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) { 
                System.out.println("odd integer required"); 
                System.exit(1);
            }
            if(height % 2 != 0) {
                int half = (height/2);
                int stars = 1;
                int lines = half;
                while(half >= 0) {
                    for(int i = 0; i < lines; i++) {
                        System.out.print("_");
                    }
                    for(int i=0; i < stars; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    stars += 2;
                    lines -= 1;
                    half--;
                } 
                half = (height/2)-1;
                lines +=1;
                stars -=2;
                while(half >= 0) {
                    lines += 1;
                    stars -= 2;
                    for(int i = 0; i < lines; i++) {
                        System.out.print("_");
                    }
                    for(int i = 0; i < stars; i++) {
                        System.out.print("*");
                    }
                    System.out.println();
                    half--;
                }
            } else {
                System.out.println("odd numbers only please");    
            }
        }
    }
}