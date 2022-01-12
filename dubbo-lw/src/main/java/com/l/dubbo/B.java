package com.l.dubbo;

import com.alibaba.dubbo.common.extension.ExtensionLoader;
import com.l.dubbo.spi.planet.Planet;


public class B {
    public static void main(String[] args) {
        ExtensionLoader<Planet> extensionLoader = ExtensionLoader.getExtensionLoader(Planet.class);
        Planet planet = extensionLoader.getExtension("Earth");
        planet.getName();
        Planet planet1 = extensionLoader.getExtension("Venus");
        planet1.getName();
    }
}
