package com.l.dubbo.planet;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public class Earth implements Planet {
    @Override
    public void getName() {
        System.out.println("Earth");
    }
}
