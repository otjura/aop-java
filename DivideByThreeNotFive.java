/* Demo 5.1
   Write program that prints all numbers between 100 and 200 
   that are dividable by three but not by five. */ 

class DivideByThreeNotFive {
    public static void main(String[] args) {
        for(int i=100; i <= 200; i++) {
            if((i % 3 == 0) && (i % 5 != 0)) {
                System.out.println(i);
            }
        }
    }
}