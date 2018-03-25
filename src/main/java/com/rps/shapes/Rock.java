package com.rps.shapes;

public class Rock implements Shape {


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
}
