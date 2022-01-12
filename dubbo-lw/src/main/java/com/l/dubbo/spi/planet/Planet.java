package com.l.dubbo.spi.planet;

import com.alibaba.dubbo.common.extension.SPI;


@SPI
public interface Planet {
    void getName();
}
