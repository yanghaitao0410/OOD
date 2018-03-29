package com.yht.codingSecond.bridge;

public class Circle extends Shape {
    public Circle(Drawing drawing) {
        this.drawing = drawing;
    }

    @Override
    public void draw() {
        drawing.drawCircle();
    }
}
