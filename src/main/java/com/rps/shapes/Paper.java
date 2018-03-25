package com.rps.shapes;

public class Paper implements Shape {


    @Override
    public boolean beats(Shape shape) {

        if (shape instanceof Scissors) {
            return false;
        }
        if (shape instanceof Rock) {
            return true;
        }
        return false;
    }
}
