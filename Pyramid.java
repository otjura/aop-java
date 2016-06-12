//demo 5.2
//write program that prints a pyramid of height given in arg

class Pyramid {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        if(height > 0) {
            int spaces = height-1;
            int stars = 1;
            for(int i=0; i < height; i++) {
                for(int space=0; space < spaces; space++) {
                    System.out.print(" ");
                }
                for(int star=0; star < stars; star++) {
                    System.out.print("*");
                }
                System.out.println();
                spaces--;
                stars+=2;
            }    
            System.out.println(height+" stories high pyramid.");
        }
        
    }
}