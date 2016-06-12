//demo 5.5
//make a game of tic tac toe for two players
//that automatically ends if there is a winner

import java.util.Scanner;
import java.util.Arrays;

class TicTacToe {

    public static void main(String[] args) {
        System.out.println("Welcome to TicTacToe!");
        System.out.println("Player one to begin.");
        char[][] board = new char[3][3];
        int playerOne = 1;
        int playerTwo = 2;
        System.out.println(Arrays.deepToString(board));
        //game loop
        boolean gameFinished = false;
        do {
            showGame(board);
            insertTag(board, playerOne);
            checkGame();
            showGame(board);
            insertTag(board, playerTwo);
            checkGame();
        } while(gameFinished = false);
    }

    //insert tag on board depending on player
    private static void insertTag(char[][] board, int player) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Give position x: ");
        int xpos = sc.nextInt();
        System.out.print("Give position y: ");
        int ypos = sc.nextInt();
        sc.close();
        char tag = 'x';
        if(player != 1) tag = 'y';
        if(board[ypos][xpos] == ' ') {
            board[ypos][xpos] = tag;
        } else {
            System.out.println("There's "+board[ypos][xpos]+" already!");
        }
    }


    //shows game board state
    private static void showGame(char[][] board) {
        for(int i=0; i<board.length; i++) {
            System.out.println();
            for(int j=0; j<board[i].length; j++) {
                if(board[i][j] == 'x') {
                    System.out.print("X");
                } else if(board[i][j] == 'o') {
                    System.out.print("O");
                } else {
                    System.out.print("_");
                }
            }
        }
    }

    private static void checkGame() {
        System.out.println("dummy method");
    }
}
