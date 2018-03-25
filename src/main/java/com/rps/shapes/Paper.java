package com.rps.shapes;

import java.util.Objects;

public class Paper implements Shape {

    private final String shapeName;

    public Paper()  {
        shapeName = "Paper";
        System.out.println(shapeName + "!!!!!!");
    }

    @Override
    public boolean beats(Shape shape) {

        if (shape instanceof Scissors || shape instanceof Lizard) {
            return false;
        }
        else if (shape instanceof Rock || shape instanceof Spock) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Paper paper = (Paper) o;
        return Objects.equals(shapeName, paper.shapeName);
    }
}
