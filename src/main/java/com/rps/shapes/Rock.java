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

        if (shape instanceof Paper) {
            return false;
        }
        if (shape instanceof Scissors) {
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
