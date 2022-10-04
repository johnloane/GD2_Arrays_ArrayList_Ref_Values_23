package com.dkit.gd2.johnloane;

public class TicTacToeMain
{
    public static void main(String[] args)
    {
        TicTacToe myGame = new TicTacToe();
        boolean gameOver = false;

        //Play the game until someone wins or the board is full
        do
        {
            myGame.updateBoard();
            myGame.printBoard();

            //Print message if the game is over
            if(myGame.checkForWinner())
            {
                System.out.println("We have a winner");
                gameOver = true;
            }
            if(myGame.isBoardFull())
            {
                System.out.println("We have a draw");
                gameOver = true;
            }
            myGame.changePlayer();
        }while(gameOver == false);
    }
}
