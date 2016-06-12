//demo 4.5
/* write method that gets 3x3 matrix representing end result of tic-tac-toe,
that tells which of the players won or if the game is even */

import java.util.Random;

class TicTacToeChecker {
    public static void main(String[] args) {
        //char[][] thegame = randomGame();
        char[][] = testgame{{x,o,x}{o,x,o}{x,o,x}};
        int result = checkGameState(testgame);
    }

    public static int checkGameState(arr[][] char) {
        if(arr[0][0] )
    }

    //@TODO miten vitussa tähänkin sais 5*x ja 4*o ???
    public static char[][] randomGame() {
        char[] tokens = ['x','x','x','x','x','o','o','o','o'];
        String stoks = "xxxxxoooo"; // 5*x 4*o as in end game
        char[][] board = char[3][3]; //3x3
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[].length; j++) {

            }
        }
    }

    public static void checkResult(int result) {
        if(result == 0) {
            System.out.println("Game is tied!");
        }
        else if(result == 1) {
            System.out.println("X won the game!");
        }
        else if(result == 2) {
            System.out.println("O won the game!");
        } else {
            System.out.println("ERROR: This shouldn't be happening");
        }
    }
}
