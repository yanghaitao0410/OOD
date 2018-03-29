package com.yht.codingSecond.bridge;

public class Rectangle extends Shape {

    public Rectangle(Drawing drawing) {
        this.drawing = drawing;
    }
    @Override
    public void draw() {
        drawing.drawLine();
    }
}
