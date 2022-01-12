package com.l.dubbo.spi.planet;

import com.alibaba.dubbo.common.extension.SPI;

@SPI
public class Venus implements Planet {
    @Override
    public void getName() {
        System.out.println("Venus");
    }
}
