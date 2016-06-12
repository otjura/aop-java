//demo 3.1
/* write program that randomizes integer which user needs to guess until it's 
correct. program needs to give hint less or more after each guess */
import java.util.Scanner;
import java.util.Random;

class GuessNumber {
    public static void main(String[] args) {
        boolean playing = true;
        do {
            theGame();
            playing = checkQuit();
        } while(playing);
    }

    public static boolean checkAnswer(int guess, int x) {
        if(guess == x) {
            System.out.println("you are winner!");
            return true;
        } else if(guess > x){
            System.out.println("smaller..");
            return false;
        } else if(guess < x) {
            System.out.println("larger..");
            return false;
        } else {
            return false;
        }
    }

    public static int inputAnswer() {
        Scanner sc = new Scanner(System.in);
        System.out.print("guess: ");
        int guess = sc.nextInt();
        return guess;
    }

    public static int GenerateRandom() {
        Random rnd = new Random();
        return rnd.nextInt(10)+1;
    }

    public static void theGame() {
        System.out.println("guess number between 1 and 10");
        int x = GenerateRandom();
        boolean correct = false;
        while(correct == false) {
            int a = inputAnswer();
            correct = checkAnswer(a, x);
        }
    }

    public static boolean checkQuit() {
        System.out.print("play again? (y/n): ");
        Scanner sca = new Scanner(System.in);
        String r = sca.nextLine();
        boolean play = false;
        if(r.equals("y")) {
            play = true;
        } 
        else if(r.equals("n")) {
            System.out.println("good bye");
            play = false;
        }
        else {
            System.out.println("pardon me?");
            checkQuit();
        }
        return play;
    }
}