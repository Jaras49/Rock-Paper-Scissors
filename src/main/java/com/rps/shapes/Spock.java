package com.rps.shapes;

import java.util.Objects;

public class Spock implements Shape {

    private final String shapeName;

    public Spock() {
        shapeName = "Spock";
        System.out.println(shapeName + "!!!!!!");
    }

    @Override
    public boolean beats(Shape shape) {

        if (shape instanceof Scissors || shape instanceof Rock) {
            return true;
        }
        if (shape instanceof Lizard || shape instanceof Paper){
            return false;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spock spock = (Spock) o;
        return Objects.equals(shapeName, spock.shapeName);
    }
}
