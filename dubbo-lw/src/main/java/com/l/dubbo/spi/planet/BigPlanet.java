package com.l.dubbo.spi.planet;

public class BigPlanet implements Planet {
    private Planet planet;
    public BigPlanet(Planet planet) {
        this.planet = planet;
    }

    @Override
    public void getName() {
        System.out.println("big");
        planet.getName();
    }
}
