package com.yht.codingSecond.Observer;

public class ForecastDisplay implements Observer {

    /**
     * 数据更新处理
     * 这里参数为Object是为了通用，为了别的具体类也可以扩展Observer接口
     * 对于Observer而言，不关注具体类型，只能是Object
     * 所以使用之前需要进行一下类型转换
     * @param subject
     * @param data
     */
    @Override
    public void update(Object subject, Object data) {
        WeatherStation weatherStation = (WeatherStation) subject;
        WeatherData weatherData = (WeatherData) data;

        //  TODO 进行实际业务处理
    }
}
