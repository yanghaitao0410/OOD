package com.yht.codingSecond.command;

import org.junit.Test;

public class CommandTest {

    @Test
    public void commandTest() {
        Cook cook = new Cook();
        Waiter waiter = new Waiter();

        Command command1 = new OrderPorkCommand(cook);
        Command command2 = new OrderSteakCommand(cook);

        waiter.addOrder(command1);
        waiter.addOrder(command2);
        waiter.sendOrders();
    }
}
