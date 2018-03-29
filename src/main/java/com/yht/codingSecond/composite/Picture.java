package com.yht.codingSecond.composite;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Picture implements Shape {
    List<Shape> shapes = new ArrayList<>();

    @Override
    public void draw() {
        for(Shape shape : shapes) {
            shape.draw();
        }
    }

    public void add(Shape shape) {
        shapes.add(shape);
    }

    @Test
    public void test(){
        Picture aPicture = new Picture();
        aPicture.add(new Line());
        aPicture.add(new Rectangle());
        Picture p = new Picture();
        p.add(new Text());
        p.add(new Line());
        aPicture.add(p);

        aPicture.draw();
    }
}














