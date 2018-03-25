package com.rps.players;

import com.rps.shapes.Paper;
import com.rps.shapes.Rock;
import com.rps.shapes.Scissors;
import com.rps.shapes.Shape;

import java.util.ArrayList;
import java.util.List;
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
        int option = random.nextInt(3);

        switch (option){
            case 0:
                shape = new Rock();
                break;
            case 2:
                shape = new Paper();
                break;
            case 3:
                shape = new Scissors();
        }
        return shape;
    }
}
