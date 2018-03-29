package com.yht.codingSecond.command;

public class OrderSteakCommand implements Command {
    private Cook cook;

    public OrderSteakCommand (Cook cook) {
        this.cook = cook;
    }

    @Override
    public void execute() {
        cook.cookSteak();
    }
}
