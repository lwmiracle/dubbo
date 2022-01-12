package com.l.dubbo.spi.car;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.SPI;


@SPI
public class RedCar implements Car {
    @Override
    public void getColour(URL url) {
        System.out.println("RedCar");
    }
}
