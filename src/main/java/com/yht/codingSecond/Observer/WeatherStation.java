package com.yht.codingSecond.Observer;

/**
 * 在当前类已经继承了某一个基类的情况下，可
 * 以通过私有内部类的方式继承Subject
 *      添加观察者
 *      数据变动时通知观察者
 */
public class WeatherStation {

    private InnerSubject innerSubject;

    public class InnerSubject extends Subject {}

    public WeatherStation() {
        innerSubject = new InnerSubject();
    }

    public void run() {
        WeatherData data = getLastWeatherData();
        innerSubject.notifyObservers(data);
    }

    public void addObserver(Observer observer) {
        innerSubject.addObserver(observer);
    }

    public WeatherData getLastWeatherData() {
        WeatherData data = new WeatherData(23, 95, 45);
        return data;
    }
}
