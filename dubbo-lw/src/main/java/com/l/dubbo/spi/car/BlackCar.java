package com.l.dubbo.spi.car;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.SPI;

@SPI
public class BlackCar implements Car {
    @Override
    public void getColour(URL url) {
        System.out.println("BlackCar");
    }
}
