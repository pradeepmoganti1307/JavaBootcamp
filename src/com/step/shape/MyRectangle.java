package com.step.shape;

public class MyRectangle implements ClosedShape {
    private final int width;
    private final int height;

    public MyRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width * this.height;
    }

    @Override
    public int perimeter() {
        return 2*(this.width + this.height);
    }
}
