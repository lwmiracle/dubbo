package com.l.dubbo;



import com.l.dubbo.color.Color;

import java.util.Iterator;
import java.util.ServiceLoader;

public class A {
    public static void main(String[] args) {
        ServiceLoader<Color> serviceLoader = ServiceLoader.load(Color.class);
        Iterator<Color> iter = serviceLoader.iterator();
        while (iter.hasNext()) {
            Color colour = iter.next();
            colour.getColour();
        }
    }
}
