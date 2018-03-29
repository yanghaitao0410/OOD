package com.yht.codingSecond.bridge;

public class DrawingGL1 implements Drawing {
    @Override
    public void drawLine() {
        System.out.println("使用类库1画线");
    }

    @Override
    public void drawCircle() {
        System.out.println("使用类库1画圆");
    }
}
