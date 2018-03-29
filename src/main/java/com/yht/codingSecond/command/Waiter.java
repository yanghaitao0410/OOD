package com.yht.codingSecond.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {

    List<Command> orders;

    public Waiter() {
        orders = new ArrayList<>();
    }

    public void addOrder(Command order) {
        orders.add(order);
    }

    public void sendOrders() {
        while(orders.size() > 0) {
            Command order = orders.remove(0);
            order.execute();
        }
    }

}
