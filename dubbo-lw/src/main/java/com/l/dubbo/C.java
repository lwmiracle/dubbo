package com.l.dubbo;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.l.dubbo.spi.car.Driver;

import java.util.HashMap;
import java.util.Map;

public class C {
    public static void main(String[] args) {
        ExtensionLoader<Driver> extensionLoader = ExtensionLoader.getExtensionLoader(Driver.class);
        Driver driver = extensionLoader.getExtension("trucker");
        Map<String, String> map = new HashMap<>();
        map.put("carType", "red");
        URL url = new URL("", "", 0, map);
        driver.driveCar(url);
    }
}
