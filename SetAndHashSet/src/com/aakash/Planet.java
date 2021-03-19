package com.aakash;

public class Planet extends HeavenlyBody {

    public Planet(String name, double orbitalPeriod) {
        super(name, orbitalPeriod, BodyTypes.PLANET);
    }

    @Override
    public boolean addSattelite(HeavenlyBody moon) {
        if (moon.getKey().getBodyTypes() == BodyTypes.ASTEROID.MOON) {
            return super.addSattelite(moon);
        } else {
            return false;
        }
    }


}
