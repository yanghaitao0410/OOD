package com.yht.codingSecond.logger;

public class FileLogger implements Logger {
    Logger nextLogger;
    int loggerLevel;

    public FileLogger(int loggerLevel) {
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
