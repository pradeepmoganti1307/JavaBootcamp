package com.step.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyRectangleTest {
    @Test
    void area() {
        MyRectangle myRectangle = new MyRectangle(1, 2);
        assertEquals(2, myRectangle.area(), "the area of a rec with w:1, h:2");
    }

    @Test
    void perimeter() {
        MyRectangle myRectangle = new MyRectangle(1, 2);
        assertEquals(6, myRectangle.perimeter());
    }
}