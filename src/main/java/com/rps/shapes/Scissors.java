package com.rps.shapes;

import java.util.Objects;

public class Scissors implements Shape {

    private final String shapeName;

    public Scissors(){
        this.shapeName = "Scissors";
        System.out.println(shapeName + "!!!!!!");
    }

    @Override
    public boolean beats(Shape shape) {

        if (shape instanceof Rock || shape instanceof Spock) {
            return false;
        }
        if (shape instanceof Paper || shape instanceof Lizard) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Scissors scissors = (Scissors) o;
        return Objects.equals(shapeName, scissors.shapeName);
    }
}
