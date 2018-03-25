package com.rps.players;

import com.rps.shapes.*;

import java.util.Random;

public final class ComputerAl {

    private final String name = "I`m an computer";

    public String getName() {
        return name;
    }

    public Shape getComputerMove(){

        Shape shape = null;
        Random random = new Random();
        System.out.println("Time for " + name + " move");
        int option = random.nextInt(5);

        switch (option){
            case 0:
                shape = new Rock();
                break;
            case 1:
                shape = new Paper();
                break;
            case 2:
                shape = new Scissors();
                break;
            case 3:
                shape = new Spock();
                break;
            case 4:
                shape = new Lizard();
                break;
        }
        return shape;
    }
}
