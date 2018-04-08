package com.yht.codingSecond.Observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        if(!this.observers.contains(observer)) {
            this.observers.add(observer);
        }
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for(Observer observer : observers) {
            observer.update(this, null);
        }
    }

    public void notifyObservers(Object data) {
        for(Observer observer : observers) {
            observer.update(this, data);
        }
    }

}
