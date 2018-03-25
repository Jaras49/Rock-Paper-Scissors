package com.rps;

import com.rps.players.ComputerAl;
import com.rps.players.Player;
import com.rps.shapes.Shape;

public class Round {

    private final Player player;
    private final ComputerAl computerAl;
    private final int MAX_ROUNDS;
    private int playerScore = 0;
    private int computerScore = 0;
    private int roundNumber = 0;

    public Round(Player player, ComputerAl computerAl, int rounds){
        this.player = player;
        this.computerAl = computerAl;
        this.MAX_ROUNDS = rounds;
    }

    public void play(Shape shape) {

        roundNumber++;
        check();
        Shape alShape = computerAl.getComputerMove();

        if (shape.equals(alShape)){
            draw();
        }
        else if (shape.beats(alShape)){
            playerWins();
        }
        else
            computerWins();
    }

    private void draw(){
        playerScore++;
        computerScore++;
        System.out.println("Draw");
        System.out.println(player.getName() + " score: " + playerScore);
        System.out.println(computerAl.getName() + " score: " + computerScore);
    }

    private void playerWins(){
        playerScore++;
        System.out.println("Player wins this round");
        System.out.println(player.getName() + " score: " + playerScore);
        System.out.println(computerAl.getName() + " score: " + computerScore);
    }

    private void computerWins(){
        computerScore++;
        System.out.println("Computer wins this round");
        System.out.println(player.getName() + " score: " + playerScore);
        System.out.println(computerAl.getName() + " score: " + computerScore);
    }

    private void check(){
        if (roundNumber == MAX_ROUNDS){
            if ( playerScore > computerScore){
                System.out.println(player.getName() + " won the game");
                System.exit(0);
            }
            else if (playerScore < computerScore){
                System.out.println(computerAl.getName() + " won the game");
                System.exit(0);
            }
            else if (playerScore == computerScore){
                System.out.println("Game finished with a draw");
                System.exit(0);
            }
        }
    }
}
