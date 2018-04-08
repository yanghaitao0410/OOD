package com.yht.codingSecond.myjunit;

public class CalculatorTest extends TestCase {
    public CalculatorTest(String name) {
        super(name);
    }
    Calculator calculator = null;

    @Override
    protected void setUp() {
        calculator = new Calculator();
    }

    @Override
    protected void tearDown() {
        calculator = null;
    }

    public void testAdd() {
        calculator.add(10);
        assertEquals(10, calculator.getResult());
    }

    public void testSubtract() {
        calculator.add(10);
        calculator.substract(5);
        assertEquals(5, calculator.getResult());
    }
}
