package com.yht.codingSecond;

import com.yht.codingSecond.bridge.*;
import org.junit.Test;

public class testBridge {

    @Test
    public void test() {
        Drawing drawing1 = new DrawingGL1();
        Drawing drawing2 = new DrawingGL2();

        Shape shape = new Rectangle(drawing1);
        shape.draw();

        Shape shape1 = new Circle(drawing2);
        shape1.draw();

    }
}
