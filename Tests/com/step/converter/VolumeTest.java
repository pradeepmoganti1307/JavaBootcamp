package com.step.converter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void compareLitersAndGallons() {
        Volume fromLiters = Volume.createFrom(3.78, Units.LITERS);
        Volume fromGallons = Volume.createFrom(1, Units.GALLONS);
        assertEquals(fromGallons, fromLiters);
    }

    @Test
    void addLiters() {
        Volume liters1 = Volume.createFrom(1, Units.LITERS);
        Volume liters2 = Volume.createFrom(1, Units.LITERS);

        assertEquals(Volume.createFrom(2, Units.LITERS), liters1.add(liters2));
    }

    @Test
    void addLitersAndGallons() {
        Volume volInLiters = Volume.createFrom(3.78, Units.LITERS) ;
        Volume volInGallons = Volume.createFrom(1,Units.GALLONS);

        Volume actual = volInLiters.add(volInGallons);
        Volume expected = Volume.createFrom(7.56, Units.LITERS);

        assertEquals(expected, actual);
    }
}