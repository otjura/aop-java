//demo 4.6
/* mastermind is game where one guesses scrambled numbers 1-6
game checks how many correct numbers in correct place player guessed.
write this game */

import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

class Mastermind {
    public static void main(String[] args) {
        System.out.println("Initializing game...");
        System.out.println("Welcome to Mastermind! Order of numbers 1 to 6.");
        System.out.println("Write them together. Don't separate with spaces.");
        System.out.println("You get 20 guesses.");
        String game = createGame();
        int turns = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Guess numbers: ");
            String guess = sc.nextLine();
            int corrects = checkGuess(guess,game);
            if(corrects == -1) {
                System.out.println("Too few numbers!");
            } else if(corrects == 6) {
                System.out.println("Congratulation!! You are winner!");
                turns = 20;
            } else {
                System.out.println("You have "+corrects+" correct.");
                turns++;
            }
        } while(turns < 20);
    }

    private static int checkGuess(String guess, String game) {
        int corrects = 0;
        if(guess.length() != game.length()) {
            corrects = -1;
        } else {
            for(int i=0; i < game.length(); i++) {
                if(game.charAt(i) == guess.charAt(i)) {
                    corrects++;
                }
            }
        }
        return corrects;
    }
    
    private static String createGame() {
        Random rnd = new Random();
        int[] numbers = {1,2,3,4,5,6};
        //Fisher-Yates shuffle
        for(int i=numbers.length-1; i > 0; i--) {
            int index = rnd.nextInt(i+1);
            int x = numbers[index];
            numbers[index] = numbers[i];
            numbers[i] = x;
        }
        String game = "";
        for(int number : numbers) {
            game = game + number;
        }
        System.out.println(game);
        return game;
    }
}