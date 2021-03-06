package com.yht.codingSecond.logger;

public class EmailLogger implements Logger {

    int loggerLevel;
    Logger nextLogger;

    public EmailLogger(int loggerLevel) {
        this.loggerLevel = loggerLevel;
    }


    @Override
    public void message(String message, int loggerLevel) {
        System.out.println(this.getClass().getName() + ":" + message + " ——loggerLevel = " + loggerLevel);
        if(loggerLevel > this.loggerLevel) {
            nextLogger.message(message, loggerLevel);
        }
    }

    @Override
    public Logger setNext(Logger nextLogger) {
        this.nextLogger = nextLogger;
        return this;
    }
}
