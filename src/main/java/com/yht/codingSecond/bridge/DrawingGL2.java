package com.yht.codingSecond.bridge;

public class DrawingGL2 implements Drawing {
    @Override
    public void drawLine() {
        System.out.println("使用类库2画线");
    }

    @Override
    public void drawCircle() {
        System.out.println("使用类库2画圆");
    }
}
