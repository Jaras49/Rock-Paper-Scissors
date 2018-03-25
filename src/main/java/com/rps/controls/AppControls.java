package com.rps.controls;

import com.rps.Round;
import com.rps.players.ComputerAl;
import com.rps.players.Player;
import com.rps.shapes.*;
import com.rps.utils.InputReader;

public class AppControls {

    Player player;
    ComputerAl computerAl;
    Round round;
    private InputReader inputReader;

    public AppControls(){
        inputReader = new InputReader();
    }

    private void controlLoop(){
        boolean stop = false;

        printOptions();
        while(!stop){
            System.out.println("Time for " + player.getName() + " move");
            switch (MainOptions.createOption(inputReader.getInt())){
                case EXIT:
                    if(confirm(MainOptions.EXIT.name())){
                        stop = true;
                    }
                    break;
                case ROCK:
                    round.play(new Rock());
                   break;
                case PAPER:
                    round.play(new Paper());
                    break;
                case SCISSORS:
                    round.play(new Scissors());
                    break;
                case SPOCK:
                    round.play(new Spock());
                    break;
                case LIZARD:
                    round.play(new Lizard());
                    break;
                case RESTART:
                    if (confirm(MainOptions.RESTART.name()))
                        run();
                    break;
            }
            printOptions();
        }
    }

    public void run(){

        computerAl = new ComputerAl();
        System.out.println("Enter you name");
        player = new Player(inputReader.getInput());
        System.out.println("Enter desired number of rounds");
        round = new Round(player, computerAl, inputReader.getInt());
        controlLoop();
    }
    private boolean confirm(String string){

        System.out.println("Are you sure you want to " + string + " [y/n]");
        if(inputReader.getInput().equals("y"))
            return true;
        return false;
    }

    private void printOptions(){
        for (MainOptions o: MainOptions.values()){
            System.out.println(o);
        }
    }
}
