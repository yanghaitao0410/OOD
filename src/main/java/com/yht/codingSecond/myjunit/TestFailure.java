package com.yht.codingSecond.myjunit;

public class TestFailure {
    protected Test faildedTest;
    protected Throwable throwException;

    public TestFailure(Test faildedTest, Throwable throwable) {
        this.faildedTest = faildedTest;
        this.throwException = throwable;
    }
    public Test faildedTest() {
        return faildedTest;
    }

    public Throwable getThrowException() {
        return throwException;
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(faildedTest+ ": " + throwException.getMessage());
        return buffer.toString();
    }
}
