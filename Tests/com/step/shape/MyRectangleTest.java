package com.step.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRectangleTest {
    @Test
    void calculateAreaOfRectangleHavingHeightMoreThanWidth() {
        MyRectangle myRectangle = new MyRectangle(1, 2);
        assertEquals(2, myRectangle.area());
    }

    @Test
    void calculatePerimeterOfRectangleHavingHeightMoreThanWidth() {
        MyRectangle myRectangle = new MyRectangle(1, 2);
        assertEquals(6, myRectangle.perimeter(), "the perimeter of rec with w:1, h:2");
    }

    @Test
    void calculatePerimeterOfRectangleHavingHeightLessThanWidth() {
        MyRectangle myRectangle = new MyRectangle(1, 2);
        assertEquals(6, myRectangle.perimeter(), "the perimeter of rec with w:1, h:2");

    }
}