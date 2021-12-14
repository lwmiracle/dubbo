package com.l.dubbo.planet;

import com.alibaba.dubbo.common.extension.SPI;


@SPI
public interface Planet {
    void getName();
}
