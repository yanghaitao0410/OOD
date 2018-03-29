package com.yht.codingSecond.logger;

public interface Logger {

    public static final int DEBUG = 1;
    public static final int NOTICE = 2;
    public static final int ERR = 3;

    void message(String message, int loggerLevel);
    Logger setNext(Logger next);

}
