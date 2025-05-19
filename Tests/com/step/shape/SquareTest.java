package com.step.shape;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void calculateAreaOfSquare() {
        Square square = new Square(1);
        assertEquals(1, square.area());
    }

    @Test
    void calculateAreaOfSquareHavingSide2() {
        Square square = new Square(2);
        assertEquals(4, square.area());
    }

    @Test
    void calculatePerimeterOfSquare() {
        Square square = new Square(1);
        assertEquals(4, square.perimeter());
    }

    @Test
    void calculatePerimeterOfSquareHavingSide2 () {
        Square square = new Square(2);
        assertEquals(8, square.perimeter());
    }
}