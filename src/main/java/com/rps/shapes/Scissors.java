package com.rps.shapes;

public class Scissors implements Shape {


    @Override
    public boolean beats(Shape shape) {

        if (shape instanceof Rock) {
            return false;
        }
        if (shape instanceof Paper) {
            return true;
        }
        return false;

    }
}
