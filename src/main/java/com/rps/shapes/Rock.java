package com.rps.shapes;

import java.util.Objects;

public class Rock implements Shape {

    private final String shapeName;

    public Rock(){
        this.shapeName = "Rock";
        System.out.println(shapeName + "!!!!!!");
    }

    @Override
    public boolean beats(Shape shape) {

        if (shape instanceof Paper || shape instanceof Spock) {
            return false;
        }
        else if (shape instanceof Scissors || shape instanceof Lizard) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rock rock = (Rock) o;
        return Objects.equals(shapeName, rock.shapeName);
    }
}
