package com.l.dubbo.car;

import com.alibaba.dubbo.common.URL;

public class Trucker implements Driver {

    private Car car;
    public void setCar(Car car) {
        this.car = car;
    }
    @Override
    public void driveCar(URL url) {
        car.getColour(url);
    }
}
