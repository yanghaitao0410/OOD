package com.yht.codingSecond.command;

public class OrderPorkCommand implements Command {
    private Cook cook;

    public OrderPorkCommand(Cook cook) {
        this.cook = cook;
    }


    @Override
    public void execute() {
        cook.cookPork();
    }
}
