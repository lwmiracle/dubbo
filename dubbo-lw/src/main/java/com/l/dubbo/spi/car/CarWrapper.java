package com.l.dubbo.spi.car;

import com.alibaba.dubbo.common.URL;

public class CarWrapper implements Car {
    private Car car;
    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public void getColour(URL url) {
        System.out.println("before...");
        car.getColour(url);
        System.out.println("after...");
    }
}
