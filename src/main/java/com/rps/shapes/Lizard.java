package com.rps.shapes;

import java.util.Objects;

public class Lizard implements Shape {

    private final String shapeName;

    public Lizard() {
        shapeName = "Lizard";
        System.out.println(shapeName + "!!!!!!");
    }

    @Override
    public boolean beats(Shape shape) {

        if(shape instanceof Spock || shape instanceof Paper){
            return true;
        }
        if(shape instanceof Rock || shape instanceof Scissors) {
            return false;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lizard lizard = (Lizard) o;
        return Objects.equals(shapeName, lizard.shapeName);
    }
}
