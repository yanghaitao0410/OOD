package com.yht.codingSecond.Observer;

public class WeatherData {

    private float temperature; //温度
    private float pressure; //气压
    private float humidity; // 湿度

    public WeatherData(float temperature, float pressure, float humidity) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getPressure() {
        return pressure;
    }

    public float getHumidity() {
        return humidity;
    }
}
